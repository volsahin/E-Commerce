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
import com.telpa.ecommerce.adapters.RecyclerAdapter_CSmall;
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
 * Created by volkan on 18.07.2016.
 */

public class FragmentCTab extends TabHelper {
    @Inject
    IBasket basket;
    @Inject
    IProduct product;
    @Inject
    ICategory category;

    private RecyclerView recyclerView;
    private RecyclerView.Adapter recyclerAdapter;
    private RecyclerView.LayoutManager recyclerLayoutManager;

    private RecyclerView recyclerView2;
    private RecyclerView.Adapter recyclerAdapter2;
    private RecyclerView.LayoutManager recyclerLayoutManager2;

    private ArrayList<Category> categories;
    private ArrayList<Product> products;

    public FragmentCTab createTab(String title){
        FragmentCTab screenCTabOne = new FragmentCTab();
        screenCTabOne.setTitle(title);


        return screenCTabOne;
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
        url.add("url1");
        url.add("urls2");
        products=new ArrayList<Product>();
        Product b=new Product();
        b.setName("");
        b.setID(1);
        b.setCategoryID(1);
        b.setDescripton("");
        b.setHighResImageUrls(url);
        b.setLowResImageUrls(url);
        b.setPrice(30);
        b.setRating(2);
        b.setRating(3);
        products.add(b);

        View rootView = inflater.inflate(R.layout.fragment_c_tab1,container,false);

        recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerViewC);

        recyclerView.setHasFixedSize(true);


        recyclerLayoutManager = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(recyclerLayoutManager);

        recyclerView.addItemDecoration(new RecyclerAdapter.SpaceItemDecoration(0));
        recyclerAdapter = new RecyclerAdapter_ABCG(getActivity(), categories.size() , R.layout.item_abcg, categories,"c");
        recyclerView.setAdapter(recyclerAdapter);


        return rootView;

    }
}
