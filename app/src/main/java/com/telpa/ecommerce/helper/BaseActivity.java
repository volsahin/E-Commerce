package com.telpa.ecommerce.helper;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


import com.mikepenz.materialdrawer.AccountHeader;
import com.mikepenz.materialdrawer.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.ProfileDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IProfile;
import com.telpa.ecommerce.R;
import com.telpa.ecommerce.activities.CategoryA;
import com.telpa.ecommerce.tabsliders.SlidingTabLayout;
import com.telpa.ecommerce.tabsliders.ViewPagerAdapter;

import static com.telpa.ecommerce.R.id.viewPager;

public class BaseActivity extends AppCompatActivity {

    public Drawer drawer = null;
    public Toolbar mToolbar;
    public TextView title;
    public int badgeCount;
    ImageButton basket,search;
    private SlidingTabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter vpAdapter;

    CharSequence titles[] = {"Category A", "Category B", "Category C"};
    int numbOftabs = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_category_a);



    }

    public void fcreateTitle(String titleName){
        title=(TextView)findViewById(R.id.title);
        title.setText(titleName);
        title.setTextSize(18);

    }

    public void fcreateMenu(final Context context){

        basket = (ImageButton) findViewById(R.id.basketButton);
        basket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Basket", Toast.LENGTH_SHORT).show();
            }
        });
        search = (ImageButton) findViewById(R.id.searchButton);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Search", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void fcreateTabMenu(){

        viewPager = (ViewPager)findViewById(R.id.viewPager);
        tabLayout = (SlidingTabLayout) findViewById(R.id.tablayout);

        vpAdapter = new ViewPagerAdapter(getSupportFragmentManager(), titles, numbOftabs);
        viewPager.setAdapter(vpAdapter);


        tabLayout.setDistributeEvenly(true);
        tabLayout.setViewPager(viewPager);


    }

    public void fcreateToolbar(Context context,boolean hasDrawer,boolean hasHamburgerNav){

        mToolbar = (Toolbar) findViewById(R.id.toolbar);

        if(hasDrawer)
        drawer = drawerBuilder(this, accountHeaderBuilder(this));


        if(hasHamburgerNav){
            mToolbar.setNavigationIcon(R.drawable.ic_menu_white_24dp);

            mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    drawer.openDrawer();
                }
            });
        }else{
            //TODO : make an back arrow logo
        }


    }
    public Drawer drawerBuilder(Activity activity,AccountHeader headerResult) {


        new DrawerBuilder().withActivity(activity).build();

        //if you want to update the items at a later time it is recommended to keep it in a variable
        PrimaryDrawerItem item1 = new PrimaryDrawerItem().withIdentifier(1).withName("Menu item").withIcon(R.drawable.material_drawer_circle_mask);
        PrimaryDrawerItem item2 = new PrimaryDrawerItem().withIdentifier(1).withName("Menu item").withIcon(R.drawable.material_drawer_circle_mask);
        PrimaryDrawerItem item3 = new PrimaryDrawerItem().withIdentifier(1).withName("Menu item").withIcon(R.drawable.material_drawer_circle_mask);
        SecondaryDrawerItem item4 = (SecondaryDrawerItem) new SecondaryDrawerItem().withIdentifier(2).withName(R.string.app_name2);
        PrimaryDrawerItem item5 = new PrimaryDrawerItem().withIdentifier(1).withName("Menu item").withIcon(R.drawable.material_drawer_circle_mask);
        PrimaryDrawerItem item6 = new PrimaryDrawerItem().withIdentifier(1).withName("Menu item").withIcon(R.drawable.material_drawer_circle_mask);

        //create the drawer and remember the `Drawer` result object
        Drawer result = new DrawerBuilder()
                .withActivity(activity)
                .withToolbar(mToolbar)
                .withAccountHeader(headerResult)
                .addDrawerItems(item1, item2, item3, item4,item5,item6)
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {
                        // do something with the clicked item :D
                        return true;
                    }
                })
                .build();

                return result;
    }

    public AccountHeader accountHeaderBuilder(Activity activity){
        AccountHeader headerResult = new AccountHeaderBuilder()
                .withActivity(activity)
                .withHeaderBackground(R.color.darkGrey)
                .addProfiles(
                        new ProfileDrawerItem().withName("Material Mockups").withEmail("username@materialmockups.com").withIcon(getResources().getDrawable(R.drawable.ic_account_circle_black_24dp))
                )
                .withOnAccountHeaderListener(new AccountHeader.OnAccountHeaderListener() {
                    @Override
                    public boolean onProfileChanged(View view, IProfile profile, boolean currentProfile) {
                        return false;
                    }
                })
                .build();
        return headerResult;
    }



}

