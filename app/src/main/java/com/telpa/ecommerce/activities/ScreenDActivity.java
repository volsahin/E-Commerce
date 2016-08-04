package com.telpa.ecommerce.activities;


import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.telpa.ecommerce.R;
import com.telpa.ecommerce.fragment.FragmentATab;
import com.telpa.ecommerce.fragment.FragmentDTab;
import com.telpa.ecommerce.interfaces.Category;
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


        // This list holds current tabs in ScreenA
        List<TabHelper> tabHelperList = new ArrayList<>();
        List<Category> categories = new ArrayList<>();
        Category a=new Category(1,"A",1,1,1);
        categories.add(a);
        Category b=new Category(1,"B",1,1,1);
        categories.add(b);
        Category c=new Category(1,"C",1,1,1);
        categories.add(c);

        for(Category i:categories){

            FragmentDTab tab=new FragmentDTab();
            tab.createTab(i.getName());
            tabHelperList.add(tab);
        }

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
