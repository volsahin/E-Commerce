package com.telpa.ecommerce.activities;


import android.os.Bundle;
import android.widget.ListView;
import com.telpa.ecommerce.R;
import com.telpa.ecommerce.adapters.ScreenIListAdapter;
import com.telpa.ecommerce.models.IList;
import com.telpa.ecommerce.utils.BaseActivity;

import java.util.ArrayList;
import java.util.List;

public class ScreenIActivity extends BaseActivity {
String string;

    public List<IList> getList() {
        return I_list;
    }

    public void setList(List<IList> I_list) {
        this.I_list = I_list;
    }

    public List<IList> I_list = new ArrayList<IList>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_i);


        fcreateTitle("Category");
        fcreateToolbar(this, true, false,R.id.toolbar);
        fcreateMenu(this, true);

        string=getString(R.string.lorem);

        I_list.add(new IList("Product","100$",string));
        I_list.add(new IList("Product","100$",string));
        I_list.add(new IList("Product","100$",string));
        I_list.add(new IList("Product","100$",string));
        I_list.add(new IList("Product","100$",string));
        I_list.add(new IList("Product","100$",string));
        I_list.add(new IList("Product","100$",string));
        I_list.add(new IList("Product","100$",string));
        I_list.add(new IList("Product","100$",string));
        I_list.add(new IList("Product","100$",string));

        ScreenIListAdapter la = new ScreenIListAdapter(this, I_list);
        ListView listView = (ListView) findViewById(R.id.listI);
        listView.setAdapter(la);

    }
}