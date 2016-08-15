package com.telpa.ecommerce.activities.activityL;

import android.view.View;

import com.telpa.ecommerce.models.Comment;
import com.telpa.ecommerce.models.Product;

import java.util.ArrayList;

/**
 * Created by musta on 15.08.2016.
 */
public interface IScreenLPresenter {
    void onButtonClick(View v,View v2);
    ArrayList<Comment> fillList();
    Product getProduct();
}
