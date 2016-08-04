package com.telpa.ecommerce.impl;

import com.telpa.ecommerce.models.Comment;
import com.telpa.ecommerce.interfaces.IProduct;
import com.telpa.ecommerce.models.Product;

import java.util.ArrayList;

/**
 * Created by SAMSUNGNB on 1.08.2016.
 */

public class IProductImpl implements IProduct {

    @Override
    public ArrayList<Product> getProducts(int categoryID) {
        return null;
    }

    @Override
    public ArrayList<Comment> getComments(int productID) {
        return null;
    }

    @Override
    public boolean addFavorites(int customerID, Product product) {
        return false;
    }

    @Override
    public boolean setRating(int customerID, Product product, double newRating) {
        return false;
    }
}
