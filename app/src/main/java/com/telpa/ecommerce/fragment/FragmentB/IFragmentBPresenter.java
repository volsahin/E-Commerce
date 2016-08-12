package com.telpa.ecommerce.fragment.FragmentB;

import com.telpa.ecommerce.models.Category;
import com.telpa.ecommerce.models.Product;

import java.util.ArrayList;

/**
 * Created by SAMSUNGNB on 12.08.2016.
 */
public interface IFragmentBPresenter{
    void loadView(int categoryID);
    void getTopCategory();
    void getTopProducts(Category category);
    void getSubCategories();
    void getTopCategoryTitle();

}
