package com.telpa.ecommerce.di.module;

import android.app.Application;
import android.content.Context;

import com.telpa.ecommerce.ECommerceApp;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Mert on 27.07.2016.
 */


@Module
public class ApplicationModule {


    private final ECommerceApp mapplication;

    public ApplicationModule(ECommerceApp application) {
        this.mapplication = application;

    }

    @Provides
    @Singleton
    Application providesApplication() {
        return mapplication;
    }

    @Provides
    @Singleton
    Context provideApplicationContext() {
        return mapplication;
    }
}