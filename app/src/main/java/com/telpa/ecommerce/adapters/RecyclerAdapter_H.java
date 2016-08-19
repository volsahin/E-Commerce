package com.telpa.ecommerce.adapters;

import android.app.Activity;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.telpa.ecommerce.R;
import com.telpa.ecommerce.models.Category;

import java.security.PublicKey;
import java.util.ArrayList;


/**
 * Created by volkan on 14.07.2016.
 */

public class RecyclerAdapter_H extends RecyclerView.Adapter<RecyclerAdapter_H.ViewHolder> {

    private int amountOfData;
    private int id;
    private ArrayList<Category> categories;
    private Activity activity;

    public RecyclerAdapter_H(Activity activity,int amountOfData, int id,ArrayList<Category> categories) {
        this.amountOfData = amountOfData;
        this.id = id;
        this.categories=categories;
        this.activity=activity;

    }

    @Override
    public RecyclerAdapter_H.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(id, parent, false);

        RecyclerAdapter_H.ViewHolder viewHolder = new RecyclerAdapter_H.ViewHolder(v);
        new SpaceItemDecoration(300);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.productName.setText("Name"+ position);
        holder.category.setText(categories.get(position).getName());
        categories.get(0);
        Picasso.with(activity).load(categories.get(0).getHighResImageUrl()).into(holder.image);
        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundColor(000000);
            }
        });
    }

    @Override
    public int getItemCount() {
        return amountOfData;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView category;
        public TextView productName;
        public ImageButton image;

        public ViewHolder(View v) {
            super(v);
            category = (TextView) v.findViewById(R.id.category);
            productName=(TextView) v.findViewById(R.id.productName);
            image = (ImageButton) v.findViewById(R.id.image1);

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
