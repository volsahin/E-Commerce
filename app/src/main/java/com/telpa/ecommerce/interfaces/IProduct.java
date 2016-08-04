package com.telpa.ecommerce.interfaces;

import com.telpa.ecommerce.models.Comment;

import java.util.ArrayList;

/**
 * Created by Gizem İlgar on 1.8.2016.
 */

public interface IProduct {
    ArrayList<Integer> getProducts(int categoryID);

    ArrayList<Comment> getComments(int productID);

    void addFavorites(int customerID, int productID);

    void setRating(int customerID,int productID, double newRating);


}
