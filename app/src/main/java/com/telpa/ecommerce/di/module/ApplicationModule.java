package com.telpa.ecommerce.di.module;

import com.telpa.ecommerce.ECommerceApp;
import com.telpa.ecommerce.impl.BasketImpl;
import com.telpa.ecommerce.impl.CategoryImpl;
import com.telpa.ecommerce.impl.FormImpl;
import com.telpa.ecommerce.impl.ProductImpl;
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
        BasketImpl basket = new BasketImpl();
        return basket;
    }

    @Provides
    @Singleton //??????
    ICategory providesCategories() {
        ICategory category = new CategoryImpl();
        return category;
    }

    @Provides
    @Singleton //??????
    IForm providesForm() {
        IForm form = new FormImpl();
        return form;
    }

    @Provides
    @Singleton //??????
    IProduct providesProduct() {
        IProduct product = new ProductImpl();
        return product;
    }



}