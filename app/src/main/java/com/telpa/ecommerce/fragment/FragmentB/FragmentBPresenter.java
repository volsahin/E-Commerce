package com.telpa.ecommerce.fragment.FragmentB;

import android.view.View;
import android.widget.Toast;

import com.telpa.ecommerce.impl.CategoryImpl;
import com.telpa.ecommerce.interfaces.ICategory;
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
    @Inject
    ICategory category;

    private IFragmentBView view;
    private int categoryID;
    ArrayList<Product> products;
    ArrayList<Category> subCategories;

    public FragmentBPresenter(FragmentBView fragmentBView) {

        category=new CategoryImpl();

        this.view = fragmentBView;
    }

    @Override
    public void loadView(Category category) {

        this.categoryID = category.getID();
    }

    @Override
    public void getTopSubCategory(View view) {
        Category topSubCategory=category.getTopSubCategory(categoryID);
        this.view.setTopCategoryTitle(topSubCategory.getName());

        category.getCategories(0);


        getTopProducts(topSubCategory,view);
    }

    @Override
    public void getTopProducts(Category category, View view) {
        products = new ArrayList<>();
        ArrayList<String> url = new ArrayList<String>();
        url.add("http://www.batmanda.com/rsm.batmanda/1970335733.jpg");

        Product b = new Product();
        b.setName("");
        b.setID(1);
        b.setCategoryID(1);
        b.setDescripton("");
        b.setHighResImageUrls(url);
        b.setLowResImageUrls(url);
        b.setPrice(30);
        b.setRating(2);
        b.setRating(3);
        products.add(b);
        products.add(b);
        products.add(b);
        products.add(b);

        /*
        service.getProducts(category.getID()).enqueue(new Callback<Product>() {

            @Override
            public void onResponse(Call<Product> call, Response<Product> response) {
                products.add(response.body());
            }

            @Override
            public void onFailure(Call<Product> call, Throwable t) {
                view.onFail();
            }

        });

        */
        this.view.setTopCategoryProducts(products);
        this.view.onSuccess();
    }

    @Override
    public void getSubCategories(View view) {
        subCategories = new ArrayList<>();
        subCategories=category.getCategories(0);

        /*
        service.getCategories(categoryID).enqueue(new Callback<Category>() {
            @Override
            public void onResponse(Call<Category> call, Response<Category> response) {
                subCategories.add(response.body());
            }

            @Override
            public void onFailure(Call<Category> call, Throwable t) {

            }
        });

        */

        this.view.setOtherSubCategories(subCategories);
    }


}
