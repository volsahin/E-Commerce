package com.telpa.ecommerce.activities;

import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import com.telpa.ecommerce.R;
import com.telpa.ecommerce.adapters.RecyclerAdapter;
import com.telpa.ecommerce.adapters.ViewPagerAdapterK;
import com.telpa.ecommerce.utils.BaseActivity;
import com.viewpagerindicator.CirclePageIndicator;

import timber.log.Timber;

public class ScreenKActivity extends BaseActivity {

    ViewPager pager;

    private RecyclerView recyclerView;
    private RecyclerView.Adapter recyclerAdapter;
    private RecyclerView.LayoutManager recyclerLayoutManager;

    RadioButton Ia,Ib,Ic,Id,Ie,check1,check2,check3,check4;
    TextView a,b,c,d,e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_k);


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

        a=(TextView) findViewById(R.id.a);
        b=(TextView) findViewById(R.id.b);
        c=(TextView) findViewById(R.id.c);
        d=(TextView) findViewById(R.id.d);
        e=(TextView) findViewById(R.id.e);

        Ia=(RadioButton) findViewById(R.id.Radio1);
        Ib=(RadioButton) findViewById(R.id.Radio2);
        Ic=(RadioButton) findViewById(R.id.Radio3);
        Id=(RadioButton) findViewById(R.id.Radio4);
        Ie=(RadioButton) findViewById(R.id.Radio5);

        check1=(RadioButton) findViewById(R.id.productRadio1);
        check2=(RadioButton) findViewById(R.id.productRadio2);
        check3=(RadioButton) findViewById(R.id.productRadio3);
        check4=(RadioButton) findViewById(R.id.productRadio4);

        b.setTextColor(getResources().getColor(R.color.white));

        Ia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a.setTextColor(getResources().getColor(R.color.white));
                b.setTextColor(getResources().getColor(R.color.darkGrey));
                c.setTextColor(getResources().getColor(R.color.darkGrey));
                d.setTextColor(getResources().getColor(R.color.darkGrey));
                e.setTextColor(getResources().getColor(R.color.darkGrey));
                Ib.setChecked(false);
                Ic.setChecked(false);
                Id.setChecked(false);
                Ie.setChecked(false);
            }
        });

        Ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a.setTextColor(getResources().getColor(R.color.darkGrey));
                b.setTextColor(getResources().getColor(R.color.white));
                c.setTextColor(getResources().getColor(R.color.darkGrey));
                d.setTextColor(getResources().getColor(R.color.darkGrey));
                e.setTextColor(getResources().getColor(R.color.darkGrey));
                e.setTextColor(getResources().getColor(R.color.darkGrey));
                Ia.setChecked(false);
                Ic.setChecked(false);
                Id.setChecked(false);
                Ie.setChecked(false);
            }
        });

        Ic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a.setTextColor(getResources().getColor(R.color.darkGrey));
                b.setTextColor(getResources().getColor(R.color.darkGrey));
                c.setTextColor(getResources().getColor(R.color.white));
                d.setTextColor(getResources().getColor(R.color.darkGrey));
                e.setTextColor(getResources().getColor(R.color.darkGrey));
                e.setTextColor(getResources().getColor(R.color.darkGrey));
                Ia.setChecked(false);
                Ib.setChecked(false);
                Id.setChecked(false);
                Ie.setChecked(false);
            }
        });
        Id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a.setTextColor(getResources().getColor(R.color.darkGrey));
                b.setTextColor(getResources().getColor(R.color.darkGrey));
                c.setTextColor(getResources().getColor(R.color.darkGrey));
                d.setTextColor(getResources().getColor(R.color.white));
                e.setTextColor(getResources().getColor(R.color.darkGrey));
                Ia.setChecked(false);
                Ib.setChecked(false);
                Ic.setChecked(false);
                Ie.setChecked(false);
            }
        });

        Ie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a.setTextColor(getResources().getColor(R.color.darkGrey));
                b.setTextColor(getResources().getColor(R.color.darkGrey));
                c.setTextColor(getResources().getColor(R.color.darkGrey));
                d.setTextColor(getResources().getColor(R.color.darkGrey));
                e.setTextColor(getResources().getColor(R.color.white));
                Ia.setChecked(false);
                Ib.setChecked(false);
                Ic.setChecked(false);
                Id.setChecked(false);
            }
        });




        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_k);
        recyclerView.setHasFixedSize(true);

        recyclerLayoutManager = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(recyclerLayoutManager);

        recyclerView.addItemDecoration(new RecyclerAdapter.SpaceItemDecoration(10));
        recyclerAdapter = new RecyclerAdapter(3, R.layout.item_l_comment);
        recyclerView.setAdapter(recyclerAdapter);


    }
}
