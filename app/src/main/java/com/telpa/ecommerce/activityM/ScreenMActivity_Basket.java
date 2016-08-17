package com.telpa.ecommerce.activityM;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.telpa.ecommerce.ECommerceApp;
import com.telpa.ecommerce.R;
import com.telpa.ecommerce.adapters.RecyclerAdapter;
import com.telpa.ecommerce.adapters.RecyclerAdapter_MBasket;
import com.telpa.ecommerce.interfaces.IBasket;
import com.telpa.ecommerce.interfaces.ICategory;
import com.telpa.ecommerce.interfaces.IProduct;
import com.telpa.ecommerce.utils.BaseActivity;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ScreenMActivity_Basket extends BaseActivity implements IScreenMView
{
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

    IScreenMPresenter screenMPresenter;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter recyclerAdapter;
    private RecyclerView.LayoutManager recyclerLayoutManager;
    private AlphaAnimation buttonClick = new AlphaAnimation(1F, 0.8F);
    int totalPriceInt,totalItemInt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_m_basket);
        ButterKnife.bind(ScreenMActivity_Basket.this);
        ((ECommerceApp)getApplication()).getComponent().inject(this);

        screenMPresenter=new ScreenMPresenter(getApplication(),this);
        fcreateTitle(screenMPresenter.setTitle());
        fcreateToolbar(this, false, true, false, R.id.include);
        fcreateMenu(this, false);

        recyclerView = (RecyclerView) findViewById(R.id.basketList);

        recyclerView.setHasFixedSize(true);
        recyclerLayoutManager = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(recyclerLayoutManager);

        recyclerView.addItemDecoration(new RecyclerAdapter.SpaceItemDecoration(3));
        recyclerAdapter = new RecyclerAdapter_MBasket(ScreenMActivity_Basket.this, screenMPresenter.fillList().size(), R.layout.item_m_basket, screenMPresenter.fillList(),this);
        recyclerView.setAdapter(recyclerAdapter);

        totalItems.setText("" + screenMPresenter.totalItem(screenMPresenter.fillList()));
        totalPrice.setText("" + screenMPresenter.totalPrice(screenMPresenter.fillList()));
        totalPriceInt=screenMPresenter.totalPrice(screenMPresenter.fillList());
        totalItemInt=screenMPresenter.totalItem(screenMPresenter.fillList());
        checkoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screenMPresenter.proceedClick();
            }
        });

    }
    @Override
    public void proceedClick() {
        Toast.makeText(ScreenMActivity_Basket.this, "proceed, basıldı", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void itemUp(int price) {
        screenMPresenter.itemUp(price);
    }

    @Override
    public void itemDown(int price) {
        screenMPresenter.itemDown(price);

    }

    @Override
    public void setTexts(int price, int number) {
        totalPriceInt= totalPriceInt+price;
        totalPrice.setText(String.valueOf(totalPriceInt));
        totalItemInt= totalItemInt+number;
        totalItems.setText(String.valueOf(totalItemInt));

    }
}
