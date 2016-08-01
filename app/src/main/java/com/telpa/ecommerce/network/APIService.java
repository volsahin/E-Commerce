package com.telpa.ecommerce.network;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by SAMSUNGNB on 29.07.2016.
 */
public interface APIService {
    @GET("list.php")
    Call<People> getPeople();

    @GET("list.php")
    Call<Musterus> getMusteri();
}
