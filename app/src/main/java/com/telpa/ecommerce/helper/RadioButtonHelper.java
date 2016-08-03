package com.telpa.ecommerce.helper;

import android.content.Context;
import android.widget.RadioButton;
import android.widget.TextView;

import com.telpa.ecommerce.R;

/**
 * Created by SAMSUNGNB on 29.07.2016.
 */
public class RadioButtonHelper {
    public RadioButtonHelper() {
    }

    public void click(String buttonName, TextView[] textViews, RadioButton[] radioButtons, Context context){
        TextView a=textViews[0];    RadioButton Ia=radioButtons[0];
        TextView b=textViews[1];    RadioButton Ib=radioButtons[1];
        TextView c=textViews[2];    RadioButton Ic=radioButtons[2];
        TextView d=textViews[3];    RadioButton Id=radioButtons[3];
        TextView e=textViews[4];    RadioButton Ie=radioButtons[4];
        switch (buttonName) {
            case "a":
                a.setTextColor(context.getResources().getColor(R.color.white));
                b.setTextColor(context.getResources().getColor(R.color.darkGrey));
                c.setTextColor(context.getResources().getColor(R.color.darkGrey));
                d.setTextColor(context.getResources().getColor(R.color.darkGrey));
                e.setTextColor(context.getResources().getColor(R.color.darkGrey));
                Ib.setChecked(false);
                Ic.setChecked(false);
                Id.setChecked(false);
                Ie.setChecked(false);
                break;
            case "b":
                a.setTextColor(context.getResources().getColor(R.color.darkGrey));
                b.setTextColor(context.getResources().getColor(R.color.white));
                c.setTextColor(context.getResources().getColor(R.color.darkGrey));
                d.setTextColor(context.getResources().getColor(R.color.darkGrey));
                e.setTextColor(context.getResources().getColor(R.color.darkGrey));
                Ia.setChecked(false);
                Ic.setChecked(false);
                Id.setChecked(false);
                Ie.setChecked(false);
                break;
            case "c":
                a.setTextColor(context.getResources().getColor(R.color.darkGrey));
                b.setTextColor(context.getResources().getColor(R.color.darkGrey));
                c.setTextColor(context.getResources().getColor(R.color.white));
                d.setTextColor(context.getResources().getColor(R.color.darkGrey));
                e.setTextColor(context.getResources().getColor(R.color.darkGrey));
                Ia.setChecked(false);
                Ib.setChecked(false);
                Id.setChecked(false);
                Ie.setChecked(false);
                break;
            case "d":
                a.setTextColor(context.getResources().getColor(R.color.darkGrey));
                b.setTextColor(context.getResources().getColor(R.color.darkGrey));
                c.setTextColor(context.getResources().getColor(R.color.darkGrey));
                d.setTextColor(context.getResources().getColor(R.color.white));
                e.setTextColor(context.getResources().getColor(R.color.darkGrey));
                Ia.setChecked(false);
                Ib.setChecked(false);
                Ic.setChecked(false);
                Ie.setChecked(false);
                break;
            case "e":
                a.setTextColor(context.getResources().getColor(R.color.darkGrey));
                b.setTextColor(context.getResources().getColor(R.color.darkGrey));
                c.setTextColor(context.getResources().getColor(R.color.darkGrey));
                d.setTextColor(context.getResources().getColor(R.color.darkGrey));
                e.setTextColor(context.getResources().getColor(R.color.white));
                Ia.setChecked(false);
                Ib.setChecked(false);
                Ic.setChecked(false);
                Id.setChecked(false);
                break;
        }
    }
}
