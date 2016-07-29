package com.telpa.ecommerce;

import android.app.Application;

import com.telpa.ecommerce.di.component.DaggerIApplicationComponent;
import com.telpa.ecommerce.di.component.IApplicationComponent;
import com.telpa.ecommerce.di.module.ApplicationModule;
import com.telpa.ecommerce.di.module.NetModule;


public class ECommerceApp extends Application {

    private IApplicationComponent component;


    @Override
    public void onCreate()
    {
        super.onCreate();
        component = DaggerIApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public IApplicationComponent getComponent() {
        return component;
    }


}
