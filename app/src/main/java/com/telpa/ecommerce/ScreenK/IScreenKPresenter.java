package com.telpa.ecommerce.ScreenK;

import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.telpa.ecommerce.models.BasketItem;

import java.util.ArrayList;

/**
 * Created by root on 15.08.2016.
 */
public interface IScreenKPresenter {

    //void RadioGroup(RadioGroup radioButton, RadioGroup radioButton1);
    ArrayList<BasketItem> basketitem();
    ArrayList<BasketItem>favoritem();
}
