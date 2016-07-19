package com.telpa.ecommerce.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
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
import com.telpa.ecommerce.activities.BasketActivity;
import com.telpa.ecommerce.activities.ScreenJActivity;
import com.telpa.ecommerce.activities.ScreenAActivity;
import com.telpa.ecommerce.activities.ScreenBActivity;
import com.telpa.ecommerce.activities.ScreenCActivity;
import com.telpa.ecommerce.activities.ScreenEActivity;
import com.telpa.ecommerce.activities.ScreenHActivity;
import com.telpa.ecommerce.activities.ScreenIActivity;
import com.telpa.ecommerce.adapters.ViewPagerAdapter;

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

    public void fcreateToolbar(Context context, boolean hasDrawer, boolean hasHamburgerNav, int id) {

        mToolbar = (Toolbar) findViewById(id);

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


        new DrawerBuilder().withActivity(activity).build();

        PrimaryDrawerItem item1 = new PrimaryDrawerItem().
                withIdentifier(1).
                withName("ScreenA").
                withIcon(R.drawable.material_drawer_circle_mask);

        PrimaryDrawerItem item2 = new PrimaryDrawerItem()
                .withIdentifier(1)
                .withName("ScreenB")
                .withIcon(R.drawable.material_drawer_circle_mask);

        PrimaryDrawerItem item3 = new PrimaryDrawerItem()
                .withIdentifier(1)
                .withName("ScreenC")
                .withIcon(R.drawable.material_drawer_circle_mask);

        SecondaryDrawerItem item4 = (SecondaryDrawerItem) new SecondaryDrawerItem()
                .withIdentifier(2)
                .withName(R.string.app_name2);

        PrimaryDrawerItem item5 = new PrimaryDrawerItem()
                .withIdentifier(1)
                .withName("ScreenD")
                .withIcon(R.drawable.material_drawer_circle_mask);

        PrimaryDrawerItem item6 = new PrimaryDrawerItem()
                .withIdentifier(1)
                .withName("ScreenE")
                .withIcon(R.drawable.material_drawer_circle_mask);

        PrimaryDrawerItem item7 = new PrimaryDrawerItem()
                .withIdentifier(1)
                .withName("ScreenF")
                .withIcon(R.drawable.material_drawer_circle_mask);

        PrimaryDrawerItem item8 = new PrimaryDrawerItem()
                .withIdentifier(1)
                .withName("ScreenG")
                .withIcon(R.drawable.material_drawer_circle_mask);

        PrimaryDrawerItem item9 = new PrimaryDrawerItem()
                .withIdentifier(1)
                .withName("ScreenH")
                .withIcon(R.drawable.material_drawer_circle_mask);

        PrimaryDrawerItem item10 = new PrimaryDrawerItem()
                .withIdentifier(1)
                .withName("ScreenI")
                .withIcon(R.drawable.material_drawer_circle_mask);

        PrimaryDrawerItem item11 = new PrimaryDrawerItem()
                .withIdentifier(1)
                .withName("ScreenJ")
                .withIcon(R.drawable.material_drawer_circle_mask);

        PrimaryDrawerItem item12 = new PrimaryDrawerItem()
                .withIdentifier(1)
                .withName("ScreenK")
                .withIcon(R.drawable.material_drawer_circle_mask);

        PrimaryDrawerItem item13 = new PrimaryDrawerItem()
                .withIdentifier(1)
                .withName("ScreenL")
                .withIcon(R.drawable.material_drawer_circle_mask);


        //create the drawer and remember the `Drawer` result object
        Drawer result = new DrawerBuilder()
                .withActivity(activity)
                .withToolbar(mToolbar)
                .withAccountHeader(headerResult)
                .addDrawerItems(item1, item2, item3, item4, item5, item6, item7, item8, item9, item10, item11, item12, item13)
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {

                        switch (position) {
                            case 1:
                                Intent intent = new Intent(activity, ScreenAActivity.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                activity.startActivity(intent);
                                break;
                            case 2:
                                Intent intent2 = new Intent(activity, ScreenBActivity.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                activity.startActivity(intent2);
                                break;
                            case 3:
                                Intent intent3 = new Intent(activity, ScreenCActivity.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                activity.startActivity(intent3);
                                break;
                            case 5:
                                /*
                                Intent intent5 = new Intent(activity,ScreenDActivity.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                activity.startActivity(intent5);
                                */
                                break;
                            case 6:

                                Intent intent6 = new Intent(activity,ScreenEActivity.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                activity.startActivity(intent6);

                                break;
                            case 7:
                                /*
                                Intent intent7 = new Intent(activity,ScreenFActivity.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                activity.startActivity(intent7);
                                */
                                break;
                            case 8:
                                /*
                                Intent intent8 = new Intent(activity,ScreenGActivity.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                activity.startActivity(intent8);
                                */
                                break;
                            case 9:
                                Intent intent9 = new Intent(activity, ScreenHActivity.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                activity.startActivity(intent9);
                                break;
                            case 10:

                                Intent intent10 = new Intent(activity,ScreenIActivity.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                activity.startActivity(intent10);


                                break;
                            case 11:

                                Intent intent11 = new Intent(activity, ScreenJActivity.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                activity.startActivity(intent11);

                                break;
                            case 12:

                                Intent intent12 = new Intent(activity,BasketActivity.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                activity.startActivity(intent12);

                                break;
                            case 13:
                                /*
                                Intent intent13 = new Intent(activity,ScreenLActivity.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                activity.startActivity(intent12);
                                */
                                break;

                            case 14:
                                /*
                                Intent intent13 = new Intent(activity,ScreenLActivity.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                activity.startActivity(intent12);
                                */
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


}

