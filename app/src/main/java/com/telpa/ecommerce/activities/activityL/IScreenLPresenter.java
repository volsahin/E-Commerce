package com.telpa.ecommerce.activities.activityL;

import android.widget.RadioGroup;

import com.telpa.ecommerce.models.Comment;
import com.telpa.ecommerce.models.Product;

import java.util.ArrayList;

/**
 * Created by musta on 15.08.2016.
 */
public interface IScreenLPresenter {
    void onButtonClick(RadioGroup radioGroup1, RadioGroup radioGroup2);
    ArrayList<Comment> fillList();
    Product getProduct();
}
