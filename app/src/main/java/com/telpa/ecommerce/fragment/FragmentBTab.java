package com.telpa.ecommerce.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.telpa.ecommerce.R;
import com.telpa.ecommerce.utils.TabHelper;
import com.telpa.ecommerce.adapters.RecyclerAdapter;

/**
 * Created by volkan on 13.07.2016.
 */

public class FragmentBTab extends TabHelper {
    private RecyclerView recyclerView;
    private RecyclerView recyclerView2;
    private RecyclerView.Adapter recyclerAdapter;
    private RecyclerView.Adapter recyclerAdapter2;
    private RecyclerView.LayoutManager recyclerLayoutManager;
    private RecyclerView.LayoutManager recyclerLayoutManager2;



    public static FragmentBTab createTab(String title){
        FragmentBTab tabTwo = new FragmentBTab();
        tabTwo.setTitle(title);
        return tabTwo;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_b_tab1, container, false);

        recyclerView2 = (RecyclerView) rootView.findViewById(R.id.recyclerView2);

        recyclerView2.setHasFixedSize(true);


        recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerView1);

        recyclerView.setHasFixedSize(true);

        /*
        recyclerLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(recyclerLayoutManager);
        */


        recyclerLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(recyclerLayoutManager);


        recyclerLayoutManager2 = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
        recyclerView2.setLayoutManager(recyclerLayoutManager2);

        recyclerView.addItemDecoration(new RecyclerAdapter.SpaceItemDecoration(2));
        recyclerView2.addItemDecoration(new RecyclerAdapter.SpaceItemDecoration(2));


        recyclerAdapter = new RecyclerAdapter(2, R.layout.item_b_big);
        recyclerAdapter2 = new RecyclerAdapter(6, R.layout.item_a_small);

        recyclerView.setAdapter(recyclerAdapter);
        recyclerView2.setAdapter(recyclerAdapter2);
        return rootView;
    }
}