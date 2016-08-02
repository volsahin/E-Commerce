package com.telpa.ecommerce.interfaces;

import java.util.ArrayList;

/**
 * Created by SAMSUNGNB on 1.08.2016.
 */

public class ProductModule implements IProduct{
    @Override
    public ArrayList<Integer> getProducts(int categoryID) {
        return null;
    }

    @Override
    public ArrayList<Comment> getComments(int productID) {
        return null;
    }

    @Override
    public void addFavorites(int customerID, int productID) {

    }

    @Override
    public void setRating(int customerID,int productID, double newRating) {

    }
}
