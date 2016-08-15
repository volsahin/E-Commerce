package com.telpa.ecommerce.impl;

import android.app.Application;

import com.telpa.ecommerce.ECommerceApp;
import com.telpa.ecommerce.activities.form.IFormView;
import com.telpa.ecommerce.interfaces.IForm;
import com.telpa.ecommerce.models.Form;
import com.telpa.ecommerce.network.APIService;
import com.telpa.ecommerce.network.Example;

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

    private IFormView view;

    public FormImpl() {
    }

    public FormImpl(Application application, IFormView view) {
        ((ECommerceApp) application).getComponent().inject(this);
        this.view=view;

    }

    @Override
    public boolean submitForm(Form form) {

        //TODO kendi service methoduna bağla
        service.makeAdd(form.getOption1(), form.getOption2(), form.getOption3())
                .enqueue(new Callback<Example>() {
                    @Override
                    public void onResponse(Call<Example> call, Response<Example> response) {
                        view.onSuccess();
                    }

                    @Override
                    public void onFailure(Call<Example> call, Throwable t) {

                        view.onFail();
                    }
                });

        return true;
    }
}
