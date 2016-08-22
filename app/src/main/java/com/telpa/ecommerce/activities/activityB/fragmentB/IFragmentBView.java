package com.telpa.ecommerce.activities.activityB.fragmentB;

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

    void viewAll(Category category);
    void addFavorites();
    void removeFavorites();
    void addBasketSuccess(int ProductID);
    void addBasketFail(int ProductID);

    void viewInitializer();

}
