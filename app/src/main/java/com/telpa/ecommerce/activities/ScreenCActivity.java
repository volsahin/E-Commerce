package com.telpa.ecommerce.activities;

import android.os.Bundle;

import com.telpa.ecommerce.R;
import com.telpa.ecommerce.utils.BaseActivity;
import com.telpa.ecommerce.tabsliders.TabHelper;
import com.telpa.ecommerce.tabsliders.ScreenCTabOne;

import java.util.ArrayList;
import java.util.List;

public class ScreenCActivity extends BaseActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_c);

        setContentView(R.layout.activity_screen_a);
        fcreateTitle("My Store");
        fcreateToolbar(this, true, true,R.id.toolbar);
        fcreateMenu(this);


        List<TabHelper> tabHelperList = new ArrayList<>();

        tabHelperList.add(ScreenCTabOne.getTabThree("Category A"));
        tabHelperList.add(ScreenCTabOne.getTabThree("Category B"));
        tabHelperList.add(ScreenCTabOne.getTabThree("Category C"));
        //tabHelperList.add(TabOne.getTabOnex("Category D"));

        fcreateTabMenu(tabHelperList);

    }
}
