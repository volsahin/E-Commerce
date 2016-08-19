package com.telpa.ecommerce.activities.activityB;


import android.app.Application;

import com.telpa.ecommerce.ECommerceApp;
import com.telpa.ecommerce.interfaces.ICategory;
import com.telpa.ecommerce.network.APIService;

import javax.inject.Inject;

/**
 * Created by SAMSUNGNB on 12.08.2016.
 */

public class ScreenBPresenterImpl implements IScreenBPresenter {
    @Inject
    APIService service;
    @Inject
    ICategory category;

    ScreenB view;

    public ScreenBPresenterImpl(ScreenB view, Application application) {
        ((ECommerceApp) application).getComponent().inject(this);
        this.view = view;

    }

    @Override
    public void getCategories() {

        view.fillFragments(category.getCategories(0));
    }

    @Override
    public void setTitle() {
        view.setTitle("My Store B");
    }
}
