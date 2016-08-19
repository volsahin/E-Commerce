package com.telpa.ecommerce.activities.activityA;

import android.os.Bundle;
import android.view.View;

import com.telpa.ecommerce.R;
import com.telpa.ecommerce.utils.BaseActivity;
import com.telpa.ecommerce.utils.TabHelper;

import java.util.List;

public class ScreenA extends BaseActivity implements IScreenAView {
    IScreenAPresenter screenAPresenter;
    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_a);
        screenAPresenter = new ScreenAPresenterImpl(this, getApplication());
        screenAPresenter.getCategories(getLayoutInflater());
        screenAPresenter.setBaseItems();
        screenAPresenter.setTitle();
    }

    @Override
    public void search() {

    }

    @Override
    public void goBasket() {

    }


    @Override
    public void setBaseItems() {

        fcreateToolbar(this, false, true, true, R.id.toolbar);
        fcreateMenu(this, true);
    }

    @Override
    public void fCreateTabMenu(List<TabHelper> tabHelperList) {
        fcreateTabMenu(tabHelperList);
    }

    @Override
    public void setTitle(String title) {
        fcreateTitle(title);
    }
}
