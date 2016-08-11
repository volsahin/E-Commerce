package com.telpa.ecommerce.activities.form;

import com.telpa.ecommerce.models.Form;

/**
 * Created by Mert on 11.08.2016.
 */
public class FormPresenter implements IFormPresenter {

    IFormView view;


    public FormPresenter(IFormView view) {
        this.view = view;
    }

    @Override
    public boolean submitForm(String a,String b) {
        if(a.contains("a")&& b.contains("a"))
        {

            return true;
        }
        return false;
    }
}
