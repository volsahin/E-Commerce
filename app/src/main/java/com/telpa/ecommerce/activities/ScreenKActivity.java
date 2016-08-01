package com.telpa.ecommerce.activities;

import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.TextView;

import com.melnykov.fab.FloatingActionButton;
import com.telpa.ecommerce.R;
import com.telpa.ecommerce.adapters.RecyclerAdapter;
import com.telpa.ecommerce.adapters.ViewPagerAdapterK;
import com.telpa.ecommerce.helper.RadioButtonHelper;
import com.telpa.ecommerce.utils.BaseActivity;
import com.viewpagerindicator.CirclePageIndicator;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import timber.log.Timber;

public class ScreenKActivity extends BaseActivity {
    @BindView(R.id.searchButton)
    ImageButton searchButton;
    @BindView(R.id.basketButton)
    ImageButton basketButton;
    @BindView(R.id.title)
    TextView title;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.Radio1)
    RadioButton Ia;
    @BindView(R.id.a)
    TextView a;
    @BindView(R.id.Radio2)
    RadioButton Ib;
    @BindView(R.id.b)
    TextView b;
    @BindView(R.id.Radio3)
    RadioButton Ic;
    @BindView(R.id.c)
    TextView c;
    @BindView(R.id.Radio4)
    RadioButton Id;
    @BindView(R.id.d)
    TextView d;
    @BindView(R.id.Radio5)
    RadioButton Ie;
    @BindView(R.id.e)
    TextView e;
    @BindView(R.id.productRadio1)
    RadioButton check1;
    @BindView(R.id.productRadio2)
    RadioButton check2;
    @BindView(R.id.productRadio3)
    RadioButton check3;
    @BindView(R.id.productRadio4)
    RadioButton check4;

    ViewPager pager;

    private RecyclerView recyclerView;
    private RecyclerView.Adapter recyclerAdapter;
    private RecyclerView.LayoutManager recyclerLayoutManager;

    private RadioButtonHelper radioButtonHelper;
    private TextView[] textViews;
    private RadioButton[] radioButtons;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_k);

        ButterKnife.bind(this);
        textViews = new TextView[5];
        textViews[0] = a;   textViews[1] = b;   textViews[2] = c;   textViews[3] = d;   textViews[4] = e;
        radioButtons = new RadioButton[5];
        radioButtons[0] = Ia;   radioButtons[1] = Ib;   radioButtons[2] = Ic;   radioButtons[3] = Id;   radioButtons[4] = Ie;
        radioButtonHelper = new RadioButtonHelper();

        fcreateTitle("");
        fcreateToolbar(this,true, true, false, R.id.toolbar);
        fcreateMenu(this, true);

        pager = (ViewPager)findViewById(R.id.viewPagerK);
        pager.setAdapter(new ViewPagerAdapterK(getSupportFragmentManager(),4));
/*
        TitlePageIndicator titlePageIndicator = (TitlePageIndicator)findViewById(R.id.viewPagerIndicatorK);
        titlePageIndicator.setViewPager(pager);
  */
        CirclePageIndicator mIndicator = (CirclePageIndicator)findViewById(R.id.indicator);
        mIndicator.setViewPager(pager);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_k);
        recyclerView.setHasFixedSize(true);

        recyclerLayoutManager = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(recyclerLayoutManager);

        recyclerView.addItemDecoration(new RecyclerAdapter.SpaceItemDecoration(10));
        recyclerAdapter = new RecyclerAdapter(3, R.layout.item_l_comment);
        recyclerView.setAdapter(recyclerAdapter);


    }



    @OnClick({R.id.searchButton, R.id.basketButton, R.id.Radio1, R.id.Radio2, R.id.Radio3, R.id.Radio4, R.id.Radio5, R.id.productRadio1, R.id.productRadio2, R.id.productRadio3, R.id.productRadio4})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.searchButton:
                break;
            case R.id.basketButton:
                break;
            case R.id.Radio1:
                radioButtonHelper.click("a", textViews, radioButtons, ScreenKActivity.this);
                break;
            case R.id.Radio2:
                radioButtonHelper.click("b", textViews, radioButtons, ScreenKActivity.this);
                break;
            case R.id.Radio3:
                radioButtonHelper.click("c", textViews, radioButtons, ScreenKActivity.this);
                break;
            case R.id.Radio4:
                radioButtonHelper.click("d", textViews, radioButtons, ScreenKActivity.this);
                break;
            case R.id.Radio5:
                radioButtonHelper.click("e", textViews, radioButtons, ScreenKActivity.this);
                break;
            case R.id.productRadio1:
                break;
            case R.id.productRadio2:
                break;
            case R.id.productRadio3:
                break;
            case R.id.productRadio4:
                break;
        }
    }
}
