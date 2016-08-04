package com.telpa.ecommerce.interfaces;

import com.telpa.ecommerce.models.Comment;
import com.telpa.ecommerce.models.Product;

import java.util.ArrayList;

/**
 * Created by Gizem İlgar on 1.8.2016.
 */

public interface IProduct {
    ArrayList<Product> getProducts(int categoryID);

    ArrayList<Comment> getComments(int productID);

    boolean addFavorites(int customerID, Product product);

    boolean setRating(int customerID,Product product, double newRating);


}
