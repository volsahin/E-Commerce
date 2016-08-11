package com.telpa.ecommerce.activities.form;

import android.app.Application;

import com.telpa.ecommerce.ECommerceApp;
import com.telpa.ecommerce.interfaces.IForm;
import com.telpa.ecommerce.models.Form;
import com.telpa.ecommerce.network.APIService;
import com.telpa.ecommerce.network.Example;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Mert on 11.08.2016.
 */
public class FormPresenter implements IFormPresenter {
    @Inject
    IForm form;
    @Inject
    APIService service;

    private Application application;
    private IFormView view;


    public FormPresenter(IFormView view, Application application) {
        this.view = view;
        this.application = application;

    }

    @Override
    public void submitForm(Form form) {
        ((ECommerceApp) application).getComponent().inject(this);
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

    }
}
