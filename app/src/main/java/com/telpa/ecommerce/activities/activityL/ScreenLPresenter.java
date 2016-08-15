package com.telpa.ecommerce.activities.activityL;

import android.app.Application;
import android.widget.RadioGroup;

import com.telpa.ecommerce.ECommerceApp;
import com.telpa.ecommerce.R;
import com.telpa.ecommerce.interfaces.IProduct;
import com.telpa.ecommerce.models.Comment;
import com.telpa.ecommerce.models.Product;

import java.util.ArrayList;

import javax.inject.Inject;

/**
 * Created by musta on 15.08.2016.
 */
public class ScreenLPresenter implements IScreenLPresenter {
    IScreenLView screenLView;
 @Inject
    IProduct product;
    public ScreenLPresenter(IScreenLView screenLView, Application app) {

        this.screenLView = screenLView;
        ((ECommerceApp) app).getComponent().inject(this);
    }

    @Override
    public void onButtonClick(RadioGroup radioGroup1, RadioGroup radioGroup2) {
        String renk = null,beden = null;
 switch (radioGroup1.getCheckedRadioButtonId()) {
            case R.id.radio_l_1_1:beden="A";
               break;
            case R.id.radio_l_1_2:beden="B";
               break;
            case R.id.radio_l_1_3:beden="C";
               break;
            case R.id.radio_l_1_4:beden="D";
               break;
            case R.id.radio_l_1_5:beden="E";
               break;

        }
        switch (radioGroup2.getCheckedRadioButtonId()) {
            case R.id.radio_l_2_1:renk="1";
                break;
            case R.id.radio_l_2_2:renk="2";
                break;
            case R.id.radio_l_2_3:renk="3";
                break;
            case R.id.radio_l_2_4:renk="4";
                break;

        }
        screenLView.onButtonClick(renk+" renkli "+beden+" beden ürün sepeete eklenmiştir");

    }

    @Override
    public ArrayList<Comment> fillList() {
        ArrayList<Comment> comments;
        comments=product.getComments(0);

return comments;
    }

    @Override
    public Product getProduct() {
        return null;
    }
}
