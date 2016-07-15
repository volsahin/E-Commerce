package com.telpa.ecommerce.activities;


import android.os.Bundle;

import com.telpa.ecommerce.R;
import com.telpa.ecommerce.helper.BaseActivity;
import com.telpa.ecommerce.tabsliders.TabOne;

public class CategoryA extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_a);
        fcreateTitle("My Store");
        fcreateToolbar(this,true,true);
        fcreateMenu(this);
        fcreateTabMenu(new TabOne());

    }

}
