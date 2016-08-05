package com.telpa.ecommerce.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.telpa.ecommerce.R;
import com.telpa.ecommerce.adapters.RecyclerAdapter_ABGSmall;
import com.telpa.ecommerce.adapters.RecyclerAdapter_BBig;
import com.telpa.ecommerce.interfaces.IBasket;
import com.telpa.ecommerce.interfaces.ICategory;
import com.telpa.ecommerce.interfaces.IProduct;
import com.telpa.ecommerce.models.Product;
import com.telpa.ecommerce.utils.TabHelper;
import com.telpa.ecommerce.adapters.RecyclerAdapter;

import java.util.ArrayList;

import javax.inject.Inject;

/**
 * Created by volkan on 13.07.2016.
 */

public class FragmentBTab extends TabHelper {
    @Inject
    IBasket basket;
    @Inject
    IProduct product;
    @Inject
    ICategory category;

    private RecyclerView recyclerView;
    private RecyclerView recyclerView2;
    private RecyclerView.Adapter recyclerAdapter;
    private RecyclerView.Adapter recyclerAdapter2;
    private RecyclerView.LayoutManager recyclerLayoutManager;
    private RecyclerView.LayoutManager recyclerLayoutManager2;
    private ArrayList<Product> products;




    public  FragmentBTab createTab(String title){
        FragmentBTab tabTwo = new FragmentBTab();
        tabTwo.setTitle(title);
        ArrayList<String> url=new ArrayList<String>();
        url.add("url1");
        url.add("urls2");
        products=new ArrayList<Product>();
        Product a=new Product();
        a.setName("");
        a.setID(1);
        a.setCategoryID(1);
        a.setDescripton("");
        a.setHighResImageUrls(url);
        a.setLowResImageUrls(url);
        a.setPrice(30);
        a.setRating(2);
        a.setRating(3);
        products.add(a);
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

        recyclerLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(recyclerLayoutManager);


        recyclerLayoutManager2 = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
        recyclerView2.setLayoutManager(recyclerLayoutManager2);

        recyclerView.addItemDecoration(new RecyclerAdapter.SpaceItemDecoration(2));
        recyclerView2.addItemDecoration(new RecyclerAdapter.SpaceItemDecoration(2));

        recyclerAdapter = new RecyclerAdapter_BBig(2, R.layout.item_b_big,products);
        recyclerAdapter2 = new RecyclerAdapter_ABGSmall(getActivity(),6, R.layout.item_a_and_b_small,products);

        recyclerView.setAdapter(recyclerAdapter);
        recyclerView2.setAdapter(recyclerAdapter2);
        return rootView;
    }
}