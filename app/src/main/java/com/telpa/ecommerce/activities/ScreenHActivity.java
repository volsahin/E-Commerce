package com.telpa.ecommerce.activities;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.telpa.ecommerce.R;
import com.telpa.ecommerce.adapters.RecyclerAdapter;
import com.telpa.ecommerce.utils.BaseActivity;

public class ScreenHActivity extends BaseActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter recyclerAdapter;
    private RecyclerView.LayoutManager recyclerLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_h);

        fcreateTitle("My Store" + " H");
        fcreateToolbar(this,false, true, true, R.id.toolbar);
        fcreateMenu(this,true);

        recyclerView = (RecyclerView)findViewById(R.id.recyclerViewH);

        recyclerView.setHasFixedSize(true);


        recyclerLayoutManager = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(recyclerLayoutManager);

        recyclerView.addItemDecoration(new RecyclerAdapter.SpaceItemDecoration(0));
        recyclerAdapter = new RecyclerAdapter(10, R.layout.item_h);
        recyclerView.setAdapter(recyclerAdapter);

    }
}