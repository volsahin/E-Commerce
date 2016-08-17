package com.telpa.ecommerce.activityM;

import android.app.Application;

import com.telpa.ecommerce.ECommerceApp;
import com.telpa.ecommerce.interfaces.IBasket;
import com.telpa.ecommerce.models.BasketItem;

import java.util.ArrayList;

import javax.inject.Inject;

/**
 * Created by musta on 17.08.2016.
 */
public class ScreenMPresenter implements IScreenMPresenter {
    IScreenMView screenMView;
    @Inject
    IBasket basket;

    public ScreenMPresenter(Application app,IScreenMView view) {
       this.screenMView=view;
        ((ECommerceApp)app).getComponent().inject(this);

    }

    @Override
    public void proceedClick() {
screenMView.proceedClick();
    }

    @Override
    public ArrayList<BasketItem> fillList() {
        return basket.getBasket(1);
    }

    @Override
    public String setTitle() {
        return "Your Basket";
    }

    @Override
    public void itemUp(int price) {

        screenMView.setTexts(price,1);

    }

    @Override
    public void itemDown(int price) {
        screenMView.setTexts(-price,-1);
    }

    @Override
    public int totalPrice(ArrayList<BasketItem> basketItems) {
        int total = 0;

        for (BasketItem i : basketItems) {
            total = total + (i.getNumber()*i.getProduct().getPrice());
        }

        return total;
    }

    @Override
    public int totalItem(ArrayList<BasketItem> basketItems) {
        int total = 0;

        for (BasketItem i : basketItems) {
            total = total + i.getNumber();
        }

        return total;
    }
}
