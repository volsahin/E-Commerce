package com.telpa.ecommerce.activities.activityH;

import android.app.Application;

import com.telpa.ecommerce.ECommerceApp;
import com.telpa.ecommerce.interfaces.IBasket;
import com.telpa.ecommerce.interfaces.ICategory;
import com.telpa.ecommerce.interfaces.IProduct;
import com.telpa.ecommerce.models.Category;

import java.util.ArrayList;

import javax.inject.Inject;

/**
 * Created by root on 16.08.2016.
 */
public class ScreenHPresenter implements IScreenHPresenter{
    IScreenHView view;
    @Inject
    IBasket basket;
    @Inject
    IProduct product;
    @Inject
    ICategory category;
    public ScreenHPresenter(IScreenHView view,Application application) {
        this.view = view;
        ((ECommerceApp) application).getComponent().inject(this);
    }

    @Override
    public ArrayList<Category> categories() {

        ArrayList<Integer> list=new ArrayList<Integer>();
        ArrayList<String> url=new ArrayList<String>();
        url.add("http://www.batmanda.com/rsm.batmanda/1970335733.jpg");
        list.add(2);
        ArrayList<Category> categories=new ArrayList<>();
        Category a=new Category();
        a.setName("Category");
        a.setHighResImageUrl("http://www.batmanda.com/rsm.batmanda/1970335733.jpg");
        a.setLowResImageUrl("");
        a.setID(1);
        a.setNumOfProduct(2);
        a.setParentID(0);
        categories.add(a);
        categories.add(a);
        categories.add(a);

        return categories;
    }
}
