package com.telpa.ecommerce.models;

import java.io.Serializable;

/**
 * Created by SAMSUNGNB on 4.08.2016.
 */
public class BasketItem implements Serializable {
    private Product product;
    private int variant1;
    private int variant2;
    private int number;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getVariant1() {
        return variant1;
    }

    public void setVariant1(int variant1) {
        this.variant1 = variant1;
    }

    public int getVariant2() {
        return variant2;
    }

    public void setVariant2(int variant2) {
        this.variant2 = variant2;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
