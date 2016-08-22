package com.telpa.ecommerce.activities.activityB;


import android.app.Application;
import android.view.LayoutInflater;
import android.view.View;

import com.telpa.ecommerce.ECommerceApp;
import com.telpa.ecommerce.R;
import com.telpa.ecommerce.activities.activityB.fragmentB.FragmentBView;
import com.telpa.ecommerce.interfaces.ICategory;
import com.telpa.ecommerce.models.Category;
import com.telpa.ecommerce.network.APIService;
import com.telpa.ecommerce.utils.TabHelper;

import java.util.ArrayList;
import java.util.List;

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
    Application application;
    public ScreenBPresenterImpl(ScreenB view, Application application) {
        ((ECommerceApp) application).getComponent().inject(this);
        this.view = view;
        this.application = application;
    }

    @Override
    public void setTitle() {
        view.setTitle("My Store B");
    }


    @Override
    public void getCategories(LayoutInflater layoutInflater) {
        View v;
        List<TabHelper> tabHelperList = new ArrayList<>();
        for (Category i : category.getCategories(0)) {
            v = layoutInflater.inflate(R.layout.fragment_b_tab1, null);
            FragmentBView tab = new FragmentBView();
            tab.setView(v);
            tab.setCategory(i);
            tab.setTitle(i.getName());
            tab.setApplication(application);
            tabHelperList.add(tab);
        }
        view.fillFragments(tabHelperList);
    }
}
