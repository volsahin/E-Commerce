package com.telpa.ecommerce.interfaces;

import com.telpa.ecommerce.models.Form;

import dagger.Component;

/**
 * Created by Gizem İlgar on 1.8.2016.
 */
public interface IForm {
    boolean submitForm(Form form);
}
