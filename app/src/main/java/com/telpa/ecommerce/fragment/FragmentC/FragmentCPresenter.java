package com.telpa.ecommerce.fragment.FragmentC;

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
public class FragmentCPresenter implements IFragmentCPresenter {
    @Inject
    APIService service;
    @Inject
    ICategory category;
    @Inject
    IProduct IProduct;

    private IFragmentCView view;
    private int categoryID;
    ArrayList<Category> subCategories;

    public FragmentCPresenter(FragmentCView fragmentCView, Application application) {
        ((ECommerceApp) application).getComponent().inject(this);
        this.view = fragmentCView;
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
