package com.telpa.ecommerce.activities.activityB.fragmentB;

import android.app.Application;
import android.view.View;
import com.telpa.ecommerce.ECommerceApp;
import com.telpa.ecommerce.interfaces.ICategory;
import com.telpa.ecommerce.interfaces.IProduct;
import com.telpa.ecommerce.models.Category;
import com.telpa.ecommerce.models.Product;
import com.telpa.ecommerce.network.APIService;
import java.util.ArrayList;
import javax.inject.Inject;


/**
 * Created by SAMSUNGNB on 12.08.2016.
 */
public class FragmentBPresenter implements IFragmentBPresenter {
    @Inject
    APIService service;
    @Inject
    ICategory category;
    @Inject
    IProduct IProduct;

    private IFragmentBView view;
    private int categoryID;
    ArrayList<Product> products;
    ArrayList<Category> subCategories;

    public FragmentBPresenter(FragmentBView fragmentBView, Application application) {
        ((ECommerceApp) application).getComponent().inject(this);
        this.view = fragmentBView;
    }

    @Override
    public void loadView(Category category) {

        this.categoryID = category.getID();
    }

    @Override
    public void getTopSubCategory(View view) {
        Category topSubCategory = category.getTopSubCategory(categoryID);
        this.view.setTopCategoryTitle(topSubCategory.getName());
        category.getCategories(0);
        getTopProducts(topSubCategory, view);
    }

    @Override
    public void getTopProducts(Category category, View view) {
        products = IProduct.getProducts(0);
        this.view.setTopCategoryProducts(products);
        this.view.onSuccess();
    }

    @Override
    public void getSubCategories(View view) {
        subCategories = new ArrayList<>();
        subCategories = category.getCategories(0);
        this.view.setOtherSubCategories(subCategories);
    }


}
