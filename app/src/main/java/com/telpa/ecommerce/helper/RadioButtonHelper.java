package com.telpa.ecommerce.helper;

import android.app.Activity;
import android.widget.RadioButton;
import android.widget.TextView;

import com.telpa.ecommerce.R;

/**
 * Created by SAMSUNGNB on 29.07.2016.
 */
public class RadioButtonHelper extends Activity{
    public RadioButtonHelper()  {
    }

    public void click(String buttonName, TextView[] textViews, RadioButton[] radioButtons){
        TextView a=textViews[0];    RadioButton Ia=radioButtons[0];
        TextView b=textViews[1];    RadioButton Ib=radioButtons[0];
        TextView c=textViews[2];    RadioButton Ic=radioButtons[0];
        TextView d=textViews[3];    RadioButton Id=radioButtons[0];
        TextView e=textViews[4];    RadioButton Ie=radioButtons[0];
        switch (buttonName) {
            case "a":
                a.setTextColor(getResources().getColor(R.color.white));
                b.setTextColor(getResources().getColor(R.color.darkGrey));
                c.setTextColor(getResources().getColor(R.color.darkGrey));
                d.setTextColor(getResources().getColor(R.color.darkGrey));
                e.setTextColor(getResources().getColor(R.color.darkGrey));
                Ib.setChecked(false);
                Ic.setChecked(false);
                Id.setChecked(false);
                Ie.setChecked(false);
                break;
            case "b":
                a.setTextColor(getResources().getColor(R.color.darkGrey));
                b.setTextColor(getResources().getColor(R.color.white));
                c.setTextColor(getResources().getColor(R.color.darkGrey));
                d.setTextColor(getResources().getColor(R.color.darkGrey));
                e.setTextColor(getResources().getColor(R.color.darkGrey));
                e.setTextColor(getResources().getColor(R.color.darkGrey));
                Ia.setChecked(false);
                Ic.setChecked(false);
                Id.setChecked(false);
                Ie.setChecked(false);
                break;
            case "c":
                a.setTextColor(getResources().getColor(R.color.darkGrey));
                b.setTextColor(getResources().getColor(R.color.darkGrey));
                c.setTextColor(getResources().getColor(R.color.white));
                d.setTextColor(getResources().getColor(R.color.darkGrey));
                e.setTextColor(getResources().getColor(R.color.darkGrey));
                e.setTextColor(getResources().getColor(R.color.darkGrey));
                Ia.setChecked(false);
                Ib.setChecked(false);
                Id.setChecked(false);
                Ie.setChecked(false);
                break;
            case "d":
                a.setTextColor(getResources().getColor(R.color.darkGrey));
                b.setTextColor(getResources().getColor(R.color.darkGrey));
                c.setTextColor(getResources().getColor(R.color.darkGrey));
                d.setTextColor(getResources().getColor(R.color.white));
                e.setTextColor(getResources().getColor(R.color.darkGrey));
                Ia.setChecked(false);
                Ib.setChecked(false);
                Ic.setChecked(false);
                Ie.setChecked(false);
                break;
            case "e":
                a.setTextColor(getResources().getColor(R.color.darkGrey));
                b.setTextColor(getResources().getColor(R.color.darkGrey));
                c.setTextColor(getResources().getColor(R.color.darkGrey));
                d.setTextColor(getResources().getColor(R.color.darkGrey));
                e.setTextColor(getResources().getColor(R.color.white));
                Ia.setChecked(false);
                Ib.setChecked(false);
                Ic.setChecked(false);
                Id.setChecked(false);
                break;
        }
    }
}
