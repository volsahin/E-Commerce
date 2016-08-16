package com.telpa.ecommerce.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.telpa.ecommerce.fragment.FragmentKPhotoSlider;

/**
 * Created by volkan on 22.07.2016.
 */

public class ViewPagerAdapterK extends FragmentStatePagerAdapter {

    int amount;

    public ViewPagerAdapterK(FragmentManager fm, int amount) {
        super(fm);
        this.amount = amount;
    }

    @Override
    public Fragment getItem(int position) {
        return new FragmentKPhotoSlider();
    }

    @Override
    public int getCount() {
        return amount;
    }
}
