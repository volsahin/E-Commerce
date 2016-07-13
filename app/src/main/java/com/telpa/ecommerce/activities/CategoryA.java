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

    CharSequence titles[] = {"Category A", "Category B", "Category C"};
    int numboftabs = 3;
    //private Drawer drawer = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_a);


        viewPager = (ViewPager) findViewById(R.id.viewPager);
        tabLayout = (SlidingTabLayout) findViewById(R.id.tablayout);

        vpAdapter = new ViewPagerAdapter(getSupportFragmentManager(), titles, numboftabs);
        viewPager.setAdapter(vpAdapter);


        tabLayout.setDistributeEvenly(true);
        tabLayout.setViewPager(viewPager);

        super.mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mToolbar.setTitle("My Store");
        mToolbar.setTitleTextColor(getResources().getColor(R.color.white));
        mToolbar.setBackgroundColor(getResources().getColor(R.color.black));
        setSupportActionBar(super.mToolbar);

        getSupportActionBar().setTitle("My Store");

        drawer = drawerBuilder(this, accountHeaderBuilder(this));

    }
}
