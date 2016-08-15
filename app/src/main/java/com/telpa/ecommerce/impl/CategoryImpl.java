package com.telpa.ecommerce.impl;

import com.telpa.ecommerce.interfaces.ICategory;
import com.telpa.ecommerce.models.Category;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SAMSUNGNB on 1.08.2016.
 */

public class CategoryImpl implements ICategory {

    @Override
    public ArrayList<Category> getCategories(int parentCategoryID) {

        //TODO service methodu yaz
        ArrayList<Category> categories = new ArrayList<>();
        Category a = new Category();
        a.setName("Category");
        a.setHighResImageUrl("");
        a.setLowResImageUrl("");
        a.setID(1);
        a.setNumOfProduct(2);
        a.setParentID(0);
        categories.add(a);
        categories.add(a);
        categories.add(a);
        categories.add(a);
        categories.add(a);
        return categories;

    }

    @Override
    public Category getTopSubCategory(int categoryID) {
        Category a = new Category();
        a.setName("TopSubCategory");
        a.setHighResImageUrl("");
        a.setLowResImageUrl("");
        a.setID(1);
        a.setNumOfProduct(2);
        a.setParentID(0);
        return a;
    }
}
