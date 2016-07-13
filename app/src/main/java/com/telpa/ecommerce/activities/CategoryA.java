package com.telpa.ecommerce.activities;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.mikepenz.materialdrawer.Drawer;
import com.telpa.ecommerce.R;
import com.telpa.ecommerce.helper.BaseActivity;

public class CategoryA extends BaseActivity {

    private Drawer drawer = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_a);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);

        drawer = drawerBuilder(this);
    }
}
