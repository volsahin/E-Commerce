package com.telpa.ecommerce.adapters;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RatingBar;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.telpa.ecommerce.R;
import com.telpa.ecommerce.activities.activityK.ScreenKActivity;
import com.telpa.ecommerce.models.Product;

import java.util.ArrayList;


/**
 * Created by volkan on 14.07.2016.
 */

public class RecyclerAdapter_ABCGSmall extends RecyclerView.Adapter<RecyclerAdapter_ABCGSmall.ViewHolder> {

    private int amountOfData;
    private int id;
    private ArrayList<Product> products;
    Activity activity;
    String type;

    public RecyclerAdapter_ABCGSmall(Activity activity, int amountOfData, int id, ArrayList<Product> products, String type) {
        this.amountOfData = amountOfData;
        this.id = id;
        this.products = products;
        this.activity = activity;
        this.type = type;

    }

    @Override
    public RecyclerAdapter_ABCGSmall.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(id, parent, false);

        RecyclerAdapter_ABCGSmall.ViewHolder viewHolder = new RecyclerAdapter_ABCGSmall.ViewHolder(v);
        new SpaceItemDecoration(300);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {

        holder.productName.setText(products.get(position).getName());
        holder.price.setText("$"+products.get(position).getPrice());
        Picasso.with(activity).load(products.get(position).getHighResImageUrls().get(0)).into(holder.image);
        if (type.equals("c")) {
            holder.description.setText(products.get(position).getDescripton());
            holder.ratingBar.setRating(products.get(position).getRating());

        }
        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(activity, ScreenKActivity.class);
                i.putExtra("product",products.get(position));
                activity.startActivity(i);
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
            final RecyclerAdapter_ABCGSmall adapter = RecyclerAdapter_ABCGSmall.this;
            String type = adapter.type;

            productName = (TextView) v.findViewById(R.id.productName);
            price = (TextView) v.findViewById(R.id.price);
            image = (ImageButton) v.findViewById(R.id.image);

            if (type.equals("c")) {
                description = (TextView) v.findViewById(R.id.description);
                ratingBar = (RatingBar) v.findViewById(R.id.ratingBar);

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
