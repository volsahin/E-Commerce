package com.telpa.ecommerce.activities;


import android.os.Bundle;
import com.telpa.ecommerce.helper.BaseActivity;

public class CategoryA extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        fcreateTitle("My Store");
        fcreateToolbar(this,true,true);
        fcreateMenu(this);
        fcreateTabMenu();

    }

}
