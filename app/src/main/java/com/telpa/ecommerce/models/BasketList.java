package com.telpa.ecommerce.models;

/**
 * Created by SAMSUNGNB on 19.07.2016.
 */
public class BasketList {

    private String ProductName;
    private String Price;

    public BasketList(String ProductName, String Price) {
        super();
        this.ProductName = ProductName;
        this.Price = Price;

    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }

}
