package com.telpa.ecommerce.activities.activityH;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.telpa.ecommerce.ECommerceApp;
import com.telpa.ecommerce.R;
import com.telpa.ecommerce.activities.activityH.IScreenHPresenter;
import com.telpa.ecommerce.activities.activityH.IScreenHView;
import com.telpa.ecommerce.activities.activityH.ScreenHPresenter;
import com.telpa.ecommerce.adapters.RecyclerAdapter;
import com.telpa.ecommerce.adapters.RecyclerAdapter_H;
import com.telpa.ecommerce.interfaces.IBasket;
import com.telpa.ecommerce.interfaces.ICategory;
import com.telpa.ecommerce.interfaces.IProduct;
import com.telpa.ecommerce.models.Category;
import com.telpa.ecommerce.utils.BaseActivity;

import java.util.ArrayList;

import javax.inject.Inject;

public class ScreenHActivity extends BaseActivity implements IScreenHView{
    @Inject
    IBasket basket;
    @Inject
    IProduct product;
    @Inject
    ICategory category;

    private RecyclerView recyclerView;
    private RecyclerView.Adapter recyclerAdapter;
    private RecyclerView.LayoutManager recyclerLayoutManager;
    private IScreenHPresenter screenHPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_h);
        fcreateTitle("My Store" + " H");
        fcreateToolbar(this,false, true, true, R.id.toolbar);
        fcreateMenu(this,true);
        screenHPresenter=new ScreenHPresenter(this,getApplication());
        ((ECommerceApp) getApplication()).getComponent().inject(this);
        recyclerView = (RecyclerView)findViewById(R.id.recyclerViewH);
        recyclerView.setHasFixedSize(true);
        ShowScreen();
        recyclerLayoutManager = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(recyclerLayoutManager);

        recyclerView.addItemDecoration(new RecyclerAdapter.SpaceItemDecoration(0));
        recyclerAdapter = new RecyclerAdapter_H(this,screenHPresenter.categories().size(), R.layout.item_h,screenHPresenter.categories());
        recyclerView.setAdapter(recyclerAdapter);

    }
    @Override
    public void ShowScreen() {
        screenHPresenter.categories();

    }
}