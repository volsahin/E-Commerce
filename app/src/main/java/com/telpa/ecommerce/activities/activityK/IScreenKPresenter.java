package com.telpa.ecommerce.activities.activityK;

import android.widget.RadioGroup;

import com.telpa.ecommerce.models.BasketItem;
import com.telpa.ecommerce.models.Comment;

import java.util.ArrayList;

/**
 * Created by root on 15.08.2016.
 */
public interface IScreenKPresenter {
    void RadioGroup(RadioGroup radioGroup1, RadioGroup radioGroup2);
    ArrayList<Comment> fillList();
    BasketItem basketitem();
    int favoritem();
}
