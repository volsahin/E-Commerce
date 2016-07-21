package com.telpa.ecommerce.activities;

import android.os.Bundle;

import com.telpa.ecommerce.R;
import com.telpa.ecommerce.fragment.FragmentGTab;
import com.telpa.ecommerce.utils.BaseActivity;
import com.telpa.ecommerce.utils.TabHelper;

import java.util.ArrayList;
import java.util.List;

public class ScreenGActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_g);

        fcreateTitle("My Store");
        fcreateToolbar(this,false, true, true,R.id.toolbar);
        fcreateMenu(this, true);


        List<TabHelper> tabHelperList = new ArrayList<>();
        tabHelperList.add(FragmentGTab.createTab("Category A"));
        tabHelperList.add(FragmentGTab.createTab("Category B"));
        tabHelperList.add(FragmentGTab.createTab("Category C"));


        fcreateTabMenu(tabHelperList);
    }
}
