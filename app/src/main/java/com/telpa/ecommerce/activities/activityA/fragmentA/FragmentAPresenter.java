package com.telpa.ecommerce.activities.activityA.fragmentA;

import android.app.Application;
import android.view.View;

import com.telpa.ecommerce.ECommerceApp;
import com.telpa.ecommerce.interfaces.IBasket;
import com.telpa.ecommerce.interfaces.ICategory;
import com.telpa.ecommerce.interfaces.IProduct;
import com.telpa.ecommerce.models.BasketItem;
import com.telpa.ecommerce.models.Category;
import com.telpa.ecommerce.models.Product;
import com.telpa.ecommerce.network.APIService;

import java.util.ArrayList;

import javax.inject.Inject;

/**
 * Created by Mert on 16.08.2016.
 */
public class FragmentAPresenter implements IFragmentAPresenter {
    @Inject
    APIService service;
    @Inject
    ICategory category;
    @Inject
    IProduct IProduct;
    @Inject
    IBasket basket;



    private IFragmentAView view;
    private int categoryID;
    Product featured;
    ArrayList<Category> subCategories;
    int customerID;

    public FragmentAPresenter(FragmentAView fragmentAView, Application application) {
        ((ECommerceApp) application).getComponent().inject(this);
        customerID=0;
        this.view = fragmentAView;
    }


    @Override
    public void getTopProduct(Category category, View view) {
        featured = IProduct.getFeatured(category.getID());
        categoryID=category.getID();
        this.view.setTopCategoryProduct(featured);
    }

    @Override
    public void getSubCategories(View view) {
        subCategories = new ArrayList<>();
        subCategories = category.getCategories(categoryID);
        this.view.setOtherSubCategories(subCategories);
    }

    @Override
    public ArrayList<Integer> getFavorites(int customerID) {
        return IProduct.getFavorites(customerID);
    }

    @Override
    public void removeFavorites(int customerID, int productID) {
        IProduct.removeFavorites(customerID,productID);
    }

    @Override
    public void addFavorites(int customerID, int productID) {
        IProduct.addFavorites(customerID,productID);
    }

    @Override
    public boolean isInBasket(int productID) {
        ArrayList<BasketItem> basketItems = basket.getBasket(customerID);
        ArrayList<Integer> products = new ArrayList<>();
        for (BasketItem i : basketItems)
            products.add(i.getProduct().getID());
        if (products.contains(productID))
            return true;
        else
            return false;
    }

    @Override
    public void addBasket(int customerID, BasketItem basketItem) {
        basket.addBasket(customerID,basketItem);
    }


}
