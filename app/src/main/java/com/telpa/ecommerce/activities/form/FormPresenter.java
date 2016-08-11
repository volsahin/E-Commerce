package com.telpa.ecommerce.activities.form;

import android.app.Application;

import com.telpa.ecommerce.ECommerceApp;
import com.telpa.ecommerce.interfaces.IForm;
import com.telpa.ecommerce.models.Form;

import javax.inject.Inject;

/**
 * Created by Mert on 11.08.2016.
 */
public class FormPresenter implements IFormPresenter {
    @Inject
    IForm form;

    private Application application;
    private IFormView view;


    public FormPresenter(IFormView view, Application application) {
        this.view = view;
        this.application=application;

    }

    @Override
    public void submitForm(Form form) {
        ((ECommerceApp)application).getComponent().inject(this);
        if(this.form.submitForm(form))
            view.onSuccess();
        else
            view.onFail();

    }
}
