package com.telpa.ecommerce.activities.activityI;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.telpa.ecommerce.R;
import com.telpa.ecommerce.adapters.RecyclerAdapter;
import com.telpa.ecommerce.adapters.RecyclerAdapter_I;
import com.telpa.ecommerce.models.Category;
import com.telpa.ecommerce.models.Product;
import com.telpa.ecommerce.utils.BaseActivity;

import java.util.ArrayList;

public class ScreenI extends BaseActivity implements IScreenIView {
    private IScreenIPresenter screenIPresenter;
    private int categoryID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_i);

        Category category=(Category) getIntent().getSerializableExtra("category");
        categoryID = category.getID();
        fcreateTitle(category.getName());
        fcreateToolbar(this, false, true, false, R.id.toolbar);
        fcreateMenu(this, true);

        screenIPresenter = new ScreenIPresenterImpl(this, getApplication());
        screenIPresenter.getProducts(categoryID);
    }

    @Override
    public void loadProducts(ArrayList<Product> products) {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerViewI);
        recyclerView.setHasFixedSize(true);
        StaggeredGridLayoutManager recyclerLayoutManager = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(recyclerLayoutManager);
        recyclerView.addItemDecoration(new RecyclerAdapter.SpaceItemDecoration(0));
        RecyclerAdapter_I recyclerAdapter = new RecyclerAdapter_I(ScreenI.this, products.size(), R.layout.item_i_and_c, products);
        recyclerView.setAdapter(recyclerAdapter);
    }
}
