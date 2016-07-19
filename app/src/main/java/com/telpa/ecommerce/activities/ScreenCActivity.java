package com.telpa.ecommerce.activities;

import android.os.Bundle;

import com.telpa.ecommerce.R;
import com.telpa.ecommerce.utils.BaseActivity;
import com.telpa.ecommerce.tabsliders.TabHelper;
import com.telpa.ecommerce.tabsliders.ScreenCTab;

import java.util.ArrayList;
import java.util.List;

public class ScreenCActivity extends BaseActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_c);

        fcreateTitle("My Store");
        fcreateToolbar(this, true, true,R.id.toolbar);
        fcreateMenu(this, true);


        List<TabHelper> tabHelperList = new ArrayList<>();

        tabHelperList.add(ScreenCTab.createTab("Category A"));
        tabHelperList.add(ScreenCTab.createTab("Category B"));
        tabHelperList.add(ScreenCTab.createTab("Category C"));

        fcreateTabMenu(tabHelperList);

    }
}
