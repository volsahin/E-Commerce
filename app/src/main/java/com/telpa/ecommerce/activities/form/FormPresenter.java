package com.telpa.ecommerce.activities.form;

import android.app.Application;
import android.widget.ArrayAdapter;

import com.telpa.ecommerce.ECommerceApp;
import com.telpa.ecommerce.R;
import com.telpa.ecommerce.interfaces.IForm;
import com.telpa.ecommerce.models.Form;
import com.telpa.ecommerce.network.APIService;
import com.telpa.ecommerce.network.Example;

import java.util.ArrayList;
import java.util.Objects;

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
    private ArrayList<String[]> spinnerValues;


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

    public void setSpinnerValues(){

        spinnerValues=new ArrayList<>();

        //TODO servisten alıcak şekilde yazılanı aktive et!
        /****************************************************************
        service.getSpinnerValues().enqueue(new Callback<ArrayList<String[]>>() {
            @Override
            public void onResponse(Call<ArrayList<String[]>> call, Response<ArrayList<String[]>> response) {
                spinnerValues=response.body();
            }

            @Override
            public void onFailure(Call<ArrayList<String[]>> call, Throwable t) {

            }
        });
        */
        String[] a=new String[]{"option1","option2","option3"};
        String[] b=new String[]{"option4","option5"};
        String[] c=new String[]{"option6","option7","option8","option9"};
        spinnerValues.add(a);
        spinnerValues.add(b);
        spinnerValues.add(c);

        //*********************************************

        String[] arraySpinner1=spinnerValues.get(0);
        String[] arraySpinner2=spinnerValues.get(1);
        String[] arraySpinner3=spinnerValues.get(2);

        view.setAdapters(spinnerValues);

    }
}
