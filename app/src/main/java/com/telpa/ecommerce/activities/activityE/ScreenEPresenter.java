package com.telpa.ecommerce.activities.activityE;

import android.app.Application;

import com.telpa.ecommerce.ECommerceApp;
import com.telpa.ecommerce.interfaces.ICategory;
import com.telpa.ecommerce.models.Category;
import com.telpa.ecommerce.network.APIService;

import java.util.ArrayList;

import javax.inject.Inject;

/**
 * Created by root on 16.08.2016.
 */
public class ScreenEPresenter implements IscreenEPresenter{
    @Inject
    APIService service;
    @Inject
    ICategory category;

    IscreenEView view;
    public ScreenEPresenter(IscreenEView view, Application application) {
        this.view = view;
        ((ECommerceApp) application).getComponent().inject(this);
    }
    @Override
    public ArrayList<Category> categories() {

        ArrayList<Category> categories = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        categories=category.getCategories(0);
        return categories;
}
        }
