package com.telpa.ecommerce.activities.activityK;

import com.telpa.ecommerce.models.BasketItem;
import com.telpa.ecommerce.models.Comment;

import java.util.ArrayList;

/**
 * Created by root on 15.08.2016.
 */
public interface IScreenKPresenter {
    ArrayList<Comment> fillList();
    ArrayList<BasketItem> basketitem();
    int favoritem();
}
