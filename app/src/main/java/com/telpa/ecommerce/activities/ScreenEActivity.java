package com.telpa.ecommerce.activities;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.telpa.ecommerce.ECommerceApp;
import com.telpa.ecommerce.R;
import com.telpa.ecommerce.ScreenE.IscreenEPresenter;
import com.telpa.ecommerce.ScreenE.IscreenEView;
import com.telpa.ecommerce.ScreenE.ScreenEPresenter;
import com.telpa.ecommerce.ScreenK.ScreenKPresenter;
import com.telpa.ecommerce.adapters.RecyclerAdapter;
import com.telpa.ecommerce.adapters.RecyclerAdapter_E;
import com.telpa.ecommerce.interfaces.IBasket;
import com.telpa.ecommerce.interfaces.ICategory;
import com.telpa.ecommerce.interfaces.IProduct;
import com.telpa.ecommerce.models.Category;
import com.telpa.ecommerce.utils.BaseActivity;

import java.util.ArrayList;

import javax.inject.Inject;

public class ScreenEActivity extends BaseActivity implements IscreenEView {
    @Inject
    IBasket basket;
    @Inject
    IProduct product;
    @Inject
    ICategory category;

    private RecyclerView recyclerView;
    private RecyclerView.Adapter recyclerAdapter;
    private RecyclerView.LayoutManager recyclerLayoutManager;
    private IscreenEPresenter screenEPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_e);
        ((ECommerceApp) getApplication()).getComponent().inject(this);

        screenEPresenter=new ScreenEPresenter(this);

        fcreateTitle("My Store" + " E");
        fcreateToolbar(this, false, true, true, R.id.toolbar);
        fcreateMenu(this, true);
        ShowScreen();
        recyclerView = (RecyclerView) findViewById(R.id.recyclerViewE);

        recyclerView.setHasFixedSize(true);

        /*
        recyclerLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(recyclerLayoutManager);
        */

        recyclerLayoutManager = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(recyclerLayoutManager);

        recyclerView.addItemDecoration(new RecyclerAdapter_E.SpaceItemDecoration(0));
        recyclerAdapter = new RecyclerAdapter_E(ScreenEActivity.this, screenEPresenter.categories().size(), R.layout.item_e, screenEPresenter.categories());
        recyclerView.setAdapter(recyclerAdapter);

    }

    @Override
    public void ShowScreen() {
        screenEPresenter.categories();

    }
}
