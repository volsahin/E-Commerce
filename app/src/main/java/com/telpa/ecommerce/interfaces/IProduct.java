package com.telpa.ecommerce.interfaces;

import java.util.ArrayList;

/**
 * Created by Gizem İlgar on 1.8.2016.
 */

public interface IProduct {
    ArrayList<Integer> getProducts(int categoryID);

    ArrayList<Comment> getComments(int productID);

    void addFavorites(int customerID, int productID);

    void setRating(int productID, double newRating);


}
