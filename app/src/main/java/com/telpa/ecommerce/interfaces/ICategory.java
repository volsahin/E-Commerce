package com.telpa.ecommerce.interfaces;

import java.util.ArrayList;

/**
 * Created by Mert on 29.07.2016.
 */

public interface ICategory {
    ArrayList<Integer> getCategories();

    ArrayList<Integer> getSubCategory(int categoryID);

}
