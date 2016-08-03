package com.telpa.ecommerce.network;

import com.telpa.ecommerce.interfaces.Category;
import com.telpa.ecommerce.interfaces.Product;

import java.util.ArrayList;

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

    @GET("list.php")
    Call<Integer> getCategories();

    @GET("list.php")
    Call<Category> getCategory(int CategoryID);

}
