package com.telpa.ecommerce.helper;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

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

public class BaseActivity extends AppCompatActivity {

    public Drawer result = null;
    public Toolbar mToolbar;
    public TextView title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


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
                .addDrawerItems(
                        item1,
                        //new DividerDrawerItem(),
                        item2,
                        //new SecondaryDrawerItem(),
                        item3,
                        //new SecondaryDrawerItem(),
                        item4,item5,item6
                        //new SecondaryDrawerItem()
                )
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

