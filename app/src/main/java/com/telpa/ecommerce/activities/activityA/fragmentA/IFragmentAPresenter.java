package com.telpa.ecommerce.activities.activityA.fragmentA;

import android.view.View;

import com.telpa.ecommerce.models.BasketItem;
import com.telpa.ecommerce.models.Category;
import com.telpa.ecommerce.models.Product;

import java.util.ArrayList;

/**
 * Created by Mert on 16.08.2016.
 */
public interface IFragmentAPresenter {

    void getTopProduct(Category category,View view);
    void getSubCategories(View view);
    ArrayList<Integer> getFavorites(int customerID);
    void removeFavorites(int customerID,int productID);
    void addFavorites(int customerID,int productID);
    boolean isInBasket(int productID);
    void addBasket(int customerID, BasketItem basketItem);
}
