package com.telpa.ecommerce;

import com.telpa.ecommerce.network.APIService;

import java.util.ArrayList;

import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Mert on 29.07.2016.
 */
@Module
public class CategoryModule implements  ICategoryComponent{

    @Provides
    public ArrayList<Category> getCategories() {
        return null;
    }



}
