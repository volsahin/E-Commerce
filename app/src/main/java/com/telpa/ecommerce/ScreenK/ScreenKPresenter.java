package com.telpa.ecommerce.ScreenK;

import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.telpa.ecommerce.R;
import com.telpa.ecommerce.models.BasketItem;

import java.util.ArrayList;

/**
 * Created by root on 15.08.2016.
 */
public class ScreenKPresenter implements IScreenKPresenter{


    IScreenKView view;

    public ScreenKPresenter(IScreenKView view) {
        this.view = view;
    }


   /* @Override
    public void RadioGroup(RadioGroup radioButton, RadioGroup radioButton1) {

        switch (radioButton.getCheckedRadioButtonId())
        {
            case R.id.Radio1:
                Toast.makeText(radioButton.getContext(), "A", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Radio2:
                Toast.makeText(radioButton.getContext(), "B", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Radio3:
                Toast.makeText(radioButton.getContext(), "C", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Radio4:
                Toast.makeText(radioButton.getContext(), "D", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Radio5:
                Toast.makeText(radioButton.getContext(), "E", Toast.LENGTH_SHORT).show();
                break;
        }

        switch (radioButton1.getCheckedRadioButtonId())
        {
            case R.id.productRadio1:
                break;
            case R.id.productRadio2:
                break;
            case R.id.productRadio3:
                break;
            case R.id.productRadio4:
                break;
        }


    }
*/
    @Override
    public ArrayList<BasketItem> basketitem() {
        ArrayList<BasketItem>basketitem=new ArrayList<>();
        BasketItem b=new BasketItem();
        b.setNumber(10);
        b.setVariant1(5);
        b.setVariant2(4);
        basketitem.add(b);
        return basketitem;
    }

    @Override
    public ArrayList<BasketItem> favoritem() {
        ArrayList<BasketItem>favoritem=new ArrayList<>();
        BasketItem b=new BasketItem();
        b.setNumber(15);
        b.setVariant1(3);
        b.setVariant2(2);
        favoritem.add(b);
        return favoritem;

    }


}
