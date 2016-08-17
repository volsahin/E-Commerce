package com.telpa.ecommerce.adapters;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.telpa.ecommerce.ECommerceApp;
import com.telpa.ecommerce.R;
import com.telpa.ecommerce.activities.activityI.ScreenI;
import com.telpa.ecommerce.interfaces.IProduct;
import com.telpa.ecommerce.models.Category;
import com.telpa.ecommerce.models.Product;

import java.util.ArrayList;

import javax.inject.Inject;


/**
 * Created by volkan on 14.07.2016.
 */

public class RecyclerAdapter_ABCG extends RecyclerView.Adapter<RecyclerAdapter_ABCG.ViewHolder> {
    @Inject
    IProduct IProduct;

    private int amountOfData;
    private int id;
    private ArrayList<Category> categories;
    private Activity activity;
    private String type;


    public RecyclerAdapter_ABCG(Activity activity, int amountOfData, int id, ArrayList<Category> categories, String type, Application application) {
        this.amountOfData = amountOfData;
        this.id = id;
        this.categories = categories;
        this.activity = activity;
        this.type = type;
        ((ECommerceApp) application).getComponent().inject(this);
    }


    @Override
    public RecyclerAdapter_ABCG.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(id, parent, false);

        RecyclerAdapter_ABCG.ViewHolder viewHolder = new RecyclerAdapter_ABCG.ViewHolder(v);
        new SpaceItemDecoration(300);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        RecyclerView.LayoutManager recyclerLayoutManager;
        ArrayList<Product> products;
        RecyclerView.Adapter recyclerAdapter = new RecyclerAdapter(0, 0);

        holder.subcategory.setText(categories.get(position).getName());
        holder.viewAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity, ScreenI.class);
                i.putExtra("category", categories.get(position));
                activity.startActivity(i);

            }
        });

        products = IProduct.getProducts(categories.get(position).getID());

        holder.recyclerView.setHasFixedSize(true);

        recyclerLayoutManager = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
        holder.recyclerView.setLayoutManager(recyclerLayoutManager);


        if (type.equals("a") || type.equals("b")) {
            holder.recyclerView.addItemDecoration(new RecyclerAdapter.SpaceItemDecoration(4));
            if (products.size() >= 6)
                recyclerAdapter = new RecyclerAdapter_ABCGSmall(activity, 6, R.layout.item_a_and_b_small, products, "a");
            else
                recyclerAdapter = new RecyclerAdapter_ABCGSmall(activity, products.size(), R.layout.item_a_and_b_small, products, "a");

        } else if (type.equals("c")) {
            holder.recyclerView.addItemDecoration(new RecyclerAdapter.SpaceItemDecoration(0));
            recyclerLayoutManager = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL);
            holder.recyclerView.setLayoutManager(recyclerLayoutManager);
            if (products.size() >= 2)
                recyclerAdapter = new RecyclerAdapter_ABCGSmall(activity, 2, R.layout.item_i_and_c, products, "c");
            else
                recyclerAdapter = new RecyclerAdapter_ABCGSmall(activity, products.size(), R.layout.item_i_and_c, products, "c");

        } else if (type.equals("g")) {
            holder.recyclerView.addItemDecoration(new RecyclerAdapter.SpaceItemDecoration(4));
            if (products.size() >= 6)
                recyclerAdapter = new RecyclerAdapter_ABCGSmall(activity, 6, R.layout.item_g, products, "g");
            else
                recyclerAdapter = new RecyclerAdapter_ABCGSmall(activity, products.size(), R.layout.item_g, products, "g");
        }

        holder.recyclerView.setAdapter(recyclerAdapter);


    }

    @Override
    public int getItemCount() {
        return amountOfData;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView subcategory;
        public TextView viewAll;
        public RecyclerView recyclerView;


        public ViewHolder(View v) {
            super(v);

            subcategory = (TextView) v.findViewById(R.id.subcategories);
            viewAll = (TextView) v.findViewById(R.id.viewallTop);
            recyclerView = (RecyclerView) v.findViewById(R.id.recyclerViewABCGitem);

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
