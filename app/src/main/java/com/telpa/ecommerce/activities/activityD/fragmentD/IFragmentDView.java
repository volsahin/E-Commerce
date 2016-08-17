package com.telpa.ecommerce.activities.activityD.fragmentD;

import com.telpa.ecommerce.models.Product;

import java.util.ArrayList;

/**
 * Created by Mert on 16.08.2016.
 */
public interface IFragmentDView {
    void goToProduct(int ProductID);
    void fillProducts(ArrayList<Product> products);

}
