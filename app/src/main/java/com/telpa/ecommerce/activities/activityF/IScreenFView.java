package com.telpa.ecommerce.activities.activityF;

import com.telpa.ecommerce.models.Category;

import java.util.ArrayList;

/**
 * Created by Gizem İlgar on 16.8.2016.
 */
public interface IScreenFView {
    void search();
    void goBasket();
    void fillFragments(ArrayList<Category> categories);
}
