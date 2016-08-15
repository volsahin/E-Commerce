package com.telpa.ecommerce.di.component;

import com.telpa.ecommerce.activities.ActivityB.ScreenBPresenterImpl;
import com.telpa.ecommerce.activities.ScreenLActivity;
import com.telpa.ecommerce.activities.ScreenMActivity_Basket;
import com.telpa.ecommerce.activities.form.FormActivity;
import com.telpa.ecommerce.activities.form.FormPresenter;
import com.telpa.ecommerce.di.module.ApplicationModule;
import com.telpa.ecommerce.di.module.NetModule;
import com.telpa.ecommerce.impl.BasketImpl;
import com.telpa.ecommerce.impl.FormImpl;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Mert on 27.07.2016.
 */

@Singleton
@Component(modules = {ApplicationModule.class, NetModule.class, BasketImpl.class})

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
    void inject(FormPresenter formPresenter);
    void inject(FormImpl form);
    void inject(ScreenBPresenterImpl screenBPresenter);
    void inject(ScreenLActivity activityL);

    void inject(ScreenMActivity_Basket activityM);


}
