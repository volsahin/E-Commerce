package com.telpa.ecommerce.activities.activityL;

import android.view.View;

import com.telpa.ecommerce.models.Comment;
import com.telpa.ecommerce.models.Product;

import java.util.ArrayList;

/**
 * Created by musta on 15.08.2016.
 */
public class ScreenLPresenter implements IScreenLPresenter {
    IScreenLView screenLView;

    public ScreenLPresenter(IScreenLView screenLView) {
        this.screenLView = screenLView;
    }

    @Override
    public void onButtonClick(View v,View v2) {

    }

    @Override
    public ArrayList<Comment> fillList() {
        ArrayList<Comment> comments;
        comments=new ArrayList<>();
        Comment comment=new Comment();
        comment.setComment("Yorum");
        comment.setRating(2);
        comment.setTime("16:30");
        comment.setUserName("User 1");
        comments.add(comment);
        comments.add(comment);
        comments.add(comment);
        comments.add(comment);
return comments;
    }

    @Override
    public Product getProduct() {
        return null;
    }
}
