package com.telpa.ecommerce.tabsliders;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.telpa.ecommerce.R;
import com.telpa.ecommerce.adapters.RecyclerAdapter;

/**
 * Created by volkan on 13.07.2016.
 */

public class TabOne extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter recyclerAdapter;
    private RecyclerView.LayoutManager recyclerLayoutManager;

    private String[] myDataset = {"First","Second","Third","Forth","Fifth","sixth"};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.tab1,container,false);

        recyclerView = (RecyclerView)rootView.findViewById(R.id.recyclerView);

        recyclerView.setHasFixedSize(true);

        /*
        recyclerLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(recyclerLayoutManager);
        */

        recyclerLayoutManager = new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(recyclerLayoutManager);

        recyclerView.addItemDecoration(new RecyclerAdapter.SpaceItemDecoration(5));
        recyclerAdapter = new RecyclerAdapter(myDataset);
        recyclerView.setAdapter(recyclerAdapter);
        return rootView;
    }
}
