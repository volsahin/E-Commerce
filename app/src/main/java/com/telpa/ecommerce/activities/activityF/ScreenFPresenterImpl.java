package com.telpa.ecommerce.activities.activityF;


import android.app.Application;

import com.telpa.ecommerce.ECommerceApp;
import com.telpa.ecommerce.interfaces.ICategory;
import com.telpa.ecommerce.models.Category;
import com.telpa.ecommerce.network.APIService;

import java.util.ArrayList;

import javax.inject.Inject;

/**
 * Created by Gizem İlgar on 16.8.2016.
 */

public class ScreenFPresenterImpl implements IScreenFPresenter {
    @Inject
    APIService service;
    @Inject
    ICategory category;

    ScreenF view;

    public ScreenFPresenterImpl(ScreenF view, Application application) {
        ((ECommerceApp) application).getComponent().inject(this);
        this.view = view;

    }

    @Override
    public void getCategories() {
        ArrayList<Category> categories = category.getCategories(0);
        view.fillFragments(categories);

    }
}
