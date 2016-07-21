package com.telpa.ecommerce.activities;

import android.os.Bundle;

import com.telpa.ecommerce.R;
import com.telpa.ecommerce.utils.BaseActivity;
import com.telpa.ecommerce.utils.TabHelper;
import com.telpa.ecommerce.fragment.FragmentCTab;

import java.util.ArrayList;
import java.util.List;

public class ScreenCActivity extends BaseActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_c);

        fcreateTitle("My Store");
        fcreateToolbar(this,false,  true, true,R.id.toolbar);
        fcreateMenu(this, true);


        List<TabHelper> tabHelperList = new ArrayList<>();

        tabHelperList.add(FragmentCTab.createTab("Category A"));
        tabHelperList.add(FragmentCTab.createTab("Category B"));
        tabHelperList.add(FragmentCTab.createTab("Category C"));

        fcreateTabMenu(tabHelperList);

    }
}
