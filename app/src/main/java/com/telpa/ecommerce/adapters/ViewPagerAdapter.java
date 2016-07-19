package com.telpa.ecommerce.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.telpa.ecommerce.utils.TabHelper;

import java.util.List;

/**
 * Created by volkan on 13.07.2016.
 */

public class ViewPagerAdapter extends FragmentStatePagerAdapter {


    int numbOfTabs;
    List<TabHelper> helper;

    public ViewPagerAdapter(FragmentManager fm,int mNumbOfTabsumb,List<TabHelper> helper) {
        super(fm);

        this.numbOfTabs = mNumbOfTabsumb;
        this.helper = helper;

    }

@Override
    public Fragment getItem(int position) {
        return helper.get(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return helper.get(position).getTitle();
    }

    @Override
    public int getCount() {
        return numbOfTabs;
    }
}
