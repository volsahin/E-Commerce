package com.telpa.ecommerce.activities;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.Toast;

import com.telpa.ecommerce.R;
import com.telpa.ecommerce.adapters.RecyclerAdapter;
import com.telpa.ecommerce.adapters.RecyclerAdapter_MBasket;
import com.telpa.ecommerce.interfaces.IBasket;
import com.telpa.ecommerce.interfaces.ICategory;
import com.telpa.ecommerce.interfaces.IProduct;
import com.telpa.ecommerce.models.BasketItem;
import com.telpa.ecommerce.models.Product;
import com.telpa.ecommerce.network.APIService;
import com.telpa.ecommerce.utils.BaseActivity;

import java.util.ArrayList;

import javax.inject.Inject;

import butterknife.ButterKnife;

public class ScreenMActivity_Basket extends BaseActivity {
    @Inject
    IBasket basket;
    @Inject
    IProduct product;
    @Inject
    ICategory category;


    private RecyclerView recyclerView;
    private RecyclerView.Adapter recyclerAdapter;
    private RecyclerView.LayoutManager recyclerLayoutManager;
    private AlphaAnimation buttonClick = new AlphaAnimation(1F, 0.8F);
    private ArrayList<BasketItem> basketItems;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_m_basket);
        ButterKnife.bind(ScreenMActivity_Basket.this);
/*
        //// TODO
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
*/

        basketItems=new ArrayList<>();
        basketItems=basket.getBasket(1);


        fcreateTitle("Your Basket");
        fcreateToolbar(this, false, true, false, R.id.include);
        fcreateMenu(this, false);

        recyclerView = (RecyclerView) findViewById(R.id.basketList);

        recyclerView.setHasFixedSize(true);
        recyclerLayoutManager = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(recyclerLayoutManager);

        recyclerView.addItemDecoration(new RecyclerAdapter.SpaceItemDecoration(3));
        recyclerAdapter = new RecyclerAdapter_MBasket(ScreenMActivity_Basket.this, basketItems.size(), R.layout.item_m_basket, basketItems);
        recyclerView.setAdapter(recyclerAdapter);

        Button checkOut=(Button) findViewById(R.id.checkoutButton);
        checkOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(ScreenMActivity_Basket.this, "Buy them!", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
