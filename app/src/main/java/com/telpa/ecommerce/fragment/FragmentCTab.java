package com.telpa.ecommerce.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.telpa.ecommerce.R;
import com.telpa.ecommerce.ui.TabHelper;
import com.telpa.ecommerce.adapters.RecyclerAdapter;

/**
 * Created by volkan on 18.07.2016.
 */

public class FragmentCTab extends TabHelper {


    private RecyclerView recyclerView;
    private RecyclerView.Adapter recyclerAdapter;
    private RecyclerView.LayoutManager recyclerLayoutManager;


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

        /*
        recyclerLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(recyclerLayoutManager);
        */

        recyclerLayoutManager = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(recyclerLayoutManager);

        recyclerView.addItemDecoration(new RecyclerAdapter.SpaceItemDecoration(10));
        recyclerAdapter = new RecyclerAdapter(5, R.layout.screen_c_row);
        recyclerView.setAdapter(recyclerAdapter);

        return rootView;

    }
}
