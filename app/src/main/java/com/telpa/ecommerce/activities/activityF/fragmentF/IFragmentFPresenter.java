package com.telpa.ecommerce.activities.activityF.fragmentF;

import android.view.View;

import com.telpa.ecommerce.models.Category;

/**
 * Created by Gizem İlgar on 16.8.2016.
 */
public interface IFragmentFPresenter {
    void loadView(Category category);
    void getTopProduct(Category category);
    void getProduct(Category category);


}
