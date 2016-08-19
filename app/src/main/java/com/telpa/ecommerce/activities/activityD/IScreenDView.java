package com.telpa.ecommerce.activities.activityD;

import com.telpa.ecommerce.models.Category;

import java.util.ArrayList;

/**
 * Created by Mert on 16.08.2016.
 */
public interface IScreenDView {
    void search();
    void goBasket();
    void fillFragments(ArrayList<Category> categories);
}
