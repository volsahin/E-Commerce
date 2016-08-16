package com.telpa.ecommerce.ScreenK;

import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.telpa.ecommerce.models.BasketItem;
import com.telpa.ecommerce.models.Comment;
import com.telpa.ecommerce.models.Product;

import java.util.ArrayList;

/**
 * Created by root on 15.08.2016.
 */
public interface IScreenKPresenter {
    ArrayList<Comment> fillList();
    ArrayList<BasketItem> basketitem();
    int favoritem();
}
