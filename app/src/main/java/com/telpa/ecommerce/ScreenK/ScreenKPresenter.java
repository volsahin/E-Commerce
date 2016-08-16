package com.telpa.ecommerce.ScreenK;

import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.telpa.ecommerce.ECommerceApp;
import com.telpa.ecommerce.R;
import com.telpa.ecommerce.interfaces.IProduct;
import com.telpa.ecommerce.models.BasketItem;

import java.util.ArrayList;

import javax.inject.Inject;

/**
 * Created by root on 15.08.2016.
 */
public class ScreenKPresenter implements IScreenKPresenter{

    IScreenKView view;
    @Inject
    IProduct product;

    public ScreenKPresenter(IScreenKView view) {
        this.view = view;
    }

    @Override
    public ArrayList<BasketItem> basketitem() {
        ArrayList<BasketItem>basketitem=new ArrayList<>();
        BasketItem b=new BasketItem();
        b.setNumber(10);
        b.setVariant1(5);
        b.setVariant2(4);
        basketitem.add(b);
        return basketitem;
    }
    @Override
    public int favoritem() {
       int favoritem=5;
        return favoritem;
    }}
