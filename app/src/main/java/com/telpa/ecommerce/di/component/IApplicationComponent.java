package com.telpa.ecommerce.di.component;

import android.app.Application;
import android.view.View;

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
import com.telpa.ecommerce.di.module.ApplicationModule;
import com.telpa.ecommerce.di.module.NetModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Mert on 27.07.2016.
 */

@Singleton
@Component(modules = {ApplicationModule.class, NetModule.class})
public interface IApplicationComponent {
    void inject (ScreenLActivity activityL);




}
