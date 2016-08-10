package com.telpa.ecommerce.impl;

import com.telpa.ecommerce.interfaces.IBasket;
import com.telpa.ecommerce.models.BasketItem;
import com.telpa.ecommerce.models.Product;
import com.telpa.ecommerce.network.APIService;

import java.util.ArrayList;
import java.util.HashMap;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by SAMSUNGNB on 1.08.2016.
 */



public class BasketImpl implements IBasket {
    @Inject
    APIService service;


    @Override
    public ArrayList<BasketItem> getBasket(int customerID) {
        ArrayList<BasketItem> basketItems=new ArrayList<>();
        BasketItem item=new BasketItem();
        item.setNumber(5);
        item.setVariant1(2);
        item.setVariant2(3);

        ArrayList<String> url = new ArrayList<String>();
        url.add("http://www.batmanda.com/rsm.batmanda/1970335733.jpg");
        Product b = new Product();
        b.setName("BasketÜrünü");
        b.setID(1);
        b.setCategoryID(1);
        b.setDescripton("");
        b.setHighResImageUrls(url);
        b.setLowResImageUrls(url);
        b.setPrice(30);
        b.setRating(2);
        b.setRating(3);

        item.setProduct(b);

        basketItems.add(item);
        basketItems.add(item);
        basketItems.add(item);
        basketItems.add(item);


        return basketItems;
    }

    @Override
    public boolean addBasket(int customerID, BasketItem basketItem) {
        return false;
    }

    @Override
    public boolean checkOut(int customerID, ArrayList<BasketItem> basketItems) {
        return false;
    }
}
