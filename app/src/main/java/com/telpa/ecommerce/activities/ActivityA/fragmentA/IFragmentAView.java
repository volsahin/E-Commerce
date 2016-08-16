package com.telpa.ecommerce.activities.ActivityA.fragmentA;

import com.telpa.ecommerce.models.Category;
import com.telpa.ecommerce.models.Product;

import java.util.ArrayList;

/**
 * Created by Mert on 16.08.2016.
 */
public interface IFragmentAView {

    void viewAll();
    void setTopCategoryTitle(String title);
    void setTopCategoryProducts(ArrayList<Product> products);
    void setOtherSubCategories(ArrayList<Category> subCategories);
    void goToProduct(int ProductID);
    void addFavorites(int ProductID);
    void onFail();
    void onSuccess();
}
