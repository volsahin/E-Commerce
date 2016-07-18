package com.telpa.ecommerce.activities;

import android.os.Bundle;

import com.telpa.ecommerce.R;
import com.telpa.ecommerce.utils.BaseActivity;
import com.telpa.ecommerce.tabsliders.TabHelper;
import com.telpa.ecommerce.tabsliders.ScreenBTabOne;

import java.util.ArrayList;
import java.util.List;


public class ScreenBActivity extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_b);

        fcreateTitle("My Store");
        fcreateToolbar(this, true, true,R.id.toolbar);
        fcreateMenu(this);

        List<TabHelper> tabHelperList = new ArrayList<>();
        tabHelperList.add(new ScreenBTabOne().getTabTwo("Category A"));
        tabHelperList.add(new ScreenBTabOne().getTabTwo("Category B"));
        tabHelperList.add(new ScreenBTabOne().getTabTwo("Category C"));


        fcreateTabMenu(tabHelperList);
    }
}