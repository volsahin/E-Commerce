package com.telpa.ecommerce.fragment.FragmentB;

import com.telpa.ecommerce.models.Category;
import com.telpa.ecommerce.models.Product;
import com.telpa.ecommerce.network.APIService;

import java.util.ArrayList;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by SAMSUNGNB on 12.08.2016.
 */
public class FragmentBPresenter implements IFragmentBPresenter {
    @Inject
    APIService service;

    private IFragmentBView view;
    private int categoryID;
    ArrayList<Product> products;
    ArrayList<Category> subCategories;

    @Override
    public void loadView(int categoryID) {
        this.categoryID=categoryID;
    }

    @Override
    public void getTopCategory() {
        service.getTopCategory(categoryID).enqueue(new Callback<Category>() {
            @Override
            public void onResponse(Call<Category> call, Response<Category> response) {
                view.setTopCategoryTitle(response.body().getName().toString());
                getTopProducts(response.body());
            }

            @Override
            public void onFailure(Call<Category> call, Throwable t) {

            }
        });
    }

    @Override
    public void getTopProducts(Category category) {
        products=new ArrayList<>();
        service.getProducts(category.getID()).enqueue(new Callback<Product>() {

            @Override
            public void onResponse(Call<Product> call, Response<Product> response) {
              products.add(response.body());
            }

            @Override
            public void onFailure(Call<Product> call, Throwable t) {

            }

        });
        view.setTopCategoryProducts(products);
    }

    @Override
    public void getSubCategories() {
        subCategories=new ArrayList<>();
        service.getCategories(categoryID).enqueue(new Callback<Category>() {
            @Override
            public void onResponse(Call<Category> call, Response<Category> response) {
                subCategories.add(response.body());
            }

            @Override
            public void onFailure(Call<Category> call, Throwable t) {

            }
        });

        view.setOtherSubCategories(subCategories);
    }


    @Override
    public void getTopCategoryTitle() {


    }
}
