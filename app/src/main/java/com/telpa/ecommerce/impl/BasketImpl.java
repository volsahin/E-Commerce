package com.telpa.ecommerce.impl;

import com.telpa.ecommerce.interfaces.IBasket;
import com.telpa.ecommerce.models.BasketItem;
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
        return null;
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
