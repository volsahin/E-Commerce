package com.telpa.ecommerce.adapters;

import android.app.Activity;
import android.app.Application;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.telpa.ecommerce.ECommerceApp;
import com.telpa.ecommerce.R;
import com.telpa.ecommerce.interfaces.IProduct;
import com.telpa.ecommerce.models.Product;

import java.util.ArrayList;

import javax.inject.Inject;


/**
 * Created by volkan on 14.07.2016.
 */

public class RecyclerAdapter_BBig extends RecyclerView.Adapter<RecyclerAdapter_BBig.ViewHolder> {
    @Inject
    IProduct IProduct;
    private int amountOfData;
    private int id;
    private ArrayList<Product> products;
    private Activity activity;
    private Application application;

    public RecyclerAdapter_BBig(Activity activity, int amountOfData, int id, ArrayList<Product> products, Application application) {
        this.amountOfData = amountOfData;
        this.id = id;
        this.products = products;
        this.activity = activity;
        this.application = application;
        ((ECommerceApp) application).getComponent().inject(this);
    }


    @Override
    public RecyclerAdapter_BBig.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(id, parent, false);

        RecyclerAdapter_BBig.ViewHolder viewHolder = new RecyclerAdapter_BBig.ViewHolder(v);
        new SpaceItemDecoration(300);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        //holder.bigImageButton.setImageResource();
        holder.bigProductName.setText(products.get(position).getName());
        holder.bigPrice.setText("$" + products.get(position).getPrice());
        holder.description.setText(products.get(position).getDescripton());
        Picasso.with(activity).load(products.get(position).getHighResImageUrls().get(0)).into(holder.bigImage);

        // holder.bigBasketButton.setImageResource();
//        if (IProduct.getFavorites(0).contains(products.get(position))) {
//            holder.likeButton.setImageResource(R.drawable.ic_favorite_red_24dp);
//        }

    }

    @Override
    public int getItemCount() {
        return amountOfData;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageButton bigImage;
        public TextView bigProductName;
        public TextView description;
        public TextView bigPrice;
        public ImageButton bigBasketButton;
        public ImageButton likeButton;

        public ViewHolder(View v) {
            super(v);
            bigImage = (ImageButton) v.findViewById(R.id.bigImage);
            bigProductName = (TextView) v.findViewById(R.id.bigProductName);
            description = (TextView) v.findViewById(R.id.description);
            bigPrice = (TextView) v.findViewById(R.id.bigPrice);
            bigBasketButton = (ImageButton) v.findViewById(R.id.bigBasketButton);
            likeButton = (ImageButton) v.findViewById(R.id.likeButton);

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
