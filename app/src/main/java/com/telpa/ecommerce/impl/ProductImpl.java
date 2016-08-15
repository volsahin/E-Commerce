package com.telpa.ecommerce.impl;

import com.telpa.ecommerce.models.Comment;
import com.telpa.ecommerce.interfaces.IProduct;
import com.telpa.ecommerce.models.Product;

import java.util.ArrayList;

/**
 * Created by SAMSUNGNB on 1.08.2016.
 */

public class ProductImpl implements IProduct {

    @Override
    public ArrayList<Product> getProducts(int categoryID) {

        ArrayList<String> url = new ArrayList<String>();
        url.add("http://images.hepsiburada.net/assets/Bilgisayar/200/Bilgisayar_4076599.jpg");
        ArrayList<Product> products = new ArrayList<>();
        Product a = new Product();
        a.setName("Ürün");
        a.setID(1);
        a.setCategoryID(1);
        a.setDescripton("Bu bir üründür.");
        a.setHighResImageUrls(url);
        a.setLowResImageUrls(url);
        a.setPrice(30);
        a.setRating(2);
        a.setRating(3);
        products.add(a);
        products.add(a);
        products.add(a);
        products.add(a);
        return products;
    }

    @Override
    public ArrayList<Comment> getComments(int productID) {
        return null;
    }

    @Override
    public Product getFeatured(int categoryID) {
        return null;
    }

    @Override
    public boolean addFavorites(int customerID, Product product) {
        return false;
    }

    @Override
    public ArrayList<Integer> getFavorites(int customerID) {
        return null;
    }

    @Override
    public boolean setRating(int customerID, Product product, double newRating) {
        return false;
    }
}
