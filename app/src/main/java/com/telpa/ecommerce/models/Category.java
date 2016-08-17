package com.telpa.ecommerce.models;


import java.io.Serializable;

/**
 * Created by Mert on 29.07.2016.
 */
public class Category implements Serializable {
    private int ID;
    private String name;
    private int parentID;
    private String highResImageUrl;
    private String lowResImageUrl;
    private int numOfProduct;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getParentID() {
        return parentID;
    }

    public void setParentID(int parentID) {
        this.parentID = parentID;
    }

    public String getHighResImageUrl() {
        return highResImageUrl;
    }

    public void setHighResImageUrl(String highResImageUrl) {
        this.highResImageUrl = highResImageUrl;
    }

    public String getLowResImageUrl() {
        return lowResImageUrl;
    }

    public void setLowResImageUrl(String lowResImageUrl) {
        this.lowResImageUrl = lowResImageUrl;
    }

    public int getNumOfProduct() {
        return numOfProduct;
    }

    public void setNumOfProduct(int numOfProduct) {
        this.numOfProduct = numOfProduct;
    }
}
