package com.telpa.ecommerce.di.module;

import com.telpa.ecommerce.ECommerceApp;
import com.telpa.ecommerce.impl.IBasketImpl;
import com.telpa.ecommerce.impl.ICategoryImpl;
import com.telpa.ecommerce.impl.IFormImpl;
import com.telpa.ecommerce.impl.IProductImpl;
import com.telpa.ecommerce.interfaces.IBasket;
import com.telpa.ecommerce.interfaces.ICategory;
import com.telpa.ecommerce.interfaces.IForm;
import com.telpa.ecommerce.interfaces.IProduct;

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
    @Singleton //??????
    IBasket providesBasket() {
        IBasketImpl basket = new IBasketImpl();
        return basket;
    }

    @Provides
    @Singleton //??????
    ICategory providesCategories() {
        ICategory category = new ICategoryImpl();
        return category;
    }

    @Provides
    @Singleton //??????
    IForm providesForm() {
        IForm form = new IFormImpl();
        return form;
    }

    @Provides
    @Singleton //??????
    IProduct providesProduct() {
        IProduct product = new IProductImpl();
        return product;
    }



}