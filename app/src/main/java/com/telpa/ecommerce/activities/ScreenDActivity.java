package com.telpa.ecommerce.activities;


import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.telpa.ecommerce.R;
import com.telpa.ecommerce.fragment.FragmentDTab;
import com.telpa.ecommerce.fragment.FragmentFTab;
import com.telpa.ecommerce.utils.BaseActivity;
import com.telpa.ecommerce.utils.TabHelper;

import java.util.ArrayList;
import java.util.List;

public class ScreenDActivity extends BaseActivity {

    private String[] arraySpinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_d);

        fcreateTitle("My Store" +" D");
        fcreateToolbar(this,false,  true, true,R.id.toolbar);
        fcreateMenu(this,true);


        List<TabHelper> tabHelperList = new ArrayList<>();
        tabHelperList.add(FragmentDTab.createTab("Category A"));
        tabHelperList.add(FragmentDTab.createTab("Category B"));
        tabHelperList.add(FragmentDTab.createTab("Category C"));


        fcreateTabMenu(tabHelperList);

        arraySpinner= new String[]{"Sort by", "Sort by"};

        Spinner spinner=(Spinner) findViewById(R.id.spinner1);
        Spinner spinner2=(Spinner) findViewById(R.id.spinner2);
        Spinner spinner3=(Spinner) findViewById(R.id.spinner3);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item, arraySpinner);

        spinner.setAdapter(adapter);
        spinner2.setAdapter(adapter);
        spinner3.setAdapter(adapter);

    }
}
