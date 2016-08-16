package com.telpa.ecommerce.activities;

import android.os.Bundle;

import com.telpa.ecommerce.R;
import com.telpa.ecommerce.interfaces.IBasket;
import com.telpa.ecommerce.interfaces.ICategory;
import com.telpa.ecommerce.interfaces.IProduct;
import com.telpa.ecommerce.models.Category;
import com.telpa.ecommerce.utils.BaseActivity;
import com.telpa.ecommerce.utils.TabHelper;
import com.telpa.ecommerce.fragment.FragmentCTab;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

public class ScreenCActivity extends BaseActivity {
    @Inject
    IBasket basket;
    @Inject
    IProduct product;
    @Inject
    ICategory category;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_c);

        fcreateTitle("My Store" + " C");
        fcreateToolbar(this, false, true, true, R.id.toolbar);
        fcreateMenu(this, true);

//TODO
        List<TabHelper> tabHelperList = new ArrayList<>();
        List<Category> categories = new ArrayList<>();
        Category a = new Category();
        a.setName("Category");
        a.setHighResImageUrl("");
        a.setLowResImageUrl("");
        a.setID(1);
        a.setNumOfProduct(2);
        a.setParentID(0);
        categories.add(a);
        categories.add(a);
        categories.add(a);
        for (Category i : categories) {

            FragmentCTab tab = new FragmentCTab();
            tab.createTab(i.getName());
            tabHelperList.add(tab);
        }
        fcreateTabMenu(tabHelperList);

    }
}
