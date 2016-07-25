package com.telpa.ecommerce.activities;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.telpa.ecommerce.R;
import com.telpa.ecommerce.adapters.RecyclerAdapter;
import com.telpa.ecommerce.utils.BaseActivity;

public class ScreenEActivity extends BaseActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter recyclerAdapter;
    private RecyclerView.LayoutManager recyclerLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_e);

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

        recyclerView.addItemDecoration(new RecyclerAdapter.SpaceItemDecoration(30));
        recyclerAdapter = new RecyclerAdapter(6, R.layout.item_e);
        recyclerView.setAdapter(recyclerAdapter);

    }
}
