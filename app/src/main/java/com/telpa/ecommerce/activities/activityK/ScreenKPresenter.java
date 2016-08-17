package com.telpa.ecommerce.activities.activityK;

import android.app.Application;
import android.widget.RadioGroup;

import com.telpa.ecommerce.ECommerceApp;
import com.telpa.ecommerce.R;
import com.telpa.ecommerce.interfaces.IBasket;
import com.telpa.ecommerce.interfaces.ICategory;
import com.telpa.ecommerce.interfaces.IProduct;
import com.telpa.ecommerce.models.BasketItem;
import com.telpa.ecommerce.models.Comment;
import com.telpa.ecommerce.network.APIService;

import java.util.ArrayList;

import javax.inject.Inject;

/**
 * Created by root on 15.08.2016.
 */
public class ScreenKPresenter implements IScreenKPresenter{

    IScreenKView view;
    @Inject
    IBasket basket;
    @Inject
    APIService service;
    @Inject
    IProduct product;
    @Inject
    ICategory category;

    public ScreenKPresenter(IScreenKView view,Application application) {
        this.view = view;
        ((ECommerceApp) application).getComponent().inject(this);
    }

    @Override
    public void RadioGroup(RadioGroup radioGroup1, RadioGroup radioGroup2) {
        String variants1 = null,variants2 = null;
        switch (radioGroup1.getCheckedRadioButtonId()) {
            case R.id.radio_l_1_1:variants1="A";
                break;
            case R.id.radio_l_1_2:variants1="B";
                break;
            case R.id.radio_l_1_3:variants1="C";
                break;
            case R.id.radio_l_1_4:variants1="D";
                break;
            case R.id.radio_l_1_5:variants1="E";
                break;
        }
        switch (radioGroup2.getCheckedRadioButtonId()) {
            case R.id.radio_l_2_1:variants2="1";
                break;
            case R.id.radio_l_2_2:variants2="2";
                break;
            case R.id.radio_l_2_3:variants2="3";
                break;
            case R.id.radio_l_2_4:variants2="4";
                break;
        }
    }

    @Override
    public ArrayList<Comment> fillList() {
        ArrayList<Comment>comments=new ArrayList<>();
        comments=product.getComments(1);
        return comments;
    }
    @Override
    public BasketItem basketitem() {

        BasketItem basketitem=new BasketItem();
        basketitem.setNumber(10);
        basketitem.setVariant1(5);
        basketitem.setVariant2(4);

        return basketitem;
    }
    @Override
    public int favoritem() {
       int favoritem=5;
        return favoritem;
    }}
