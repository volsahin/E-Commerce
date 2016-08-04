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
 * Created by volkan on 18.07.2016.
 */

public class FragmentCTab extends TabHelper {


    private RecyclerView recyclerView;
    private RecyclerView.Adapter recyclerAdapter;
    private RecyclerView.LayoutManager recyclerLayoutManager;

    private RecyclerView recyclerView2;
    private RecyclerView.Adapter recyclerAdapter2;
    private RecyclerView.LayoutManager recyclerLayoutManager2;


    public static FragmentCTab createTab(String title){
        FragmentCTab screenCTabOne = new FragmentCTab();
        screenCTabOne.setTitle(title);
        return screenCTabOne;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_c_tab1,container,false);

        recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerViewC);

        recyclerView.setHasFixedSize(true);


        recyclerLayoutManager = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(recyclerLayoutManager);

        recyclerView.addItemDecoration(new RecyclerAdapter.SpaceItemDecoration(4));
        recyclerAdapter = new RecyclerAdapter(5, R.layout.item_c);
        recyclerView.setAdapter(recyclerAdapter);

//**********************************************************
        recyclerView2 = (RecyclerView) rootView.findViewById(R.id.recyclerViewCitem);

        recyclerView2.setHasFixedSize(true);

        recyclerLayoutManager2 = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL);
        recyclerView2.setLayoutManager(recyclerLayoutManager2);

        recyclerView2.addItemDecoration(new RecyclerAdapter.SpaceItemDecoration(4));
        recyclerAdapter2 = new RecyclerAdapter(5, R.layout.item_i_and_c);
        recyclerView2.setAdapter(recyclerAdapter2);

        return rootView;

    }
}
