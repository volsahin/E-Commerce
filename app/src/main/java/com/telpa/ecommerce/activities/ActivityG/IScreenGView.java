package com.telpa.ecommerce.activities.ActivityG;

import com.telpa.ecommerce.models.Category;

import java.util.ArrayList;

/**
 * Created by Gizem İlgar on 15.8.2016.
 */

public interface IScreenGView {
    void search();
    void goBasket();
    void fillFragments(ArrayList<Category> categories);
}
