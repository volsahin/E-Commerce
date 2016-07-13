package com.telpa.ecommerce.activities;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.mikepenz.materialdrawer.Drawer;
import com.telpa.ecommerce.R;

public class CategoryA extends BaseActivity {

    private Drawer drawer = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toolbar);

        drawer = drawerBuilder(this);

        super.mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(super.mToolbar);
    }
}
