package com.telpa.ecommerce.activities.activityI;

import android.app.Application;
import android.view.View;

import com.telpa.ecommerce.ECommerceApp;
import com.telpa.ecommerce.interfaces.IProduct;
import com.telpa.ecommerce.models.Product;

import java.util.ArrayList;

import javax.inject.Inject;

/**
 * Created by SAMSUNGNB on 16.08.2016.
 */
public class ScreenIPresenterImpl implements IScreenIPresenter {
    @Inject
    IProduct product;

    private ScreenI view;
    private Application application;

    public ScreenIPresenterImpl(ScreenI view, Application application) {
        this.view = view;
        this.application = application;
        ((ECommerceApp) application).getComponent().inject(this);
    }


    @Override
    public void getProducts(int categoryID) {
        ArrayList<Product> products=product.getProducts(categoryID);
        view.loadProducts(products);

    }
}
