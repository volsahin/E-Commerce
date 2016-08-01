package com.telpa.ecommerce.di.component;

import com.telpa.ecommerce.activities.ScreenLActivity;
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

    /*void inject (ScreenAActivity activityA);
    void inject (ScreenBActivity activityB);
    void inject (ScreenCActivity activityC);
    void inject (ScreenDActivity activityD);
    void inject (ScreenEActivity activityE);
    void inject (ScreenFActivity activityF);
    void inject (ScreenGActivity activityG);
    void inject (ScreenHActivity activityH);
    void inject (ScreenIActivity activityI);
    void inject (ScreenJActivity_Form activityJ);
    void inject (ScreenKActivity activityK);*/
    void inject(ScreenLActivity activityL);

//    void inject(ScreenMActivity_Basket activityM);


}
