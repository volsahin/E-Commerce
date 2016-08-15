package com.telpa.ecommerce.fragment.FragmentG;

import android.view.View;
import com.telpa.ecommerce.models.Category;

/**
 * Created by Gizem İlgar on 15.8.2016.
 */
public interface IFragmentGPresenter {
    void loadView(Category category);
    void getSubCategories(View view);


}
