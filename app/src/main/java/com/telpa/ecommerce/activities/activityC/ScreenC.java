package com.telpa.ecommerce.activities.activityC;

import android.os.Bundle;
import android.view.View;

import com.telpa.ecommerce.R;
import com.telpa.ecommerce.activities.activityC.fragmentC.FragmentCView;
import com.telpa.ecommerce.models.Category;
import com.telpa.ecommerce.utils.BaseActivity;
import com.telpa.ecommerce.utils.TabHelper;

import java.util.ArrayList;
import java.util.List;

public class ScreenC extends BaseActivity implements IScreenCView {
    IScreenCPresenter screenCPresenter;
    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_c);



        fcreateToolbar(this, false, true, true, R.id.toolbar);
        fcreateMenu(this, true);
        screenCPresenter = new ScreenCPresenterImpl(this, getApplication());
        screenCPresenter.setTitle();
        screenCPresenter.getCategories();
    }

    @Override
    public void search() {

    }

    @Override
    public void goBasket() {

    }

    @Override
    public void fillFragments(ArrayList<Category> categories) {
        List<TabHelper> tabHelperList = new ArrayList<>();

        for (Category i : categories) {
            view = getLayoutInflater().inflate(R.layout.fragment_c_tab1, null);
            FragmentCView tab = new FragmentCView();
            tab.setView(view);
            tab.setCategory(i);
            tab.setTitle(i.getName());
            tab.setApplication(getApplication());
            tabHelperList.add(tab);
        }

        fcreateTabMenu(tabHelperList);

    }

    @Override
    public void setTitle(String title) {
        fcreateTitle(title);
    }
}
