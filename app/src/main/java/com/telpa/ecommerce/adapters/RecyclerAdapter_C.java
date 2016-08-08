package com.telpa.ecommerce.adapters;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.telpa.ecommerce.R;
import com.telpa.ecommerce.models.Category;
import com.telpa.ecommerce.models.Product;

import java.util.ArrayList;


/**
 * Created by volkan on 14.07.2016.
 */

public class RecyclerAdapter_C extends RecyclerView.Adapter<RecyclerAdapter_C.ViewHolder> {

    private int amountOfData;
    private int id;
    private ArrayList<Category> categories;
    Activity context;


    public RecyclerAdapter_C(Activity context,int amountOfData, int id, ArrayList<Category> categories) {
        this.amountOfData = amountOfData;
        this.id = id;
        this.categories=categories;
        this.context=context;
    }

    @Override
    public RecyclerAdapter_C.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(id, parent, false);

        RecyclerAdapter_C.ViewHolder viewHolder = new RecyclerAdapter_C.ViewHolder(v);
        new SpaceItemDecoration(300);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
            holder.subcategory.setText("Alt kategori "+position);

    }

    @Override
    public int getItemCount() {
        return amountOfData;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView subcategory;
        public RecyclerView recyclerView2;
        public RecyclerView.Adapter recyclerAdapter2;
        public RecyclerView.LayoutManager recyclerLayoutManager2;
        public ArrayList<Product> products;

        public ViewHolder(View v) {
            super(v);
            subcategory = (TextView) v.findViewById(R.id.subcategories);


            ArrayList<String> url=new ArrayList<String>();
            url.add("url1");
            url.add("urls2");
            products=new ArrayList<Product>();
            Product b=new Product();
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

            recyclerView2 = (RecyclerView) v.findViewById(R.id.recyclerViewCitem);

            recyclerView2.setHasFixedSize(true);

            recyclerLayoutManager2 = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL);
            recyclerView2.setLayoutManager(recyclerLayoutManager2);

            recyclerView2.addItemDecoration(new RecyclerAdapter.SpaceItemDecoration(12));
            recyclerAdapter2 = new RecyclerAdapter_CSmall(2, R.layout.item_i_and_c, products);
            recyclerView2.setAdapter(recyclerAdapter2);

        }
    }

    public static class SpaceItemDecoration extends RecyclerView.ItemDecoration {

        int space = 0;

        public SpaceItemDecoration(int space) {
            this.space = space;
        }

        @Override
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            outRect.left = space;
            outRect.right = space;
            outRect.bottom = space;


        }
    }
}
