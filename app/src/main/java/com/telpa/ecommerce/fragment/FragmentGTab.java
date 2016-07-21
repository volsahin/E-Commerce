package com.telpa.ecommerce.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.telpa.ecommerce.R;
import com.telpa.ecommerce.adapters.RecyclerAdapter;
import com.telpa.ecommerce.utils.TabHelper;

/**
 * Created by Gizem İlgar on 21.7.2016.
 */
public class FragmentGTab extends TabHelper {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter recyclerAdapter;
    private RecyclerView recyclerView2;
    private RecyclerView.Adapter recyclerAdapter2;
    private RecyclerView.LayoutManager recyclerLayoutManager,recyclerLayoutManager2;


    public static FragmentGTab createTab(String title){
        FragmentGTab tabOne = new FragmentGTab();
        tabOne.setTitle(title);
        return tabOne;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_g_tab1, container, false);

        recyclerView2 = (RecyclerView) rootView.findViewById(R.id.recyclerViewG);

        recyclerView2.setHasFixedSize(true);


        recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerView1);

        recyclerView.setHasFixedSize(true);

        recyclerLayoutManager = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(recyclerLayoutManager);


        recyclerLayoutManager2 = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
        recyclerView2.setLayoutManager(recyclerLayoutManager2);

        recyclerView.addItemDecoration(new RecyclerAdapter.SpaceItemDecoration(10));
        recyclerView2.addItemDecoration(new RecyclerAdapter.SpaceItemDecoration(10));


        recyclerAdapter = new RecyclerAdapter(6, R.layout.item_g_row);
        recyclerAdapter2 = new RecyclerAdapter(3, R.layout.item_g_row);

        recyclerView.setAdapter(recyclerAdapter);
        recyclerView2.setAdapter(recyclerAdapter2);
        return rootView;
    }
}