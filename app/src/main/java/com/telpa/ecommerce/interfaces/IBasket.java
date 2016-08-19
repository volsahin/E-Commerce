package com.telpa.ecommerce.interfaces;

import com.telpa.ecommerce.models.BasketItem;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Gizem İlgar on 1.8.2016.
 */

public interface IBasket {
    ArrayList<BasketItem> getBasket(int customerID);

    boolean addBasket(int customerID, BasketItem basketItem);
    boolean checkOut(int customerID,   ArrayList<BasketItem> basketItems);
}
