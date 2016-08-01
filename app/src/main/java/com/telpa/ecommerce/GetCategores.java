package com.telpa.ecommerce;

import com.telpa.ecommerce.di.module.NetModule;

import java.util.ArrayList;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Mert on 29.07.2016.
 */

public interface GetCategores {


    ArrayList <Integer> getCategories();



}
