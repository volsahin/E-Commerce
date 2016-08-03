package com.telpa.ecommerce.interfaces;

import java.util.HashMap;

/**
 * Created by Gizem İlgar on 1.8.2016.
 */

public interface IBasket {
    HashMap<Integer, Integer> getBasket(int customerID);

    void addBasket(int customerID, int productID, int number, int variant1, int variant2);

    void checkOut(int customerID,HashMap<Integer, Integer> productIDs_numbers);
}
