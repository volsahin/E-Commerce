package com.telpa.ecommerce.activities.ActivityB;


import android.app.Application;

import com.telpa.ecommerce.ECommerceApp;
import com.telpa.ecommerce.interfaces.ICategory;
import com.telpa.ecommerce.models.Category;
import com.telpa.ecommerce.network.APIService;

import java.util.ArrayList;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

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
        ArrayList<Category> categories = new ArrayList<>();

        categories = category.getCategories(0);

        view.fillFragments(categories);
    }
}
