package com.telpa.ecommerce.impl;

import android.app.Application;

import com.telpa.ecommerce.ECommerceApp;
import com.telpa.ecommerce.interfaces.IForm;
import com.telpa.ecommerce.models.Form;
import com.telpa.ecommerce.network.APIService;

import javax.inject.Inject;

/**
 * Created by SAMSUNGNB on 1.08.2016.
 */

public class FormImpl implements IForm {

    @Override
    public boolean submitForm(Form form) {
        return true;
    }
}
