package com.telpa.ecommerce.utils;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;

import com.telpa.ecommerce.models.Category;

/**
 * Created by SAMSUNGNB on 15.07.2016.

 */
public class TabHelper extends Fragment {
    private String title;
    private View view;
    private Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Nullable
    @Override
    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }
}
