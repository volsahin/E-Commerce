package com.telpa.ecommerce.activities.activityA;

import android.app.Application;
import android.view.LayoutInflater;
import android.view.View;

import com.telpa.ecommerce.ECommerceApp;
import com.telpa.ecommerce.R;
import com.telpa.ecommerce.activities.activityA.fragmentA.FragmentAView;
import com.telpa.ecommerce.interfaces.ICategory;
import com.telpa.ecommerce.models.Category;
import com.telpa.ecommerce.network.APIService;
import com.telpa.ecommerce.utils.TabHelper;

import java.util.ArrayList;
import java.util.List;

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
    Application application;

    public ScreenAPresenterImpl(ScreenA view, Application application) {
        this.view = view;
        this.application = application;
        ((ECommerceApp) application).getComponent().inject(this);
    }


    @Override
    public void setBaseItems() {
        view.setBaseItems();
    }

    @Override
    public void getCategories(LayoutInflater l) {
        ArrayList<Category> categories = category.getCategories(0);
        List<TabHelper> tabHelperList = new ArrayList<>();
        View v;

        for (Category i : categories) {
            v = l.inflate(R.layout.fragment_a_tab1, null);
            FragmentAView tab = new FragmentAView();
            tab.setView(v);
            tab.setCategory(i);
            tab.setTitle(i.getName());
            tab.setApplication(application);
            tabHelperList.add(tab);
        }
        view.fCreateTabMenu(tabHelperList);
    }

    @Override
    public void setTitle() {
        view.setTitle("My Store A");
    }
}
