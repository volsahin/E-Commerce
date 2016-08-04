package com.telpa.ecommerce.network;

import com.telpa.ecommerce.models.Category;
import com.telpa.ecommerce.models.Comment;
import com.telpa.ecommerce.models.Product;

import java.util.ArrayList;

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
    Call<Category> getSubCategories(int categoryID);

    @GET("")
    Call<Product> getProducts(int categoryID);

    @GET("")
    Call<Comment> getComments(int productID);

    @GET("")
    Call<Integer> getFavorites(int customerID);

    @GET("")
    Call<ArrayList<Integer>> getBasket(int customerID);

    @POST("")
    Call<Boolean> submitForm(@Field("CustomerID") int customerID,
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
    Call<Boolean> addBasket(@Field("CustomerID") int customerID,
                            @Field("ProductID") int productID,
                            @Field("Number") int number,
                            @Field("variant1") int variant1,
                            @Field("variant2") int variant2
    );

    @POST
    Call<Boolean> checkout(@Field("CustomerID") int customerID,
                           @Field("BasketProduct") ArrayList<Integer> basketProduct // ProductID ,Number,Variant1,Variant2 istiyor.
    );

    @POST
    Call<Boolean> addFavorites(@Field("CustomerID") int customerID,
                               @Field("ProductID") int productID

    );

    @POST
    Call<Boolean> setRating(@Field("CustomerID") int customerID,
                            @Field("ProductID") int productID,
                            @Field("UserRating") Float userRating
    );

    @POST
    Call<Boolean> setOverallRating(@Field("ProductID") int productID,
                                   @Field("UserRating") Float userRating
    );

}
