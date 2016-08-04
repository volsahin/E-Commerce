package com.telpa.ecommerce.impl;

import com.telpa.ecommerce.interfaces.IBasket;

import java.util.HashMap;

/**
 * Created by SAMSUNGNB on 1.08.2016.
 */

public class BasketModule implements IBasket {
    @Override
    public HashMap<Integer, Integer> getBasket(int customerID) {
        return null;
    }


    @Override
    public void addBasket(int customerID, int productID, int number, int variant1, int variant2) {

    }

    @Override
    public void checkOut(int customerID,HashMap<Integer, Integer> productIDs_numbers) {

    }
}
