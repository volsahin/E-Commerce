package com.telpa.ecommerce.activities.activityK;

import android.app.Application;

import com.telpa.ecommerce.ECommerceApp;
import com.telpa.ecommerce.interfaces.IBasket;
import com.telpa.ecommerce.interfaces.ICategory;
import com.telpa.ecommerce.interfaces.IProduct;
import com.telpa.ecommerce.models.BasketItem;
import com.telpa.ecommerce.models.Comment;
import com.telpa.ecommerce.network.APIService;

import java.util.ArrayList;

import javax.inject.Inject;

/**
 * Created by root on 15.08.2016.
 */
public class ScreenKPresenter implements IScreenKPresenter{

    IScreenKView view;
    @Inject
    IBasket basket;
    @Inject
    APIService service;
    @Inject
    IProduct product;
    @Inject
    ICategory category;

    public ScreenKPresenter(IScreenKView view,Application application) {
        this.view = view;
        ((ECommerceApp) application).getComponent().inject(this);
    }

    @Override
    public ArrayList<Comment> fillList() {
        ArrayList<Comment>comments=new ArrayList<>();
        comments=product.getComments(1);
        return comments;
    }
    @Override
    public ArrayList<BasketItem> basketitem() {
        ArrayList<BasketItem>basketitem=new ArrayList<>();
        BasketItem b=new BasketItem();
        b.setNumber(10);
        b.setVariant1(5);
        b.setVariant2(4);
        basketitem.add(b);
        return basketitem;
    }
    @Override
    public int favoritem() {
       int favoritem=5;
        return favoritem;
    }}
