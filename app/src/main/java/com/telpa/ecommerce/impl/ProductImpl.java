package com.telpa.ecommerce.impl;

import com.telpa.ecommerce.models.Comment;
import com.telpa.ecommerce.interfaces.IProduct;
import com.telpa.ecommerce.models.Product;

import java.util.ArrayList;

/**
 * Created by SAMSUNGNB on 1.08.2016.
 */

public class ProductImpl implements IProduct {
    ArrayList<Integer> favorites;

    public ProductImpl() {
        favorites=new ArrayList<>();
        favorites.add(1);
        favorites.add(2);
        favorites.add(3);
    }

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

        Product b = new Product();
        b.setName("BaşkaÜrün");
        b.setID(4);
        b.setCategoryID(1);
        b.setDescripton("Bu başka bir üründür.");
        b.setHighResImageUrls(url);
        b.setLowResImageUrls(url);
        b.setPrice(50);
        b.setRating(2);
        b.setRating(3);

        products.add(b);
        products.add(a);
        products.add(b);
        products.add(a);
        products.add(b);
        products.add(a);
        return products;
    }

    @Override
    public ArrayList<Comment> getComments(int productID) {
        ArrayList<Comment> comments=new ArrayList<>();
        Comment comment=new Comment();
        comment.setComment("Yorum");
        comment.setRating(2);
        comment.setTime("2");
        comment.setUserName("User 1");
        comments.add(comment);
        comments.add(comment);
        Comment comment1=new Comment();
        comment1.setComment("Yorum");
        comment1.setRating(4);
        comment1.setTime("1");
        comment1.setUserName("User 2");
        comments.add(comment1);
        comments.add(comment1);

        return comments;
    }

    @Override
    public Product getFeatured(int categoryID) {
        ArrayList<String> url = new ArrayList<String>();
        url.add("http://images.hepsiburada.net/assets/Bilgisayar/200/Bilgisayar_4076599.jpg");
        Product b = new Product();
        b.setName("TopÜrün");
        b.setID(4);
        b.setCategoryID(1);
        b.setDescripton("Bu başka bir üründür.");
        b.setHighResImageUrls(url);
        b.setLowResImageUrls(url);
        b.setPrice(50);
        b.setRating(2);
        b.setRating(3);
        return b;
    }

    @Override
    public boolean addFavorites(int customerID, int productID) {
        favorites.add(productID);
        return true;
    }

    @Override
    public boolean removeFavorites(int customerID, int productID) {
        favorites.remove(favorites.indexOf(productID));

        return true;
    }

    @Override
    public ArrayList<Integer> getFavorites(int customerID) {
        return favorites;
    }

    @Override
    public boolean setRating(int customerID, Product product, double newRating) {
        return false;
    }
}
