package com.telpa.ecommerce.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.telpa.ecommerce.R;
import com.telpa.ecommerce.StandartList;
import com.telpa.ecommerce.adapters.ListHAdapter;
import com.telpa.ecommerce.helper.BaseActivity;

import java.util.ArrayList;
import java.util.List;

public class CategoryH extends BaseActivity {

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
        setContentView(R.layout.activity_category_h);

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


        ListHAdapter la = new ListHAdapter(this, list);
        ListView listView = (ListView) findViewById(R.id.listH);
        listView.setAdapter(la);

    }
}
