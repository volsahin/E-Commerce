package com.telpa.ecommerce.activities.activityB.fragmentB;

import android.view.View;

import com.telpa.ecommerce.models.Category;

/**
 * Created by SAMSUNGNB on 12.08.2016.
 */
public interface IFragmentBPresenter{
    void loadView(Category category);
    void getTopSubCategory(View view);
    void getTopProducts(Category category,View view);
    void getSubCategories(View view);


}
