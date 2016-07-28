package com.telpa.ecommerce;

import android.app.Application;

import com.telpa.ecommerce.di.component.DaggerIApplicationComponent;
import com.telpa.ecommerce.di.component.IApplicationComponent;
import com.telpa.ecommerce.di.component.INetComponent;
import com.telpa.ecommerce.di.module.ApplicationModule;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class ECommerceApp extends Application {


    private INetComponent mNetComponent;
    private IApplicationComponent component;


    @Override
    public void onCreate()
    {
        super.onCreate();
        component = DaggerIApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();



    }
    public IApplicationComponent getComponent() {
        return component;
    }
}
