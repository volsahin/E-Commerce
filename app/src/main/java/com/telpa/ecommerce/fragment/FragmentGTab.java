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
import com.telpa.ecommerce.adapters.RecyclerAdapter_ABCG;
import com.telpa.ecommerce.adapters.RecyclerAdapter_ABGSmall;
import com.telpa.ecommerce.interfaces.IBasket;
import com.telpa.ecommerce.interfaces.ICategory;
import com.telpa.ecommerce.interfaces.IProduct;
import com.telpa.ecommerce.models.Category;
import com.telpa.ecommerce.models.Product;
import com.telpa.ecommerce.utils.TabHelper;

import java.util.ArrayList;

import javax.inject.Inject;

/**
 * Created by Gizem İlgar on 21.7.2016.
 */
public class FragmentGTab extends TabHelper {
    @Inject
    IBasket basket;
    @Inject
    IProduct product;
    @Inject
    ICategory category;

    private RecyclerView recyclerView;
    private RecyclerView.Adapter recyclerAdapter;
    private RecyclerView.LayoutManager recyclerLayoutManager;
    private ArrayList<Category> categories;


    public FragmentGTab createTab(String title) {
        FragmentGTab tabOne = new FragmentGTab();
        tabOne.setTitle(title);


        return tabOne;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //TODO
        categories = new ArrayList<>();
        Category a=new Category();
        a.setName("Category");
        a.setHighResImageUrl("");
        a.setLowResImageUrl("");
        a.setID(1);
        a.setNumOfProduct(2);
        a.setParentID(0);
        categories.add(a);
        categories.add(a);
        categories.add(a);
        //TODO
        ArrayList<String> url=new ArrayList<String>();
        url.add("http://www.telefonkilavuzu.com/wp-content/uploads/2016/01/telefon-numaras%C4%B1.jpg");
        categories=new ArrayList<Category>();
        Category b = new Category();
        b.setName("Category");
        b.setHighResImageUrl("");
        b.setLowResImageUrl("");
        b.setID(1);
        b.setNumOfProduct(2);
        b.setParentID(0);
        categories.add(b);
        categories.add(b);
        categories.add(b);

        View rootView = inflater.inflate(R.layout.fragment_g_tab1, container, false);


        recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerView1);

        recyclerView.setHasFixedSize(true);

        recyclerLayoutManager = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(recyclerLayoutManager);

        recyclerView.addItemDecoration(new RecyclerAdapter.SpaceItemDecoration(2));
        recyclerAdapter = new RecyclerAdapter_ABCG(getActivity(),categories.size(), R.layout.item_abcg,categories,"g",getApplication());
        recyclerView.setAdapter(recyclerAdapter);

        return rootView;
    }
}