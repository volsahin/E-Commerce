package com.telpa.ecommerce.models;

/**
 * Created by Gizem İlgar on 15.7.2016.
 */
public class HList {
    private String Category;
    private String ProductName;
    private int image_id;

    public HList(String Category, String ProductName,int image_id) {
        super();
        this.Category = Category;
        this.ProductName = ProductName;
        this.image_id=image_id;
    }

    @Override
    public String toString() {
        return Category;
    }

    public String getCategory() {
        return Category;

    }

    public void setCategory(String category) {
        this.Category = category;
    }

    public int getImage_id()
    {
        return this.image_id;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }
}
