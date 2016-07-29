package com.telpa.ecommerce.di.module;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.telpa.ecommerce.ECommerceApp;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Mert on 27.07.2016.
 */


@Module
public class ApplicationModule {


    private final ECommerceApp application;

    public ApplicationModule(ECommerceApp application) {
        this.application = application;

    }

    @Provides
    @Singleton
    Application providesApplication() {return application;}


}