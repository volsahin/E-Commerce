package com.telpa.ecommerce.activities;

import android.os.Bundle;
import android.widget.ListView;

import com.telpa.ecommerce.R;
import com.telpa.ecommerce.models.StandartList;
import com.telpa.ecommerce.adapters.ScreenHListAdapter;
import com.telpa.ecommerce.utils.BaseActivity;

import java.util.ArrayList;
import java.util.List;

public class ScreenHActivity extends BaseActivity {

    public List<StandartList> getList() {
        return list;
    }

    public void setList(List<StandartList> list) {
        this.list = list;
    }

    public List<StandartList> list = new ArrayList<StandartList>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_h);

        fcreateTitle("My Store");
        fcreateToolbar(this, true, true,R.id.toolbarHnoTab);
        fcreateMenu(this);



        list.add(new StandartList("Category", "3 Product"));
        list.add(new StandartList("Category", "9 Product"));
        list.add(new StandartList("Category", "7 Product"));
        list.add(new StandartList("Category", "35 Product"));
        list.add(new StandartList("Category", "16 Product"));
        list.add(new StandartList("Category", "13 Product"));
        list.add(new StandartList("Category", "59 Product"));
        list.add(new StandartList("Category", "27 Product"));
        list.add(new StandartList("Category", "35 Product"));
        list.add(new StandartList("Category", "16 Product"));


        ScreenHListAdapter la = new ScreenHListAdapter(this, list);
        ListView listView = (ListView) findViewById(R.id.listH);
        listView.setAdapter(la);

    }
}
