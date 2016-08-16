package com.telpa.ecommerce.activities.activityF.fragmentF;

import com.telpa.ecommerce.models.Product;

import java.util.ArrayList;

/**
 * Created by Gizem İlgar on 16.8.2016.
 */
public interface IFragmentFView {
    void viewAll();

    void setTopProduct(Product topProduct);
    void setProducts(ArrayList<Product> topProduct);
    void goToProduct(int ProductID);
    void addFavorites(int ProductID);

    void setFavorite(boolean favorite);
}
