package com.telpa.ecommerce.models;

/**
 * Created by Gizem İlgar on 15.7.2016.
 */
public class HList {
    private String Category;
    private String ProductName;

    public HList(String Category, String ProductName) {
        super();
        this.Category = Category;
        this.ProductName = ProductName;
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


    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }
}
