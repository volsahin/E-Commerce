package com.telpa.ecommerce.activities.activityB;

import com.telpa.ecommerce.models.Category;

import java.util.ArrayList;

/**
 * Created by SAMSUNGNB on 12.08.2016.
 */
public interface IScreenBView {
    void search();
    void goBasket();
    void fillFragments(ArrayList<Category> categories);
    void setTitle(String title);
    void setBaseItems();
}
