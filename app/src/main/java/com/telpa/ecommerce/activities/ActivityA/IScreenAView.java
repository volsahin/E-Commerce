package com.telpa.ecommerce.activities.ActivityA;
import com.telpa.ecommerce.models.Category;

import java.util.ArrayList;


/**
 * Created by Gizem İlgar on 12.8.2016.
 */

public interface IScreenAView {
    void search();
    void goBasket();
    void fillFragments(ArrayList<Category> categories);

}
