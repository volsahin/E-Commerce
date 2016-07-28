package com.telpa.ecommerce.di.module;

import com.google.gson.Gson;
import com.telpa.ecommerce.BuildConfig;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Mert on 28.07.2016.
 */

@Module
public class NetModule {


    @Provides
    @Singleton
    Retrofit provideRetrofit() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BuildConfig.SERVER_URL)
                .build();
        return retrofit;
    }
}