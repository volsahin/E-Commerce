package com.telpa.ecommerce.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;
import com.telpa.ecommerce.R;
import com.telpa.ecommerce.models.Product;
import com.telpa.ecommerce.utils.BaseActivity;

import java.util.ArrayList;


/**
 * Created by volkan on 14.07.2016.
 */

public class RecyclerAdapter_ABGSmall extends RecyclerView.Adapter<RecyclerAdapter_ABGSmall.ViewHolder> {

    private int amountOfData;
    private int id;
    private ArrayList<Product> products;
    Activity activity;
    String type;

    public RecyclerAdapter_ABGSmall(Activity activity, int amountOfData, int id, ArrayList<Product> products, String type) {
        this.amountOfData = amountOfData;
        this.id = id;
        this.products = products;
        this.activity=activity;
        this.type=type;

    }

    @Override
    public RecyclerAdapter_ABGSmall.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(id, parent, false);

        RecyclerAdapter_ABGSmall.ViewHolder viewHolder = new RecyclerAdapter_ABGSmall.ViewHolder(v);
        new SpaceItemDecoration(300);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        //TODO
//      holder.productName.setText(products.get(position).getName());
        holder.productName.setText("Name " + position);
        holder.price.setText("$50");
        products.get(0);
        Picasso.with(activity).load(products.get(position).getHighResImageUrls().get(0)).into(holder.image);
        if(type.equals("c")){
            holder.description.setText("Yorum");
            holder.ratingBar.setRating(5);

        }
        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(activity, "Mert Bulut", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return amountOfData;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView productName;
        public TextView price;
        public TextView description;
        public RatingBar ratingBar;
        public ImageButton image;


        public ViewHolder(View v) {
            super(v);
            final RecyclerAdapter_ABGSmall adapter=RecyclerAdapter_ABGSmall.this;
            String type=adapter.type;

            productName = (TextView) v.findViewById(R.id.productName);
            price = (TextView) v.findViewById(R.id.price);
            image = (ImageButton) v.findViewById(R.id.image);

            if(type.equals("c")){
                description = (TextView) v.findViewById(R.id.description);
                ratingBar=(RatingBar) v.findViewById(R.id.ratingBar);

            }
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
