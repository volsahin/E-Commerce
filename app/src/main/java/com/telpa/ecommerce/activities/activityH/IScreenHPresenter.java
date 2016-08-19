package com.telpa.ecommerce.activities.activityH;

import com.telpa.ecommerce.models.Category;

import java.util.ArrayList;

/**
 * Created by root on 16.08.2016.
 */
public interface IScreenHPresenter {
    ArrayList<Category> categories();
    void ScreenHCategories(ArrayList<Category> screenhcategories);
}
