package com.telpa.ecommerce.activities.activityB;

import com.telpa.ecommerce.utils.TabHelper;

import java.util.List;

/**
 * Created by SAMSUNGNB on 12.08.2016.
 */
public interface IScreenBView {
    void search();
    void goBasket();

    void fillFragments(List<TabHelper> tabHelperList);
    void setTitle(String title);
    void setBaseItems();
}
