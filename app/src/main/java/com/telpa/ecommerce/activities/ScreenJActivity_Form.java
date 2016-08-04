package com.telpa.ecommerce.activities;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.telpa.ecommerce.R;
import com.telpa.ecommerce.interfaces.IForm;
import com.telpa.ecommerce.utils.BaseActivity;

import javax.inject.Inject;

public class ScreenJActivity_Form extends BaseActivity {
    @Inject
    IForm form;

    private String[] arraySpinner;

    EditText text;
    EditText text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_j_form);

        fcreateTitle("Form" + "J");
        fcreateToolbar(this, false, true, false, R.id.toolbar);
        fcreateMenu(this, false);


        arraySpinner = new String[]{"option", "option2", "option3"};

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);
        Spinner spinner3 = (Spinner) findViewById(R.id.spinner3);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, arraySpinner);

        spinner.setAdapter(adapter);
        spinner2.setAdapter(adapter);
        spinner3.setAdapter(adapter);

        text = (EditText) findViewById(R.id.placeholderText);
        text2 = (EditText) findViewById(R.id.someText);
        text.getBackground().setColorFilter(getResources().getColor(R.color.white), PorterDuff.Mode.SRC_IN);
        text2.getBackground().setColorFilter(getResources().getColor(R.color.white), PorterDuff.Mode.SRC_IN);
    }
}

