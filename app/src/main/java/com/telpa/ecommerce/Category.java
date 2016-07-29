package com.telpa.ecommerce;

import java.util.ArrayList;
import java.util.List;

import retrofit2.http.Field;

/**
 * Created by Mert on 29.07.2016.
 */
public class Category  {
    private int ID,length;
    private String name;
    private ArrayList<Category> childs;
    private Category parent ;
    private ArrayList<Product> products;



}
