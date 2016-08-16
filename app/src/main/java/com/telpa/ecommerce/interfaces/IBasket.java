package com.telpa.ecommerce.interfaces;

import com.telpa.ecommerce.models.BasketItem;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Gizem İlgar on 1.8.2016.
 */

public interface IBasket {
    ArrayList<BasketItem> getBasket(int customerID);

    boolean addBasket(int customerID, ArrayList<BasketItem> basketItems);
    boolean addFavorites(int customerID, ArrayList<BasketItem> basketItems);
    boolean checkOut(int customerID,   ArrayList<BasketItem> basketItems);
}
