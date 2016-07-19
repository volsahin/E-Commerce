package com.telpa.ecommerce.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;

import com.telpa.ecommerce.R;
import com.telpa.ecommerce.adapters.BasketListAdapter;
import com.telpa.ecommerce.models.BasketList;
import com.telpa.ecommerce.models.HList;
import com.telpa.ecommerce.models.IList;
import com.telpa.ecommerce.utils.BaseActivity;

import java.util.ArrayList;
import java.util.List;

public class BasketActivity extends BaseActivity {
    public List<BasketList> list = new ArrayList<BasketList>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basket);

        fcreateTitle("My Store");
        fcreateToolbar(this, true, false, R.id.toolbar);
        fcreateMenu(this, false);


        list.add(new BasketList("Product1", "$100"));
        list.add(new BasketList("Product2", "$100"));
        list.add(new BasketList("Product3", "$100"));
        list.add(new BasketList("Product4", "$100"));

        BasketListAdapter adapter=new BasketListAdapter(this, list);
        ListView listView=(ListView) findViewById(R.id.basketList);
        listView.setAdapter(adapter);
    }
}
