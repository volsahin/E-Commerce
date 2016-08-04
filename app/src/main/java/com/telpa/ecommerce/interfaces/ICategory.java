package com.telpa.ecommerce.interfaces;

import com.telpa.ecommerce.models.Category;

import java.util.ArrayList;

/**
 * Created by Mert on 29.07.2016.
 */

public interface ICategory {
    ArrayList<Category> getCategories(int parentCategoryID);


}
