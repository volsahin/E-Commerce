package com.telpa.ecommerce.activityM;

import com.telpa.ecommerce.models.BasketItem;

import java.util.ArrayList;

/**
 * Created by musta on 17.08.2016.
 */
public interface IScreenMPresenter {
    void proceedClick();
    ArrayList<BasketItem> fillList();
    String setTitle();
    void itemUp(int price);
    void itemDown(int price);
    int totalPrice(ArrayList<BasketItem> basketItems);
    int totalItem(ArrayList<BasketItem> basketItems);
}
