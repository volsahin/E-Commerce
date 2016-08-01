package com.telpa.ecommerce;

import java.util.ArrayList;

/**
 * Created by Gizem İlgar on 1.8.2016.
 */
public interface AddBasket {

    void addBasket(int customerID,int productID,int number);
    void addBasket(int customerID,int productID,int number,int variant1,int variant2);
}
