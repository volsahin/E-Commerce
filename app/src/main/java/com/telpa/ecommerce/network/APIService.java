package com.telpa.ecommerce.network;

import com.telpa.ecommerce.models.BasketItem;
import com.telpa.ecommerce.models.Category;
import com.telpa.ecommerce.models.Comment;
import com.telpa.ecommerce.models.Form;
import com.telpa.ecommerce.models.Product;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by SAMSUNGNB on 29.07.2016.
 */
public interface APIService {
    @GET("list.php")
    Call<People> getPeople();

    @GET("list.php")
    Call<Musterus> getMusteri();

    @GET("categories/get")
    Call<Category> getCategories(int parentCategoryID);

    @GET("products/get")
    Call<Product> getProducts(int categoryID);

    @GET("products/updateRating")
    Call<Boolean> setOverallRating(@Query("ProductID") int productID,
                                   @Query("UserRating") Float userRating
    );

    @GET("comments/get")
    Call<Comment> getComments(int productID);

    @GET("favorites/get")
    Call<Integer> getFavorites(int customerID);

    @GET("favorites/add")
    Call<Boolean> addFavorites(@Query("CustomerID") int customerID,
                               @Query("ProductID") int productID

    );

    @GET("basket/get")
    Call<BasketItem> getBasket(int customerID);

    @GET("basket/add")
    Call<Boolean> addBasket(@Query("CustomerID") int customerID,
                            @Query("BasketItem") BasketItem basketItem

    );

    @POST("forms")
    Call<Boolean> submitForm(@Body Form form);

    @GET("forms/spinnerValues")
    Call<ArrayList<String[]>> getSpinnerValues();


    @GET("checkout")
    Call<Boolean> checkout(@Query("CustomerID") int customerID,
                           @Query("BasketProduct") ArrayList<BasketItem> basketItems
    );


    @GET("userRatings")
    Call<Boolean> setRating(@Query("CustomerID") int customerID,
                            @Query("ProductID") int productID,
                            @Query("UserRating") Float userRating
    );

//TODO bu fonkisyon test içindir. Silinecek!
    @FormUrlEncoded
    @POST("add.php")
    Call<Example> makeAdd(@Field("name") String option1,
                          @Field("surname") String option2,
                          @Field("mail") String option3);



}
