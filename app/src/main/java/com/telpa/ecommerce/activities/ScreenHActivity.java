package com.telpa.ecommerce.activities;

import android.os.Bundle;
import android.widget.ListView;

import com.telpa.ecommerce.R;
import com.telpa.ecommerce.models.HList;
import com.telpa.ecommerce.adapters.ScreenHListAdapter;
import com.telpa.ecommerce.utils.BaseActivity;

import java.util.ArrayList;
import java.util.List;

public class ScreenHActivity extends BaseActivity {

    public List<HList> getList() {
        return list;
    }

    public void setList(List<HList> list) {
        this.list = list;
    }

    public List<HList> list = new ArrayList<HList>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_h);

        fcreateTitle("My Store");
        fcreateToolbar(this, true, true,R.id.toolbarHnoTab);
        fcreateMenu(this);



        list.add(new HList("Category", "3 Product"));
        list.add(new HList("Category", "9 Product"));
        list.add(new HList("Category", "7 Product"));
        list.add(new HList("Category", "35 Product"));
        list.add(new HList("Category", "16 Product"));
        list.add(new HList("Category", "13 Product"));
        list.add(new HList("Category", "59 Product"));
        list.add(new HList("Category", "27 Product"));
        list.add(new HList("Category", "35 Product"));
        list.add(new HList("Category", "16 Product"));


        ScreenHListAdapter la = new ScreenHListAdapter(this, list);
        ListView listView = (ListView) findViewById(R.id.listH);
        listView.setAdapter(la);

    }
}
