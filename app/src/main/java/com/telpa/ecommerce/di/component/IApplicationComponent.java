package com.telpa.ecommerce.di.component;

import com.telpa.ecommerce.activities.ActivityB.ScreenBPresenterImpl;
import com.telpa.ecommerce.activities.ActivityC.ScreenCPresenterImpl;
import com.telpa.ecommerce.activities.ActivityG.ScreenGPresenterImpl;
import com.telpa.ecommerce.activities.ScreenEActivity;
import com.telpa.ecommerce.activities.ScreenKActivity;
import com.telpa.ecommerce.activities.ScreenMActivity_Basket;
import com.telpa.ecommerce.activities.activityL.ScreenLActivity;
import com.telpa.ecommerce.activities.activityL.ScreenLPresenter;
import com.telpa.ecommerce.activities.form.FormPresenter;
import com.telpa.ecommerce.adapters.RecyclerAdapter_ABCG;
import com.telpa.ecommerce.adapters.RecyclerAdapter_BBig;
import com.telpa.ecommerce.di.module.ApplicationModule;
import com.telpa.ecommerce.di.module.NetModule;
import com.telpa.ecommerce.fragment.FragmentB.FragmentBPresenter;
import com.telpa.ecommerce.fragment.FragmentC.FragmentCPresenter;
import com.telpa.ecommerce.fragment.FragmentG.FragmentGPresenter;
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

    void inject (ScreenFActivity activityF);
    void inject (ScreenGActivity activityG);
    void inject (ScreenHActivity activityH);
    void inject (ScreenIActivity activityI);
    void inject (ScreenJActivity_Form activityJ);
    */
    void inject(FormPresenter formPresenter);
    void inject(FormImpl form);
    void inject (ScreenKActivity activityK);
    void inject(ScreenBPresenterImpl screenBPresenter);
    void inject(FragmentBPresenter fragmentBPresenter);
    void inject(RecyclerAdapter_ABCG recyclerAdapter_abcg);
    void inject(RecyclerAdapter_BBig recyclerAdapter_bBig);
    void inject(ScreenLActivity activityL);
    void inject(ScreenLPresenter screenLPresenter);
    void inject(ScreenCPresenterImpl screenCPresenter);
    void inject(FragmentCPresenter fragmentCPresenter);
    void inject(ScreenGPresenterImpl screenGPresenter);
    void inject(FragmentGPresenter fragmentgPresenter);
    void inject (ScreenEActivity activityE);
    void inject(ScreenMActivity_Basket activityM);


}
