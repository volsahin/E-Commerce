package com.telpa.ecommerce.ScreenE;

import com.telpa.ecommerce.models.Category;

import java.util.ArrayList;

/**
 * Created by root on 16.08.2016.
 */
public class ScreenEPresenter implements IscreenEPresenter{
    IscreenEView view;
    public ScreenEPresenter(IscreenEView view) {
        this.view = view;
    }

    @Override
    public ArrayList<Category> categories() {

        ArrayList<Category> categories = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        Category a = new Category();
        a.setName("Category");
        a.setHighResImageUrl("http://formatatma.net/wp-content/uploads/2015/07/General-Mobile-Discovery-Air-format-atma.jpg");
        a.setLowResImageUrl("");
        a.setID(1);
        a.setNumOfProduct(2);
        a.setParentID(0);
        categories.add(a);
        categories.add(a);
        categories.add(a);
        categories.add(a);
        categories.add(a);

        return categories;
}
        }
