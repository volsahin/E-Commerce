package com.telpa.ecommerce.activities.activityD.fragmentD;

import android.app.Application;
import android.view.View;

import com.telpa.ecommerce.ECommerceApp;
import com.telpa.ecommerce.activities.activityB.fragmentB.IFragmentBView;
import com.telpa.ecommerce.interfaces.ICategory;
import com.telpa.ecommerce.interfaces.IProduct;
import com.telpa.ecommerce.models.Product;
import com.telpa.ecommerce.network.APIService;

import java.util.ArrayList;

import javax.inject.Inject;

/**
 * Created by Mert on 16.08.2016.
 */
public class FragmentDPresenter implements IFragmentDPresenter{

    @Inject
    APIService service;
    @Inject
    IProduct IProduct;
    @Inject
    ICategory category;

    private IFragmentDView view;

    public FragmentDPresenter(FragmentDView fragmentDView, Application application) {
        ((ECommerceApp) application).getComponent().inject(this);
        this.view = fragmentDView;
    }



    @Override
    public void getProducts(int categoryID) {
        ArrayList<Product> products=IProduct.getProducts(categoryID);
        view.fillProducts(products);

    }
}
