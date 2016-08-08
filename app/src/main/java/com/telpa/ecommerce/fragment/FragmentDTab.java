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
import com.telpa.ecommerce.adapters.RecyclerAdapter_D;
import com.telpa.ecommerce.interfaces.IBasket;
import com.telpa.ecommerce.interfaces.ICategory;
import com.telpa.ecommerce.interfaces.IProduct;
import com.telpa.ecommerce.models.Product;
import com.telpa.ecommerce.utils.TabHelper;

import java.util.ArrayList;

import javax.inject.Inject;

/**
 * Created by Gizem İlgar on 21.7.2016.
 */
public class FragmentDTab extends TabHelper {
    @Inject
    IBasket basket;
    @Inject
    IProduct product;
    @Inject
    ICategory category;

    private RecyclerView recyclerView;
    private RecyclerView.Adapter recyclerAdapter;
    private RecyclerView.LayoutManager recyclerLayoutManager;
    private ArrayList<Product> products;


    public FragmentDTab createTab(String title){
        FragmentDTab tabOne = new FragmentDTab();
        tabOne.setTitle(title);
        ArrayList<String> url=new ArrayList<String>();
        url.add("http://www.batmanda.com/rsm.batmanda/1970335733.jpg");
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
        return tabOne;
    }



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_d_tab1, container, false);



        recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerViewD);

        recyclerView.setHasFixedSize(true);


        recyclerLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(recyclerLayoutManager);


        recyclerView.addItemDecoration(new RecyclerAdapter.SpaceItemDecoration(2));


        recyclerAdapter = new RecyclerAdapter_D(getActivity(),10, R.layout.item_d,products);

        recyclerView.setAdapter(recyclerAdapter);
        return rootView;
    }
}
