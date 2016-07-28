package com.telpa.ecommerce.di.component;

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

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Mert on 27.07.2016.
 */

@Singleton
@Component(modules = {ApplicationModule.class})

public interface IApplicationComponent {

    void inject (ScreenAActivity activityA);
   /* void inject (ScreenBActivity activityB);
    void inject (ScreenCActivity activityC);
    void inject (ScreenDActivity activityD);
    void inject (ScreenEActivity activityE);
    void inject (ScreenFActivity activityF);
    void inject (ScreenGActivity activityG);
    void inject (ScreenHActivity activityH);
    void inject (ScreenIActivity activityI);
    void inject (ScreenJActivity_Form activityJ);
    void inject (ScreenKActivity activityK);
    void inject (ScreenLActivity activityL);
    void inject (ScreenMActivity_Basket activityM);*/


}
