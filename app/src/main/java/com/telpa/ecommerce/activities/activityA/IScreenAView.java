package com.telpa.ecommerce.activities.activityA;
import com.telpa.ecommerce.utils.TabHelper;

import java.util.List;


/**
 * Created by Gizem İlgar on 12.8.2016.
 */

public interface IScreenAView {
    void search();
    void goBasket();
    void setBaseItems();
    void fCreateTabMenu(List<TabHelper> tabHelperList);
    void setTitle(String title);

}
