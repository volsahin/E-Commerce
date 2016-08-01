package com.telpa.ecommerce;


import java.util.HashMap;

/**
 * Created by Gizem İlgar on 1.8.2016.
 */
public interface GetBasket {
    HashMap<Product,Integer> getBasket(int categoryID);
}
