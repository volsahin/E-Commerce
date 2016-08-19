package com.telpa.ecommerce.activities.activityD;

import android.app.Application;

import com.telpa.ecommerce.ECommerceApp;
import com.telpa.ecommerce.activities.activityB.ScreenB;
import com.telpa.ecommerce.activities.activityC.ScreenC;
import com.telpa.ecommerce.interfaces.ICategory;
import com.telpa.ecommerce.models.Category;
import com.telpa.ecommerce.network.APIService;

import java.util.ArrayList;

import javax.inject.Inject;

/**
 * Created by Mert on 16.08.2016.
 */

public class ScreenDPresenterImpl implements IScreenDPresenter {

    @Inject
    APIService service;
    @Inject
    ICategory category;

    ScreenD view;

    public ScreenDPresenterImpl( ScreenD view, Application application) {
        this.view = view;
        ((ECommerceApp) application).getComponent().inject(this);

    }


    @Override
    public void getCategories() {
        ArrayList<Category> categories = category.getCategories(0);
        view.fillFragments(categories);

    }
}