package com.telpa.ecommerce;

import android.app.Application;
import android.widget.Toast;

import com.telpa.ecommerce.activities.ScreenAActivity;
import com.telpa.ecommerce.activities.ScreenBActivity;
import com.telpa.ecommerce.activities.ScreenCActivity;
import com.telpa.ecommerce.activities.ScreenDActivity;
import com.telpa.ecommerce.activities.ScreenEActivity;
import com.telpa.ecommerce.activities.ScreenFActivity;
import com.telpa.ecommerce.activities.ScreenGActivity;
import com.telpa.ecommerce.activities.ScreenHActivity;
import com.telpa.ecommerce.activities.ScreenIActivity;
import com.telpa.ecommerce.activities.ScreenJActivity_Form;
import com.telpa.ecommerce.activities.ScreenKActivity;
import com.telpa.ecommerce.activities.ScreenLActivity;
import com.telpa.ecommerce.activities.ScreenMActivity_Basket;
import com.telpa.ecommerce.di.component.DaggerIApplicationComponent;
import com.telpa.ecommerce.di.component.DaggerINetComponent;
import com.telpa.ecommerce.di.component.IApplicationComponent;
import com.telpa.ecommerce.di.component.INetComponent;
import com.telpa.ecommerce.di.module.ApplicationModule;
import com.telpa.ecommerce.di.module.NetModule;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class ECommerceApp extends Application {


    private IApplicationComponent component;
    private INetComponent mNetComponent;


    @Override
    public void onCreate()
    {
        super.onCreate();
        component = DaggerIApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        mNetComponent = DaggerINetComponent.
                builder()
                .netModule(new NetModule())
                .build();


    }
    public IApplicationComponent getComponent() {
        return component;
    }

    public INetComponent getmNetComponent(){return mNetComponent;}

}
