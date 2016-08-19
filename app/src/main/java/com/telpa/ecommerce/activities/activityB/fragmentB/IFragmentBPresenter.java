package com.telpa.ecommerce.activities.activityB.fragmentB;

import android.view.View;

import com.telpa.ecommerce.models.Category;

/**
 * Created by SAMSUNGNB on 12.08.2016.
 */
public interface IFragmentBPresenter{
    void loadView(Category category);
    void getTopSubCategory();
    void getTopProducts(Category category);
    void getSubCategories();


}
