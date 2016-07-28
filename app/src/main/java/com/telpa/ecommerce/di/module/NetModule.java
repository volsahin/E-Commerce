package com.telpa.ecommerce.di.module;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.telpa.ecommerce.BuildConfig;

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
    Retrofit provideRetrofit() {
        Retrofit retrofit = new Retrofit
                .Builder()
                .baseUrl(BuildConfig.SERVER_URL)
                .build();
        return retrofit;
    }
}