package com.telpa.ecommerce.di.module;

import com.telpa.ecommerce.ECommerceApp;
import com.telpa.ecommerce.impl.IBasketImpl;
import com.telpa.ecommerce.interfaces.IBasket;

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
    ECommerceApp providesApplication() {
        return application;
    }

    @Provides
    IBasket providesIBasket() {
        IBasketImpl basket=new IBasketImpl();
        return basket;
    }

}