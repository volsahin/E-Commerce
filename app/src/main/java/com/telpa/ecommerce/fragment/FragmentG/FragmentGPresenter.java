package com.telpa.ecommerce.fragment.FragmentG;

import android.app.Application;
import android.view.View;

import com.telpa.ecommerce.ECommerceApp;
import com.telpa.ecommerce.interfaces.ICategory;
import com.telpa.ecommerce.interfaces.IProduct;
import com.telpa.ecommerce.models.Category;
import com.telpa.ecommerce.network.APIService;
import java.util.ArrayList;

import javax.inject.Inject;


/**
 * Created by Gizem İlgar on 15.8.2016.
 */

public class FragmentGPresenter implements IFragmentGPresenter {
    @Inject
    APIService service;
    @Inject
    ICategory category;
    @Inject
    IProduct IProduct;

    private IFragmentGView view;
    private int categoryID;
    ArrayList<Category> subCategories;

    public FragmentGPresenter(FragmentGView fragmentGView, Application application) {
        ((ECommerceApp) application).getComponent().inject(this);
        this.view = fragmentGView;
    }

    @Override
    public void loadView(Category category) {

        this.categoryID = category.getID();
    }


    @Override
    public void getSubCategories(View view) {
        subCategories = new ArrayList<>();
        subCategories = category.getCategories(0);
        this.view.setOtherSubCategories(subCategories);
    }


}
