package com.telpa.ecommerce.activities;

import android.os.Bundle;

import com.telpa.ecommerce.R;
import com.telpa.ecommerce.helper.BaseActivity;
import com.telpa.ecommerce.tabsliders.TabTwo;


public class CategoryB extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_b);
        fcreateTitle("My Store");
        fcreateToolbar(this, true, true);
        fcreateMenu(this);
        fcreateTabMenu(new TabTwo());
    }
}