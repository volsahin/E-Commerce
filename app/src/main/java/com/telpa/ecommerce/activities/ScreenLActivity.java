package com.telpa.ecommerce.activities;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;

import com.telpa.ecommerce.R;
import com.telpa.ecommerce.adapters.RecyclerAdapter;
import com.telpa.ecommerce.utils.BaseActivity;



public class ScreenLActivity extends BaseActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter recyclerAdapter;
    private RecyclerView.LayoutManager recyclerLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_l);


        fcreateTitle("Product");
        fcreateToolbar(this,false,true,false,R.id.toolbar);
        fcreateMenu(this, true);



        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_l);
        recyclerView.setHasFixedSize(true);

/*
        recyclerLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(recyclerLayoutManager);

*/

        recyclerLayoutManager = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(recyclerLayoutManager);

        recyclerView.addItemDecoration(new RecyclerAdapter.SpaceItemDecoration(10));
        recyclerAdapter = new RecyclerAdapter(10, R.layout.item_l_comment_row);
        recyclerView.setAdapter(recyclerAdapter);


    }
}
