package com.telpa.ecommerce.activities.ActivityG;

import android.os.Bundle;
import android.view.View;

import com.telpa.ecommerce.R;
import com.telpa.ecommerce.fragment.FragmentG.FragmentGView;
import com.telpa.ecommerce.models.Category;
import com.telpa.ecommerce.utils.BaseActivity;
import com.telpa.ecommerce.utils.TabHelper;

import java.util.ArrayList;
import java.util.List;

public class ScreenG extends BaseActivity implements IScreenGView {
    IScreenGPresenter screenGPresenter;
    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_g);


        fcreateTitle("My Store" + " G");
        fcreateToolbar(this, false, true, true, R.id.toolbar);
        fcreateMenu(this, true);

        screenGPresenter = new ScreenGPresenterImpl(this, getApplication());
        screenGPresenter.getCategories();
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
            view = getLayoutInflater().inflate(R.layout.fragment_g_tab1, null);
            FragmentGView tab = new FragmentGView();
            tab.setView(view);
            tab.setCategory(i);
            tab.setTitle(i.getName());
            tab.setApplication(getApplication());
            tabHelperList.add(tab);
        }

        fcreateTabMenu(tabHelperList);

    }
}
