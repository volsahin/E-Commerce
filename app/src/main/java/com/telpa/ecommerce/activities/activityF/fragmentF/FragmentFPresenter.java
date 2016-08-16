package com.telpa.ecommerce.activities.activityF.fragmentF;

import android.app.Application;
import android.view.View;

import com.telpa.ecommerce.ECommerceApp;
import com.telpa.ecommerce.R;
import com.telpa.ecommerce.interfaces.ICategory;
import com.telpa.ecommerce.interfaces.IProduct;
import com.telpa.ecommerce.models.Category;
import com.telpa.ecommerce.models.Product;
import com.telpa.ecommerce.network.APIService;

import java.util.ArrayList;

import javax.inject.Inject;


/**
 * Created by Gizem İlgar on 16.8.2016.
 */
public class FragmentFPresenter implements IFragmentFPresenter {
    @Inject
    APIService service;
    @Inject
    ICategory category;
    @Inject
    IProduct IProduct;

    private IFragmentFView view;
    private int categoryID;
    ArrayList<Product> products;
    ArrayList<Category> subCategories;

    public FragmentFPresenter(FragmentFView fragmentFView, Application application) {
        ((ECommerceApp) application).getComponent().inject(this);
        this.view = fragmentFView;
    }

    @Override
    public void loadView(Category category) {
        this.categoryID = category.getID();
    }

    @Override
    public void getTopProduct(Category category) {
        Product topProduct;
        topProduct = IProduct.getFeatured(category.getID());
        view.setTopProduct(topProduct);
    }


    @Override
    public void getProduct(Category category) {
        ArrayList<Product> products;
        products = IProduct.getProducts(0);
        view.setProducts(products);
    }

    @Override
    public void isFavorite(int customerID, Product product) {
        ArrayList<Integer> favorites = IProduct.getFavorites(customerID);
        if (favorites.contains(product))
            view.setFavorite(true);
        else
            view.setFavorite(false);


    }


}
