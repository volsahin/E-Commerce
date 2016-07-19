package com.telpa.ecommerce.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.telpa.ecommerce.R;
import com.telpa.ecommerce.utils.BaseActivity;

public class ScreenEActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_e);

        fcreateTitle("My Store");
        fcreateToolbar(this, true, true, R.id.toolbar);
        fcreateMenu(this);
    }
}
