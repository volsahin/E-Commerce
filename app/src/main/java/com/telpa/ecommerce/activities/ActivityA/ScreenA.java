package com.telpa.ecommerce.activities.ActivityA;

import android.os.Bundle;

import com.telpa.ecommerce.R;
import com.telpa.ecommerce.activities.ActivityA.ScreenA;
import com.telpa.ecommerce.fragment.FragmentATab;
import com.telpa.ecommerce.interfaces.IBasket;
import com.telpa.ecommerce.interfaces.ICategory;
import com.telpa.ecommerce.interfaces.IProduct;
import com.telpa.ecommerce.models.Category;
import com.telpa.ecommerce.models.Product;
import com.telpa.ecommerce.utils.BaseActivity;
import com.telpa.ecommerce.utils.TabHelper;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

public class ScreenA extends BaseActivity implements IScreenAView {
    @Inject
    IBasket basket;
    @Inject
    IProduct product;
    @Inject
    ICategory category;

    private ArrayList<Product> products;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_a);

        fcreateTitle("My Store" + " A");
        fcreateToolbar(this, false, true, true, R.id.toolbar);
        fcreateMenu(this, true);

        // This list holds current tabs in ScreenA
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

        //TODO
        products = new ArrayList<Product>();
        ArrayList<String> url = new ArrayList<String>();
        url.add("http://www.batmanda.com/rsm.batmanda/1970335733.jpg");

        Product b = new Product();
        b.setName("");
        b.setID(1);
        b.setCategoryID(1);
        b.setDescripton("");
        b.setHighResImageUrls(url);
        b.setLowResImageUrls(url);
        b.setPrice(30);
        b.setRating(2);
        b.setRating(3);
        products.add(b);

        for (Category i : categories) {

            FragmentATab tab = new FragmentATab();
            tab = tab.createTab(i.getName());
            tabHelperList.add(tab);
        }

        fcreateTabMenu(tabHelperList);

    }

    @Override
    public void onSuccess() {

    }

    @Override
    public void onFail() {

    }
}
