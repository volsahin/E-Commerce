package com.telpa.ecommerce.activities;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;

import com.mikepenz.materialdrawer.Drawer;
import com.telpa.ecommerce.R;
import com.telpa.ecommerce.helper.BaseActivity;
import com.telpa.ecommerce.tabsliders.SlidingTabLayout;
import com.telpa.ecommerce.tabsliders.ViewPagerAdapter;

public class CategoryA extends BaseActivity {

    private SlidingTabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter vpAdapter;

    private Drawer drawer = null;
    private Toolbar mToolbar;
    CharSequence titles[]={"Category A","Category B"};
    int numboftabs =2;
    //private Drawer drawer = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toolbar);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        tabLayout = (SlidingTabLayout) findViewById(R.id.tablayout);

        vpAdapter = new ViewPagerAdapter(getSupportFragmentManager(),titles,numboftabs);
        viewPager.setAdapter(vpAdapter);


        setSupportActionBar(mToolbar);

        tabLayout.setDistributeEvenly(true);
        tabLayout.setViewPager(viewPager);

        drawer = drawerBuilder(this);
    }
}
