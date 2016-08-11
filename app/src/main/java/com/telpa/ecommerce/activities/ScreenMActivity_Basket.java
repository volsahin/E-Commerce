package com.telpa.ecommerce.activities;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.telpa.ecommerce.ECommerceApp;
import com.telpa.ecommerce.R;
import com.telpa.ecommerce.adapters.RecyclerAdapter;
import com.telpa.ecommerce.adapters.RecyclerAdapter_MBasket;
import com.telpa.ecommerce.impl.BasketImpl;
import com.telpa.ecommerce.interfaces.IBasket;
import com.telpa.ecommerce.interfaces.ICategory;
import com.telpa.ecommerce.interfaces.IProduct;
import com.telpa.ecommerce.models.BasketItem;
import com.telpa.ecommerce.utils.BaseActivity;

import java.util.ArrayList;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ScreenMActivity_Basket extends BaseActivity {
    @Inject
    IBasket basket;
    @Inject
    IProduct product;
    @Inject
    ICategory category;

    @BindView(R.id.searchButton)
    ImageButton searchButton;
    @BindView(R.id.basketButton)
    ImageButton basketButton;
    @BindView(R.id.totalPrice)
    TextView totalPrice;
    @BindView(R.id.checkoutButton)
    Button checkoutButton;
    @BindView(R.id.totalItems)
    TextView totalItems;


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
        ((ECommerceApp)getApplication()).getComponent().inject(this);
        basketItems = basket.getBasket(1);


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

        totalItems.setText("" + totalItems(basketItems));
        totalPrice.setText("" + totalPrice(basketItems));


    }

    public int totalItems(ArrayList<BasketItem> basketItems) {
        int total = 0;

        for (BasketItem i : basketItems) {
            total = total + i.getNumber();
        }

        return total;
    }

    public int totalPrice(ArrayList<BasketItem> basketItems) {
        int total = 0;

        for (BasketItem i : basketItems) {
            total = total + (i.getNumber() * i.getProduct().getPrice());
        }

        return total;
    }


}
