package com.telpa.ecommerce.activities.activityF;

import android.os.Bundle;
import android.view.View;

import com.telpa.ecommerce.R;
import com.telpa.ecommerce.activities.activityF.fragmentF.FragmentFView;
import com.telpa.ecommerce.models.Category;
import com.telpa.ecommerce.utils.BaseActivity;
import com.telpa.ecommerce.utils.TabHelper;

import java.util.ArrayList;
import java.util.List;

public class ScreenF extends BaseActivity implements IScreenFView {
    IScreenFPresenter screenFPresenter;
    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_f);


        fcreateTitle("My Store" + " F");
        fcreateToolbar(this, false, true, true, R.id.toolbar);
        fcreateMenu(this, true);

        screenFPresenter = new ScreenFPresenterImpl(this, getApplication());
        screenFPresenter.getCategories();
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
            view = getLayoutInflater().inflate(R.layout.fragment_f_tab1, null);
            FragmentFView tab = new FragmentFView();
            tab.setView(view);
            tab.setCategory(i);
            tab.setTitle(i.getName());
            tab.setApplication(getApplication());
            tabHelperList.add(tab);
        }

        fcreateTabMenu(tabHelperList);

    }
}
