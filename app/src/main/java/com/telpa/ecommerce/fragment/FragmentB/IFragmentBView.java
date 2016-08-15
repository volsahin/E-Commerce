package com.telpa.ecommerce.fragment.FragmentB;

import android.view.View;

import com.telpa.ecommerce.models.Category;
import com.telpa.ecommerce.models.Product;

import java.util.ArrayList;

/**
 * Created by SAMSUNGNB on 12.08.2016.
 */
public interface IFragmentBView {
    void viewAll();

    void setTopCategoryTitle(String title);
    void setTopCategoryProducts(ArrayList<Product> products);

    void setOtherSubCategories(ArrayList<Category> subCategories);

    void goToProduct(int ProductID);
    void addFavorites(int ProductID);

    void onFail();


    void onSuccess();
}
