package com.telpa.ecommerce.network;

import com.telpa.ecommerce.interfaces.Category;
import com.telpa.ecommerce.interfaces.Comment;
import com.telpa.ecommerce.interfaces.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by SAMSUNGNB on 29.07.2016.
 */
public interface APIService {
    @GET("list.php")
    Call<People> getPeople();

    @GET("list.php")
    Call<Musterus> getMusteri();

    @GET("")
    Call<Category> getCategories();

    @GET("")
    Call<Category> getSubCategories(int CategoryID);

    @GET("")
    Call<Product> getProducts();

    @GET("")
    Call<Comment> getComments();

    @GET("")
    Call<Integer> getFavorites(int CustomerID);

    @GET("")
    Call<HashMap<Integer, Integer>> getBasket(int CustomerID);

    @POST("")
    Call<Boolean> submitForm(@Field("CustomerID") int CustomerID,
                             @Field("info1") String info1,
                             @Field("info2") String info2,
                             @Field("option1") String option1,
                             @Field("option2") String option2,
                             @Field("option3") String option3,
                             @Field("option4") Boolean option4,
                             @Field("option5") Boolean option5,
                             @Field("option6") Boolean option6
    );

    @POST
    Call<Boolean> addBasket(@Field("CustomerID") int CustomerID,
                            @Field("ProductID") int ProductID,
                            @Field("Number") int Number,
                            @Field("variant1") int variant1,
                            @Field("variant2") int variant2
    );

    @POST
    Call<Boolean> checkout(@Field("CustomerID") int CustomerID,
                           @Field("BasketProduct") ArrayList<Integer> BasketProduct // ProductID ,Number,Variant1,Variant2 istiyor.
    );

    @POST
    Call<Boolean> addFavorites(@Field("CustomerID") int CustomerID,
                               @Field("ProductID") int ProductID

    );

    @POST
    Call<Boolean> setRating(@Field("CustomerID") int CustomerID,
                            @Field("ProductID") int ProductID,
                            @Field("UserRating") Float UserRating
    );

    @POST
    Call<Boolean> setOverallRating(@Field("ProductID") int ProductID,
                                   @Field("UserRating") Float UserRating
    );

}
