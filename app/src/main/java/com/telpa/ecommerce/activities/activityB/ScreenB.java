package com.telpa.ecommerce.activities.activityB;

import android.os.Bundle;
import android.view.View;

import com.telpa.ecommerce.R;
import com.telpa.ecommerce.utils.BaseActivity;
import com.telpa.ecommerce.utils.TabHelper;

import java.util.List;

public class ScreenB extends BaseActivity implements IScreenBView {
    IScreenBPresenter screenBPresenter;
    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_b);
        setBaseItems();
        screenBPresenter = new ScreenBPresenterImpl(this, getApplication());
        screenBPresenter.setTitle();
        screenBPresenter.getCategories(getLayoutInflater());
    }

    @Override
    public void search() {

    }

    @Override
    public void goBasket() {

    }

    @Override
    public void fillFragments(List<TabHelper> tabHelperList) {
        fcreateTabMenu(tabHelperList);
    }

    @Override
    public void setTitle(String title) {
        fcreateTitle(title);
    }

    @Override
    public void setBaseItems() {
        fcreateToolbar(this, false, true, true, R.id.toolbar);
        fcreateMenu(this, true);
    }
}
