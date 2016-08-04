package com.telpa.ecommerce.activities;


import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.telpa.ecommerce.R;
import com.telpa.ecommerce.adapters.RecyclerAdapter;
import com.telpa.ecommerce.adapters.RecyclerAdapter_I;
import com.telpa.ecommerce.models.Product;
import com.telpa.ecommerce.utils.BaseActivity;

import java.util.ArrayList;

public class ScreenIActivity extends BaseActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter recyclerAdapter;
    private RecyclerView.LayoutManager recyclerLayoutManager;
    private ArrayList<Product> products;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_i);


        ArrayList<String> url=new ArrayList<String>();
        url.add("url1");
        url.add("urls2");
        products=new ArrayList<Product>();
        Product a=new Product();
        a.setName("");
        a.setID(1);
        a.setCategoryID(1);
        a.setDescripton("");
        a.setHighResImageUrls(url);
        a.setLowResImageUrls(url);
        a.setPrice(30);
        a.setRating(2);
        a.setRating(3);
        products.add(a);

        fcreateTitle("My Store" + " I");
        fcreateToolbar(this,false, true, true, R.id.toolbar);
        fcreateMenu(this,true);

        recyclerView = (RecyclerView)findViewById(R.id.recyclerViewI);

        recyclerView.setHasFixedSize(true);


        recyclerLayoutManager = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(recyclerLayoutManager);

        recyclerView.addItemDecoration(new RecyclerAdapter.SpaceItemDecoration(0));
        recyclerAdapter = new RecyclerAdapter_I(10, R.layout.item_i_and_c,products);
        recyclerView.setAdapter(recyclerAdapter);

    }
}
