package com.telpa.ecommerce.models;

import java.util.ArrayList;

/**
 * Created by Mert on 29.07.2016.
 */
public class Product {
    private int ID;
    private int price;
    private double rating;
    private String name;
    private String descripton;
    private ArrayList<String> highResImageUrls;
    private ArrayList<String> lowResImageUrls;
    private int categoryID;
    private int reviewCounter;

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

    public ArrayList<String> getHighResImageUrls() {
        return highResImageUrls;
    }

    public void setHighResImageUrls(ArrayList<String> highResImageUrls) {
        this.highResImageUrls = highResImageUrls;
    }

    public ArrayList<String> getLowResImageUrls() {
        return lowResImageUrls;
    }

    public void setLowResImageUrls(ArrayList<String> lowResImageUrls) {
        this.lowResImageUrls = lowResImageUrls;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public int getReviews() {
        return reviewCounter;
    }

    public void setReviews(int reviewCounter) {
        this.reviewCounter = reviewCounter;
    }
}
