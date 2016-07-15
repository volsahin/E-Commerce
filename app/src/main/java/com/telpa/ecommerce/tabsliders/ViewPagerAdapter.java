package com.telpa.ecommerce.tabsliders;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by volkan on 13.07.2016.
 */

public class ViewPagerAdapter extends FragmentStatePagerAdapter {


    CharSequence titles[];
    int numbOfTabs;
    TabHelper helper;

    public ViewPagerAdapter(FragmentManager fm, CharSequence mTitles[], int mNumbOfTabsumb,TabHelper helper) {
        super(fm);

        this.titles = mTitles;
        this.numbOfTabs = mNumbOfTabsumb;
        this.helper = helper;

    }

@Override
    public Fragment getItem(int position) {
        return new TabOne();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }

    @Override
    public int getCount() {
        return numbOfTabs;
    }
}
