package com.telpa.ecommerce.impl;

import com.telpa.ecommerce.interfaces.IBasket;
import com.telpa.ecommerce.models.BasketItem;
import com.telpa.ecommerce.models.Product;
import com.telpa.ecommerce.network.APIService;

import java.util.ArrayList;
import java.util.HashMap;

import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by SAMSUNGNB on 1.08.2016.
 */


@Module
public class BasketImpl implements IBasket {
    @Inject
    APIService service;

    @Override
    public ArrayList<BasketItem> getBasket(int customerID) {


        //TODO serviceden gelecek şekilde yaz.
        ArrayList<BasketItem> basketItems=new ArrayList<>();

        BasketItem item=new BasketItem();
        item.setNumber(5);
        item.setVariant1(2);
        item.setVariant2(3);

        ArrayList<String> url = new ArrayList<String>();
        url.add("http://www.batmanda.com/rsm.batmanda/1970335733.jpg");
        Product b = new Product();
        b.setName("BasketÜrünü");
        b.setID(1);
        b.setCategoryID(1);
        b.setDescripton("");
        b.setHighResImageUrls(url);
        b.setLowResImageUrls(url);
        b.setPrice(30);
        b.setRating(2);
        item.setProduct(b);

        basketItems.add(item);

        BasketItem item2=new BasketItem();
        item2.setNumber(3);
        item2.setVariant1(1);
        item2.setVariant2(3);

        ArrayList<String> url2 = new ArrayList<String>();
        url2.add("http://www.telefonkilavuzu.com/wp-content/uploads/2016/01/telefon-numaras%C4%B1.jpg");
        Product a = new Product();
        a.setName("BasketÜrünü2");
        a.setID(1);
        a.setCategoryID(1);
        a.setDescripton("");
        a.setHighResImageUrls(url2);
        a.setLowResImageUrls(url2);
        a.setPrice(50);
        a.setRating(2);

        item2.setProduct(a);
        basketItems.add(item2);


        BasketItem item3=new BasketItem();
        item2.setNumber(2);
        item2.setVariant1(1);
        item2.setVariant2(3);

        ArrayList<String> url3 = new ArrayList<String>();
        url3.add("http://ssl-product-images.www8-hp.com/digmedialib/prodimg/lowres/c04093313.png");
        Product c = new Product();
        c.setName("BasketÜrünü3");
        c.setID(1);
        c.setCategoryID(1);
        c.setDescripton("");
        c.setHighResImageUrls(url3);
        c.setLowResImageUrls(url3);
        c.setPrice(100);
        c.setRating(2);

        item3.setProduct(c);
        basketItems.add(item3);



        return basketItems;
    }

    @Override
    public boolean addBasket(int customerID, ArrayList<BasketItem> basketItems) {
        return false;
    }

    @Override
    public boolean addFavorites(int customerID, ArrayList<BasketItem> basketItems) {
        return false;
    }

    @Override
    public boolean checkOut(int customerID, ArrayList<BasketItem> basketItems) {
        return false;
    }
}
