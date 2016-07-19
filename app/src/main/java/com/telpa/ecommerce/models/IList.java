package com.telpa.ecommerce.models;

/**
 * Created by Gizem İlgar on 19.7.2016.
 */
public class IList {
    private String ProductName;
    private String Price;
    private  String Description;
    public IList(String ProductName,String Price,String Description) {
        super();
        this.ProductName = ProductName;
        this.Price=Price;
        this.Description=Description;
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

    public String getDescription() {
        return Description;
    }
    public void setDescription(String Description) {
        this.Price = Description;
    }

}

