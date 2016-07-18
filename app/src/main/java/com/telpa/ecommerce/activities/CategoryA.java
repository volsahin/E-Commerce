package com.telpa.ecommerce.activities;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.telpa.ecommerce.R;
import com.telpa.ecommerce.helper.BaseActivity;
import com.telpa.ecommerce.tabsliders.TabHelper;
import com.telpa.ecommerce.tabsliders.TabOne;

import java.util.ArrayList;
import java.util.List;

public class CategoryA extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_a);
        fcreateTitle("My Store");
        fcreateToolbar(this, true, true);
        fcreateMenu(this);
        List<TabHelper> tabHelperList = new ArrayList<>();
        tabHelperList.add(TabOne.getTabOne("Category A"));
        tabHelperList.add(TabOne.getTabOne("Category B"));
        tabHelperList.add(TabOne.getTabOne("Category C"));
        //tabHelperList.add(TabOne.getTabOnex("Category D"));
        fcreateTabMenu(tabHelperList);


    }

}
