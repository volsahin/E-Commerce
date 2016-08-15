package com.telpa.ecommerce.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.mikepenz.materialdrawer.AccountHeader;
import com.mikepenz.materialdrawer.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.ProfileDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IProfile;
import com.telpa.ecommerce.R;
import com.telpa.ecommerce.activities.ActivityB.ScreenB;
import com.telpa.ecommerce.activities.ScreenMActivity_Basket;
import com.telpa.ecommerce.activities.ScreenDActivity;
import com.telpa.ecommerce.activities.ScreenFActivity;
import com.telpa.ecommerce.activities.ScreenGActivity;
import com.telpa.ecommerce.activities.ScreenJActivity_Form;
import com.telpa.ecommerce.activities.ScreenAActivity;
import com.telpa.ecommerce.activities.ScreenBActivity;
import com.telpa.ecommerce.activities.ScreenCActivity;
import com.telpa.ecommerce.activities.ScreenEActivity;
import com.telpa.ecommerce.activities.ScreenHActivity;
import com.telpa.ecommerce.activities.ScreenIActivity;
import com.telpa.ecommerce.activities.ScreenKActivity;
import com.telpa.ecommerce.activities.ScreenLActivity;
import com.telpa.ecommerce.activities.form.FormActivity;
import com.telpa.ecommerce.adapters.ViewPagerAdapter;

import java.io.InputStream;
import java.net.URL;
import java.util.List;

public class BaseActivity extends AppCompatActivity {

    public Drawer drawer = null;
    public Toolbar mToolbar;
    public TextView title;
    public int badgeCount;
    ImageButton basket, search;
    private SlidingTabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter vpAdapter;

    CharSequence titles[] = {"Category A", "Category B", "Category C"};
    int numbOftabs = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    public void fcreateTitle(String titleName) {
        title = (TextView) findViewById(R.id.title);
        title.setText(titleName);
        title.setTextSize(18);

    }

    public void fcreateMenu(final Context context, boolean visible) {
        basket = (ImageButton) findViewById(R.id.basketButton);
        search = (ImageButton) findViewById(R.id.searchButton);
        if (visible) {

            basket.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(context, "Basket", Toast.LENGTH_SHORT).show();


                }
            });

            search.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(context, "Search", Toast.LENGTH_SHORT).show();
                }
            });
        } else {
            basket.setVisibility(View.INVISIBLE);
            search.setVisibility(View.INVISIBLE);
        }
    }

    public void fcreateTabMenu(List<TabHelper> helper) {

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        tabLayout = (SlidingTabLayout) findViewById(R.id.tablayout);

        vpAdapter = new ViewPagerAdapter(getSupportFragmentManager(), helper.size(), helper);
        viewPager.setAdapter(vpAdapter);

        tabLayout.setDistributeEvenly(true);
        tabLayout.setViewPager(viewPager);
    }

    public void fcreateToolbar(Context context, boolean isTransparent,boolean hasDrawer, boolean hasHamburgerNav, int id) {

        mToolbar = (Toolbar) findViewById(id);

        if(isTransparent)
            mToolbar.setBackgroundColor(getResources().getColor(R.color.toolbarTransparent));


        if (hasDrawer)
            drawer = drawerBuilder(this, accountHeaderBuilder(this));


        if (hasHamburgerNav) {
            mToolbar.setNavigationIcon(R.drawable.ic_menu_white_24dp);

            mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    drawer.openDrawer();
                }
            });

        } else {

            mToolbar.setNavigationIcon(R.drawable.ic_keyboard_backspace_white_24dp);


            mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    drawer.openDrawer();
                }
            });
        }
    }

    public Drawer drawerBuilder(final Activity activity, AccountHeader headerResult) {


        PrimaryDrawerItem item1 =  itemPlacer(1,"ScreenA",R.drawable.material_drawer_circle_mask);

        PrimaryDrawerItem item2 =  itemPlacer(1,"ScreenB",R.drawable.material_drawer_circle_mask);

        PrimaryDrawerItem item3 =  itemPlacer(1,"ScreenC",R.drawable.material_drawer_circle_mask);

        SecondaryDrawerItem item4 = (SecondaryDrawerItem) new SecondaryDrawerItem().withIdentifier(2).withName(R.string.app_name2);

        PrimaryDrawerItem item5 =  itemPlacer(1,"ScreenD",R.drawable.material_drawer_circle_mask);

        PrimaryDrawerItem item6 =  itemPlacer(1,"ScreenE",R.drawable.material_drawer_circle_mask);

        PrimaryDrawerItem item7 =  itemPlacer(1,"ScreenF",R.drawable.material_drawer_circle_mask);

        PrimaryDrawerItem item8 =  itemPlacer(1,"ScreenG",R.drawable.material_drawer_circle_mask);;

        PrimaryDrawerItem item9 =  itemPlacer(1,"ScreenH",R.drawable.material_drawer_circle_mask);

        PrimaryDrawerItem item10 = itemPlacer(1,"ScreenI",R.drawable.material_drawer_circle_mask);

        PrimaryDrawerItem item11 = itemPlacer(1,"ScreenJ",R.drawable.material_drawer_circle_mask);

        PrimaryDrawerItem item12 = itemPlacer(1,"ScreenK",R.drawable.material_drawer_circle_mask);

        PrimaryDrawerItem item13 = itemPlacer(1,"ScreenL",R.drawable.material_drawer_circle_mask);

        PrimaryDrawerItem item14 = itemPlacer(1,"ScreenM",R.drawable.material_drawer_circle_mask);


        //create the drawer and remember the `Drawer` result object

        final Drawer result = new DrawerBuilder()
                .withActivity(activity)
                .withToolbar(mToolbar)
                .withAccountHeader(headerResult)
                .addDrawerItems(item1, item2, item3, item4, item5, item6, item7, item8, item9, item10, item11, item12, item13, item14)
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {

                        switch (position) {
                            case 1:
                                intentToActivity(activity,ScreenAActivity.class);
                                break;
                            case 2:
                                intentToActivity(activity,ScreenB.class);
                                break;
                            case 3:
                                intentToActivity(activity,ScreenCActivity.class);
                                break;
                            case 5:
                                intentToActivity(activity,ScreenDActivity.class);
                                break;
                            case 6:
                                intentToActivity(activity,ScreenEActivity.class);
                                break;
                            case 7:
                                intentToActivity(activity,ScreenFActivity.class);
                                break;
                            case 8:
                                intentToActivity(activity,ScreenGActivity.class);
                                break;
                            case 9:
                                intentToActivity(activity,ScreenHActivity.class);
                                break;
                            case 10:
                                intentToActivity(activity,ScreenIActivity.class);
                                break;
                            case 11:
                                intentToActivity(activity,FormActivity.class);
                                break;
                            case 12:
                                intentToActivity(activity,ScreenKActivity.class);
                                break;
                            case 13:
                                intentToActivity(activity, ScreenLActivity.class);
                                break;

                            case 14:
                                intentToActivity(activity,ScreenMActivity_Basket.class);
                                // Activity M
                                break;

                        }

                        return true;
                    }
                })
                .build();

        return result;
    }


    public AccountHeader accountHeaderBuilder(Activity activity) {
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


    public PrimaryDrawerItem itemPlacer(int identifier,String name , int drawable){

        PrimaryDrawerItem item = new PrimaryDrawerItem()
                .withIdentifier(identifier)
                .withName(name)
                .withIcon(drawable);

        return item;
    }

    public void intentToActivity(Activity activity,Class cls){

        Intent intent = new Intent(activity, cls);
        activity.startActivity(intent);
    }


}

