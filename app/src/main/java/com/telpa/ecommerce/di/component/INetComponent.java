package com.telpa.ecommerce.di.component;

import com.telpa.ecommerce.activities.ScreenAActivity;
import com.telpa.ecommerce.activities.ScreenLActivity;
import com.telpa.ecommerce.di.module.ApplicationModule;
import com.telpa.ecommerce.di.module.NetModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by Mert on 28.07.2016.
 */
@Singleton
@Component(modules={NetModule.class})
public interface INetComponent {

    Retrofit retrofit();
    void inject (ScreenLActivity activityL);


}
