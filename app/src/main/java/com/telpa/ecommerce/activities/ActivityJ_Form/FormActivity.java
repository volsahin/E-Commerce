package com.telpa.ecommerce.activities.activityJ_Form;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.telpa.ecommerce.R;
import com.telpa.ecommerce.models.Form;
import com.telpa.ecommerce.utils.BaseActivity;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.OnClick;

public class FormActivity extends BaseActivity implements IFormView {

    @BindView(R.id.searchButton)
    ImageButton searchButton;
    @BindView(R.id.basketButton)
    ImageButton basketButton;
    @BindView(R.id.title)
    TextView title;
    @BindView(R.id.labelOne)
    TextView labelOne;
    @BindView(R.id.placeholderText)
    EditText placeholderText;
    @BindView(R.id.labelTwo)
    TextView labelTwo;
    @BindView(R.id.someText)
    EditText someText;
    @BindView(R.id.labelThree)
    TextView labelThree;
    @BindView(R.id.labelFour)
    TextView labelFour;
    @BindView(R.id.labelFive)
    TextView labelFive;
    @BindView(R.id.checkBox)
    CheckBox checkBox;
    @BindView(R.id.checkBox2)
    CheckBox checkBox2;
    @BindView(R.id.radioButton)
    RadioButton radioButton;
    @BindView(R.id.radioButton2)
    RadioButton radioButton2;
    @BindView(R.id.button)
    Button button;
    @BindView(R.id.button2)
    Button button2;
    @BindView(R.id.spinner)
    Spinner spinner1;
    @BindView(R.id.spinner2)
    Spinner spinner2;
    @BindView(R.id.spinner3)
    Spinner spinner3;

    private FormPresenter formPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        //ButterKnife.bind(this);


        formPresenter = new FormPresenter(this, getApplication());
        formPresenter.setSpinnerValues();


    }

    @OnClick({R.id.searchButton, R.id.basketButton, R.id.button, R.id.button2})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.searchButton:
                break;
            case R.id.basketButton:
                break;
            case R.id.button:
                break;
            case R.id.button2:
                formPresenter.submitForm(createForm());
                break;
        }
    }

    @Override
    public void onSuccess() {
        Toast.makeText(FormActivity.this, "Success", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onFail() {

        Toast.makeText(FormActivity.this, "Fail", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setAdapters(ArrayList<String[]> list) {
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, list.get(0));
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, list.get(1));
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, list.get(2));
        spinner1.setAdapter(adapter1);
        spinner2.setAdapter(adapter2);
        spinner3.setAdapter(adapter3);
    }

    public Form createForm() {
        Form form = new Form();
        form.setCustomerID(1);
        form.setInfo1(placeholderText.getText().toString());
        form.setInfo2(someText.getText().toString());
        form.setOption1(spinner1.getSelectedItem().toString());
        form.setOption2(spinner2.getSelectedItem().toString());
        form.setOption3(spinner3.getSelectedItem().toString());
        form.setOption4(checkBox.isChecked());
        form.setOption5(checkBox2.isChecked());
        form.setOption6(radioButton.isChecked());
        return form;
    }

}
