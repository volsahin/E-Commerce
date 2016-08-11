package com.telpa.ecommerce.activities.form;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.telpa.ecommerce.R;

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
    private FormPresenter formPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        ButterKnife.bind(this);

        formPresenter = new FormPresenter(this);
        onSuccess(formPresenter.submitForm(placeholderText.getText().toString(),someText.getText().toString()));

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
                break;
        }
    }

    @Override
    public void onSuccess(boolean a) {
        if(a)
        {
            Toast.makeText(FormActivity.this, "TELPA", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(FormActivity.this, "Fail", Toast.LENGTH_SHORT).show();

        }
    }
}
