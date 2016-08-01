package com.telpa.ecommerce;

import java.util.ArrayList;
import java.util.List;

import retrofit2.http.Field;

/**
 * Created by Mert on 29.07.2016.
 */
public class Category  {
    private int ID;
    private String name;
    private int parentID ;
    private int ImageID;
    private int NumOfproduct;

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

    public int getImageID() {
        return ImageID;
    }

    public void setImageID(int imageID) {
        ImageID = imageID;
    }
}
