package com.telpa.ecommerce.activities.activityA.fragmentA;

import android.view.View;

import com.telpa.ecommerce.models.Category;

/**
 * Created by Mert on 16.08.2016.
 */
public interface IFragmentAPresenter {

    void loadView(Category category);
    void getTopSubCategory(View view);
    void getTopProducts(Category category,View view);
    void getSubCategories(View view);
}
