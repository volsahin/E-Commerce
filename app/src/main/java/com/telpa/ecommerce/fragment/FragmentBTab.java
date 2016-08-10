package com.telpa.ecommerce.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.telpa.ecommerce.R;
import com.telpa.ecommerce.adapters.RecyclerAdapter_ABCG;
import com.telpa.ecommerce.adapters.RecyclerAdapter_ABGSmall;
import com.telpa.ecommerce.adapters.RecyclerAdapter_BBig;
import com.telpa.ecommerce.interfaces.IBasket;
import com.telpa.ecommerce.interfaces.ICategory;
import com.telpa.ecommerce.interfaces.IProduct;
import com.telpa.ecommerce.models.Category;
import com.telpa.ecommerce.models.Product;
import com.telpa.ecommerce.utils.TabHelper;
import com.telpa.ecommerce.adapters.RecyclerAdapter;

import java.util.ArrayList;
import java.util.List;

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
    private ArrayList<Category> categories;


    public FragmentBTab createTab(String title) {  //, ArrayList<Product> products
        FragmentBTab tabTwo = new FragmentBTab();
        tabTwo.setTitle(title);

        return tabTwo;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //TODO
        ArrayList<String> url = new ArrayList<String>();
        url.add("http://images.hepsiburada.net/assets/Bilgisayar/200/Bilgisayar_4076599.jpg");
        products = new ArrayList<Product>();
        Product a = new Product();
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

        categories = new ArrayList<>();
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


        View rootView = inflater.inflate(R.layout.fragment_b_tab1, container, false);

        recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerView1);
        recyclerView.setHasFixedSize(true);
        recyclerLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(recyclerLayoutManager);
        recyclerView.addItemDecoration(new RecyclerAdapter.SpaceItemDecoration(2));
        recyclerAdapter = new RecyclerAdapter_BBig(getActivity(), products.size(), R.layout.item_b_big, products);
        recyclerView.setAdapter(recyclerAdapter);

        recyclerView2 = (RecyclerView) rootView.findViewById(R.id.recyclerView2);
        recyclerView2.setHasFixedSize(true);
        recyclerLayoutManager2 = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL);
        recyclerView2.setLayoutManager(recyclerLayoutManager2);
        recyclerView2.addItemDecoration(new RecyclerAdapter.SpaceItemDecoration(0));
        recyclerAdapter2 = new RecyclerAdapter_ABCG(getActivity(), categories.size(), R.layout.item_abcg, categories, "b");
        recyclerView2.setAdapter(recyclerAdapter2);

        return rootView;
    }
}