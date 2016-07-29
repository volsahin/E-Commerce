package com.telpa.ecommerce.network;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by SAMSUNGNB on 29.07.2016.
 */
public interface APIService {
    @GET("list.php")
    Call<String> listRepos();
}
