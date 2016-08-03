package com.telpa.ecommerce.interfaces;

import java.util.ArrayList;

/**
 * Created by Mert on 29.07.2016.
 */
public class Product {
    int ID;
    int price;
    double rating;
    String name;
    String descripton;
    ArrayList<Integer> imageIDs;
    int categoryID;
    int reviews;


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescripton() {
        return descripton;
    }

    public void setDescripton(String descripton) {
        this.descripton = descripton;
    }

    public ArrayList<Integer> getImageIDs() {
        return imageIDs;
    }

    public void setImageIDs(ArrayList<Integer> imageIDs) {
        this.imageIDs = imageIDs;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public int getReviews() {
        return reviews;
    }

    public void setReviews(int reviews) {
        this.reviews = reviews;
    }
}
