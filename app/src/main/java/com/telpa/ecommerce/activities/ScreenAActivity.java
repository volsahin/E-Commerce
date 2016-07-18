package com.telpa.ecommerce.activities;


import android.os.Bundle;

import com.telpa.ecommerce.R;
import com.telpa.ecommerce.utils.BaseActivity;
import com.telpa.ecommerce.tabsliders.TabHelper;
import com.telpa.ecommerce.tabsliders.ScreenATabOne;

import java.util.ArrayList;
import java.util.List;

public class ScreenAActivity extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_a);

        fcreateTitle("My Store");
        fcreateToolbar(this, true, true, R.id.toolbar);
        fcreateMenu(this);

        List<TabHelper> tabHelperList = new ArrayList<>();
        tabHelperList.add(ScreenATabOne.getTabOne("Category A"));
        tabHelperList.add(ScreenATabOne.getTabOne("Category B"));
        tabHelperList.add(ScreenATabOne.getTabOne("Category C"));
        //tabHelperList.add(TabOne.getTabOnex("Category D"));

        fcreateTabMenu(tabHelperList);


    }

}
