package com.telpa.ecommerce.di.component;

import com.telpa.ecommerce.activities.activityA.ScreenAPresenterImpl;
import com.telpa.ecommerce.activities.activityF.ScreenFPresenterImpl;
import com.telpa.ecommerce.activities.activityF.fragmentF.FragmentFPresenter;
import com.telpa.ecommerce.activities.activityH.ScreenHActivity;
import com.telpa.ecommerce.activities.activityD.ScreenDPresenterImpl;
import com.telpa.ecommerce.activities.activityH.ScreenHActivity;
import com.telpa.ecommerce.activities.activityB.ScreenBPresenterImpl;
import com.telpa.ecommerce.activities.activityC.ScreenCPresenterImpl;
import com.telpa.ecommerce.activities.activityE.ScreenEPresenter;
import com.telpa.ecommerce.activities.activityG.ScreenGPresenterImpl;
import com.telpa.ecommerce.activities.activityE.ScreenEActivity;
import com.telpa.ecommerce.activities.activityK.ScreenKActivity;
import com.telpa.ecommerce.activities.ScreenMActivity_Basket;
import com.telpa.ecommerce.activities.activityH.ScreenHPresenter;
import com.telpa.ecommerce.activities.activityI.ScreenIPresenterImpl;
import com.telpa.ecommerce.activities.activityJ_Form.ScreenJPresenter;
import com.telpa.ecommerce.activities.activityK.ScreenKPresenter;
import com.telpa.ecommerce.activities.activityL.ScreenL;
import com.telpa.ecommerce.activities.activityL.ScreenLPresenter;
import com.telpa.ecommerce.adapters.RecyclerAdapter_ABCG;
import com.telpa.ecommerce.adapters.RecyclerAdapter_BBig;
import com.telpa.ecommerce.adapters.RecyclerAdapter_F;
import com.telpa.ecommerce.di.module.ApplicationModule;
import com.telpa.ecommerce.di.module.NetModule;
import com.telpa.ecommerce.activities.activityB.fragmentB.FragmentBPresenter;
import com.telpa.ecommerce.activities.activityC.fragmentC.FragmentCPresenter;
import com.telpa.ecommerce.activities.activityG.fragmentG.FragmentGPresenter;

import com.telpa.ecommerce.activities.activityA.fragmentA.FragmentAPresenter;
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

    void inject (ScreenIActivity activityI);
    void inject (ScreenJActivity_Form activityJ);
    */
    void inject(FormImpl form);

    void inject(ScreenJPresenter screenJFormPresenter);

    void inject (ScreenKActivity activityK);
    void inject(ScreenKPresenter screenKPresenter);
    void inject(ScreenBPresenterImpl screenBPresenter);
    void inject(FragmentBPresenter fragmentBPresenter);

    void inject(RecyclerAdapter_ABCG recyclerAdapter_abcg);

    void inject(RecyclerAdapter_BBig recyclerAdapter_bBig);

    void inject(RecyclerAdapter_F recyclerAdapter_F);
    void inject(ScreenFPresenterImpl screenFPresenter);
    void inject(FragmentFPresenter fragmentfPresenter);

    void inject(ScreenL activityL);
    void inject(ScreenLPresenter screenLPresenter);

    void inject(ScreenCPresenterImpl screenCPresenter);
    void inject(FragmentCPresenter fragmentCPresenter);

    void inject(ScreenGPresenterImpl screenGPresenter);
    void inject(FragmentGPresenter fragmentgPresenter);

    void inject (ScreenEActivity activityE);
    void inject(ScreenEPresenter screenEPresenter);
    void inject(ScreenMActivity_Basket activityM);

    void inject (ScreenHActivity activityH);
    void inject(ScreenHPresenter screenHresenter);
    void inject(ScreenAPresenterImpl screenAPresenter);
    void inject(FragmentAPresenter fragmentAPresenter);

    void inject (ScreenIPresenterImpl screenIPresenter);

    void inject (ScreenDPresenterImpl screenDPresenter);
}
