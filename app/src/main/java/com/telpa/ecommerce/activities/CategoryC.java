package com.telpa.ecommerce.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.telpa.ecommerce.R;
import com.telpa.ecommerce.helper.BaseActivity;
import com.telpa.ecommerce.tabsliders.TabHelper;
import com.telpa.ecommerce.tabsliders.TabOne;
import com.telpa.ecommerce.tabsliders.TabThree;

import java.util.ArrayList;
import java.util.List;

public class CategoryC extends BaseActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_c);

        setContentView(R.layout.activity_category_a);
        fcreateTitle("My Store");
        fcreateToolbar(this, true, true,R.id.toolbar);
        fcreateMenu(this);


        List<TabHelper> tabHelperList = new ArrayList<>();

        tabHelperList.add(TabThree.getTabThree("Category A"));
        tabHelperList.add(TabThree.getTabThree("Category B"));
        tabHelperList.add(TabThree.getTabThree("Category C"));
        //tabHelperList.add(TabOne.getTabOnex("Category D"));

        fcreateTabMenu(tabHelperList);

    }
}
