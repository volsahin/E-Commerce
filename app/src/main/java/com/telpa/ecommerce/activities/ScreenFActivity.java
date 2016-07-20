package com.telpa.ecommerce.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.telpa.ecommerce.R;
import com.telpa.ecommerce.fragment.FragmentATab;
import com.telpa.ecommerce.fragment.FragmentBTab;
import com.telpa.ecommerce.utils.BaseActivity;
import com.telpa.ecommerce.utils.TabHelper;

import java.util.ArrayList;
import java.util.List;

public class ScreenFActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_f);

        fcreateTitle("My Store");
        fcreateToolbar(this, true, true, R.id.toolbar);
        fcreateMenu(this, true);

        /*
        List<TabHelper> tabHelperList = new ArrayList<>();
        tabHelperList.add(FragmentATab.createTab("Category A"));
        tabHelperList.add(FragmentBTab.createTab("Category B"));
        tabHelperList.add(FragmentATab.createTab("Category C"));


        fcreateTabMenu(tabHelperList);
        */
    }
}
