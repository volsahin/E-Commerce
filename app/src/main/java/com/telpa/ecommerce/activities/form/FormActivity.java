package com.telpa.ecommerce.activities.form;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class FormActivity extends AppCompatActivity implements IFormView {

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
    Spinner spinner;
    @BindView(R.id.spinner2)
    Spinner spinner2;
    @BindView(R.id.spinner3)
    Spinner spinner3;
    private FormPresenter formPresenter;
    private Form form;

    private String[] arraySpinner1;
    private String[] arraySpinner2;
    private String[] arraySpinner3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        ButterKnife.bind(this);


        //TODO
        arraySpinner1 = new String[]{"siyah", "beyaz", "gri"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, arraySpinner1);
        arraySpinner2 = new String[]{"S", "M", "L"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, arraySpinner2);
        arraySpinner3 = new String[]{"2 taksit", "3 taksit"};
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, arraySpinner3);
        spinner.setAdapter(adapter1);
        spinner2.setAdapter(adapter2);
        spinner3.setAdapter(adapter3);


        formPresenter = new FormPresenter(this, getApplication());



    }

    @OnClick({R.id.searchButton, R.id.basketButton, R.id.button, R.id.button2})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.searchButton:
                break;
            case R.id.basketButton:
                break;
            case R.id.button:
                form = new Form();
                form.setCustomerID(1);
                form.setInfo1(placeholderText.getText().toString());
                form.setInfo2(someText.getText().toString());
                form.setOption1(arraySpinner1[spinner.getSelectedItemPosition()]);
                form.setOption2(arraySpinner2[spinner2.getSelectedItemPosition()]);
                form.setOption3(arraySpinner3[spinner3.getSelectedItemPosition()]);
                form.setOption4(checkBox.isChecked());
                form.setOption5(checkBox2.isChecked());
                form.setOption6(radioButton.isChecked());
                formPresenter.submitForm(form);
                break;
            case R.id.button2:
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

}
