package com.telpa.ecommerce.models;


/**
 * Created by Mert on 29.07.2016.
 */
public class Category {
    private int ID;
    private String name;
    private int parentID;
    private int imageID;
    private int numOfProduct;

    public Category(int ID, String name, int parentID, int imageID, int numOfProduct) {
        this.ID = ID;
        this.name = name;
        this.parentID = parentID;
        this.imageID = imageID;
        this.numOfProduct = numOfProduct;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getParentID() {
        return parentID;
    }

    public void setParentID(int parentID) {
        this.parentID = parentID;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public int getNumOfProduct() {
        return numOfProduct;
    }

    public void setNumOfProduct(int numOfProduct) {
        this.numOfProduct = numOfProduct;
    }
}
