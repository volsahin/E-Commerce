package com.telpa.ecommerce.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.telpa.ecommerce.R;
import com.telpa.ecommerce.StandartList;
import com.telpa.ecommerce.adapters.ListHAdapter;
import com.telpa.ecommerce.helper.BaseActivity;

import java.util.ArrayList;
import java.util.List;

public class CategoryH extends BaseActivity{

    private List<StandartList> list=new ArrayList<StandartList>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_h);
        fcreateTitle("My Store");
        fcreateToolbar(this,true,true);
        fcreateMenu(this);
        fcreateTabMenu();
        list.add(new StandartList("Category","3 Product"));
        list.add(new StandartList("Category","9 Product"));
        list.add(new StandartList("Category","7 Product"));
        list.add(new StandartList("Category","35 Product"));
        list.add(new StandartList("Category","16 Product"));


    }
}
