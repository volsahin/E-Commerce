package com.telpa.ecommerce.activities;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.telpa.ecommerce.R;
import com.telpa.ecommerce.adapters.RecyclerAdapter;
import com.telpa.ecommerce.adapters.RecyclerAdapter_H;
import com.telpa.ecommerce.interfaces.IBasket;
import com.telpa.ecommerce.interfaces.ICategory;
import com.telpa.ecommerce.interfaces.IProduct;
import com.telpa.ecommerce.models.Category;
import com.telpa.ecommerce.utils.BaseActivity;

import java.util.ArrayList;

import javax.inject.Inject;

public class ScreenHActivity extends BaseActivity {
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
    private ArrayList<Integer> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_h);

        ArrayList<Integer> list=new ArrayList<Integer>();
        ArrayList<String> url=new ArrayList<String>();
        url.add("http://www.batmanda.com/rsm.batmanda/1970335733.jpg");
        list.add(2);
        categories=new ArrayList<Category>();
        Category a=new Category();
        a.setName("Category");
        a.setHighResImageUrl("http://www.batmanda.com/rsm.batmanda/1970335733.jpg");
        a.setLowResImageUrl("");
        a.setID(1);
        a.setNumOfProduct(2);
        a.setParentID(0);
        categories.add(a);
        categories.add(a);
        categories.add(a);

        fcreateTitle("My Store" + " H");
        fcreateToolbar(this,false, true, true, R.id.toolbar);
        fcreateMenu(this,true);

        recyclerView = (RecyclerView)findViewById(R.id.recyclerViewH);

        recyclerView.setHasFixedSize(true);


        recyclerLayoutManager = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(recyclerLayoutManager);

        recyclerView.addItemDecoration(new RecyclerAdapter.SpaceItemDecoration(0));
        recyclerAdapter = new RecyclerAdapter_H(this,categories.size(), R.layout.item_h,categories);
        recyclerView.setAdapter(recyclerAdapter);

    }
}