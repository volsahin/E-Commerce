package com.telpa.ecommerce.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.telpa.ecommerce.R;
import com.telpa.ecommerce.adapters.MasonryAdapter;
import com.telpa.ecommerce.adapters.RecyclerAdapter;
import com.telpa.ecommerce.models.SpacesItemDecoration;
import com.telpa.ecommerce.utils.TabHelper;

/**
 * Created by Gizem İlgar on 21.7.2016.
 */
public class FragmentDTab extends TabHelper {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter recyclerAdapter;
    private RecyclerView.LayoutManager recyclerLayoutManager;


    public static FragmentDTab createTab(String title){
        FragmentDTab tabOne = new FragmentDTab();
        tabOne.setTitle(title);
        return tabOne;
    }



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_d_tab1, container, false);

        recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerViewD);

        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));

        MasonryAdapter adapter = new MasonryAdapter(this);
        recyclerView.setAdapter(adapter);
        SpacesItemDecoration decoration = new SpacesItemDecoration(16);
        recyclerView.addItemDecoration(decoration);
        return rootView;

    }
}
