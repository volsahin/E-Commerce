package com.telpa.ecommerce.models;

/**
 * Created by Gizem İlgar on 19.7.2016.
 */
public class IList {
    private String ProductName;
    private String Price;
    private  String Description;
    private int image_id;
    private int image2_id;
    private int star_id;


    public IList(String ProductName, String Price,String Description,int image_id,int image2_id) {
        super();
        this.Price = Price;
        this.Description = Description;
        this.ProductName = ProductName;
        this.image_id=image_id;
        this.image2_id=image2_id;
    }

    @Override
    public String toString() {
        return Price;
    }

    public String getPrice() {
        return Price;

    }

    public void setPrice(String category) {
        this.Price = Price;
    }

    public int getImage_id()
    {
        return this.image_id;
    }

    public int getImage2_id()
    {
        return this.image2_id;
    }

    public int getstar_id()
    {
        return this.star_id;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
}
