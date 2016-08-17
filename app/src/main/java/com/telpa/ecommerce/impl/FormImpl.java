package com.telpa.ecommerce.impl;

import android.app.Application;

import com.telpa.ecommerce.ECommerceApp;
import com.telpa.ecommerce.activities.activityJ_Form.IScreenJView;
import com.telpa.ecommerce.interfaces.IForm;
import com.telpa.ecommerce.models.Form;
import com.telpa.ecommerce.network.APIService;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by SAMSUNGNB on 1.08.2016.
 */

public class FormImpl implements IForm {
    @Inject
    APIService service;

    private IScreenJView view;

    public FormImpl() {
    }

    public FormImpl(Application application, IScreenJView view) {
        ((ECommerceApp) application).getComponent().inject(this);
        this.view=view;

    }

    @Override
    public boolean submitForm(Form form) {

        return true;
    }
}
