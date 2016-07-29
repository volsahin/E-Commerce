package com.telpa.ecommerce.network;

import com.telpa.ecommerce.CategoryModule;
import com.telpa.ecommerce.di.module.ApplicationModule;
import com.telpa.ecommerce.di.module.NetModule;

import java.util.List;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by SAMSUNGNB on 29.07.2016.
 */
@Singleton
@Component(modules = {NetModule.class})
public interface APIService {

    @GET("users/{user}/repos")
    Call<List<String>> listRepos(@Path("user") String user);

}
