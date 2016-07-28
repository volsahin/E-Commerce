package com.telpa.ecommerce.activities;


import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.telpa.ecommerce.ECommerceApp;
import com.telpa.ecommerce.R;
import com.telpa.ecommerce.fragment.FragmentBTab;
import com.telpa.ecommerce.utils.BaseActivity;
import com.telpa.ecommerce.utils.TabHelper;
import com.telpa.ecommerce.fragment.FragmentATab;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import timber.log.Timber;


public class ScreenAActivity extends BaseActivity {
    @Inject
    Application application;

    private ImageButton imgBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        ((ECommerceApp) getApplication()).getComponent().inject(this);




        Timber.plant(new Timber.DebugTree());
        Timber.v("Mert Bulut");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_a);

        fcreateTitle("My Store" +" A");
        fcreateToolbar(this,false, true, true, R.id.toolbar);
        fcreateMenu(this, true);

        // This list holds current tabs in ScreenA
        List<TabHelper> tabHelperList = new ArrayList<>();
        tabHelperList.add(FragmentATab.createTab("Category A"));
        tabHelperList.add(FragmentBTab.createTab("Category B"));
        tabHelperList.add(FragmentATab.createTab("Category C"));

        fcreateTabMenu(tabHelperList);

        View view = getLayoutInflater().inflate(R.layout.item_a_big,null);
        imgBtn = (ImageButton) view.findViewById(R.id.bigBasketButton);
        imgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ScreenAActivity.this, "IMGBTN!é", Toast.LENGTH_SHORT).show();
            }
        });

    }

}
