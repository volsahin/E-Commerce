package com.telpa.ecommerce.activities.activityD;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.telpa.ecommerce.R;
import com.telpa.ecommerce.activities.activityD.fragmentD.FragmentDView;
import com.telpa.ecommerce.models.Category;
import com.telpa.ecommerce.utils.BaseActivity;
import com.telpa.ecommerce.utils.TabHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mert on 16.08.2016.
 */
public class ScreenD extends BaseActivity implements IScreenDView {


    IScreenDPresenter screenDPresenter;


    View view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_d);

        fcreateTitle("My Store" + " D");
        fcreateToolbar(this, false, true, true, R.id.toolbar);
        fcreateMenu(this, true);

        screenDPresenter = new ScreenDPresenterImpl(this, getApplication());
        screenDPresenter.getCategories();

        setSpinner();

    }

    public void setSpinner() {

        String[] arraySpinner = new String[]{"Sort by", "Sort by"};

        Spinner spinner = (Spinner) findViewById(R.id.spinner1);
        Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);
        Spinner spinner3 = (Spinner) findViewById(R.id.spinner3);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, arraySpinner);

        spinner.setAdapter(adapter);
        spinner2.setAdapter(adapter);
        spinner3.setAdapter(adapter);

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
            view = getLayoutInflater().inflate(R.layout.fragment_d_tab1, null);
            FragmentDView tab = new FragmentDView();
            tab.setView(view);
            tab.setCategory(i);
            tab.setTitle(i.getName());
            tab.setApplication(getApplication());
            tabHelperList.add(tab);
        }

        fcreateTabMenu(tabHelperList);
    }
}
