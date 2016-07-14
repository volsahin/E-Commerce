package com.telpa.ecommerce.activities;

import android.media.Image;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

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
    ImageButton basket;
    ImageButton search;
    //private Drawer drawer = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_a);
        super.title=(TextView)findViewById(R.id.title);
        super.title.setText("My Store");
        super.title.setTextSize(18);

        super.mToolbar = (Toolbar) findViewById(R.id.toolbar);
        drawer = drawerBuilder(this, accountHeaderBuilder(this));

        basket = (ImageButton) findViewById(R.id.basketButton);
        basket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CategoryA.this, "Basket", Toast.LENGTH_SHORT).show();
            }
        });
        search = (ImageButton) findViewById(R.id.searchButton);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CategoryA.this, "Search", Toast.LENGTH_SHORT).show();
                drawer.openDrawer();
            }
        });

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        tabLayout = (SlidingTabLayout) findViewById(R.id.tablayout);

        vpAdapter = new ViewPagerAdapter(getSupportFragmentManager(), titles, numboftabs);
        viewPager.setAdapter(vpAdapter);


        tabLayout.setDistributeEvenly(true);
        tabLayout.setViewPager(viewPager);


        mToolbar.setBackgroundColor(getResources().getColor(R.color.black));
        setSupportActionBar(super.mToolbar);

        mToolbar.setNavigationIcon(R.drawable.ic_menu_white_24dp);

        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawer.openDrawer();
            }
        });

        getSupportActionBar().setTitle("My Store");


    }

    /*
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
                drawer.openDrawer();

        return true;
    }
    */
}
