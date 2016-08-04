package com.telpa.ecommerce.activities;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.telpa.ecommerce.R;
import com.telpa.ecommerce.adapters.RecyclerAdapter;
import com.telpa.ecommerce.adapters.RecyclerAdapter_E;
import com.telpa.ecommerce.models.Category;
import com.telpa.ecommerce.utils.BaseActivity;

import java.util.ArrayList;

public class ScreenEActivity extends BaseActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter recyclerAdapter;
    private RecyclerView.LayoutManager recyclerLayoutManager;
    private ArrayList<Category> categories;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_e);


        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(2);
        Category a=new Category();
        a.setName("Category");
        a.setHighResImageUrl("");
        a.setLowResImageUrl("");
        a.setID(1);
        a.setNumOfProduct(2);
        a.setParentID(0);
        categories.add(a);
        categories.add(a);
        categories.add(a);

        fcreateTitle("My Store" + " E");
        fcreateToolbar(this,false, true, true, R.id.toolbar);
        fcreateMenu(this,true);

        recyclerView = (RecyclerView)findViewById(R.id.recyclerViewE);

        recyclerView.setHasFixedSize(true);

        /*
        recyclerLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(recyclerLayoutManager);
        */

        recyclerLayoutManager = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(recyclerLayoutManager);

        recyclerView.addItemDecoration(new RecyclerAdapter.SpaceItemDecoration(0));
        recyclerAdapter = new RecyclerAdapter_E(6, R.layout.item_e,categories);
        recyclerView.setAdapter(recyclerAdapter);

    }
}
