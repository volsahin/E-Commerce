package com.telpa.ecommerce.activities.activityA;

import android.app.Application;

import com.telpa.ecommerce.ECommerceApp;
import com.telpa.ecommerce.interfaces.ICategory;
import com.telpa.ecommerce.models.Category;
import com.telpa.ecommerce.network.APIService;
import java.util.ArrayList;
import javax.inject.Inject;


/**
 * Created by Gizem İlgar on 12.8.2016.
 */

public class ScreenAPresenterImpl implements IScreenAPresenter {
    @Inject
    APIService service;
    @Inject
    ICategory category;


    ScreenA view;

    public ScreenAPresenterImpl(ScreenA view, Application application) {


        this.view = view;
        ((ECommerceApp) application).getComponent().inject(this);
    }



    @Override
    public void getCategories() {
        ArrayList<Category> categories = category.getCategories(0);
        view.fillFragments(categories);

    }
}
