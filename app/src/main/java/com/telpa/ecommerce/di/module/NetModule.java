package com.telpa.ecommerce.di.module;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.telpa.ecommerce.BuildConfig;
import com.telpa.ecommerce.ECommerceApp;
import com.telpa.ecommerce.network.APIService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by Mert on 28.07.2016.
 */

@Module
public class NetModule {


    @Provides
    @Singleton
    APIService provideRetrofit() {
        Retrofit retrofit = new Retrofit
                .Builder()
                .baseUrl(BuildConfig.SERVER_URL)
                .build();
        APIService service = retrofit.create(APIService.class);
        return service;
    }
}