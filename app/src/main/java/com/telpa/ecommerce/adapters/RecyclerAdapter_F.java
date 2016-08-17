package com.telpa.ecommerce.adapters;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;
import com.telpa.ecommerce.ECommerceApp;
import com.telpa.ecommerce.R;
import com.telpa.ecommerce.activities.activityK.ScreenK;
import com.telpa.ecommerce.activities.activityM.ScreenM;
import com.telpa.ecommerce.interfaces.IProduct;
import com.telpa.ecommerce.models.Product;

import java.util.ArrayList;

import javax.inject.Inject;


/**
 * Created by volkan on 14.07.2016.
 */

public class RecyclerAdapter_F extends RecyclerView.Adapter<RecyclerAdapter_F.ViewHolder> {

    @Inject
    IProduct IProduct;
    private int amountOfData;
    private int id;
    private ArrayList<Product> products;
    private Activity activity;
    private Application application;

    public RecyclerAdapter_F( Activity activity,int amountOfData, int id, ArrayList<Product> products,  Application application) {
        this.amountOfData = amountOfData;
        this.id = id;
        this.products=products;
        this.activity=activity;
        this.application=application;
        ((ECommerceApp) application).getComponent().inject(this);

    }

    @Override
    public RecyclerAdapter_F.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(id, parent, false);

        RecyclerAdapter_F.ViewHolder viewHolder = new RecyclerAdapter_F.ViewHolder(v);
        new SpaceItemDecoration(300);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        final int pos = position;
        //TODO

        holder.productName.setText(products.get(position).getName());
        holder.price.setText("$"+products.get(position).getPrice());
        Picasso.with(activity).load(products.get(position).getHighResImageUrls().get(0)).into(holder.image);

        holder.likeButton.setImageResource(R.drawable.ic_favorite_white_24dp);



        if (IProduct.getFavorites(0).contains(products.get(position).getID())) {
            holder.likeButton.setImageResource(R.drawable.ic_favorite_red_24dp);
        }

        holder.likeButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (IProduct.getFavorites(0).contains(products.get(pos).getID())) {
                    holder.likeButton.setImageResource(R.drawable.ic_favorite_white_24dp);
                    IProduct.removeFavorites(0,products.get(pos).getID());
                }
                else{
                    holder.likeButton.setImageResource(R.drawable.ic_favorite_red_24dp);
                    IProduct.addFavorites(0,products.get(pos).getID());
                }
            }
        });



        holder.actionButton.setImageResource(R.drawable.ic_more_vert_white_24dp);
        holder.actionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               PopupMenu popup = new PopupMenu(activity, v);

                popup.getMenuInflater().inflate(R.menu.option_menu, popup.getMenu());

                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.item_Favorite:
                                Toast.makeText(activity, "Favorite", Toast.LENGTH_SHORT).show();
                                return true;
                            case R.id.item_AddBasket:
                                Intent intent2=new Intent();
                                intent2.setClass(activity, ScreenM.class);
                                activity.startActivity(intent2);
                                return true;
                            case R.id.item_Detail:
                                Intent intent3=new Intent();
                                intent3.setClass(activity,ScreenK.class);
                                activity.startActivity(intent3);
                                return true;
                        }
                        return true;
                    }

                });

                popup.show();

            }
       });



    }

    @Override
    public int getItemCount() {
        return amountOfData;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {


        public TextView productName;
        public TextView price;
        public ImageView image;
        public ImageButton basketButton;
        public ImageButton likeButton;
        public ImageButton actionButton;


        public ViewHolder(View v) {
            super(v);
            productName = (TextView) v.findViewById(R.id.productName);
            price = (TextView) v.findViewById(R.id.price);
            image = (ImageView) v.findViewById(R.id.imageView);
            basketButton = (ImageButton) v.findViewById(R.id.basketButton);
            likeButton = (ImageButton) v.findViewById(R.id.likeButton);
            actionButton = (ImageButton) v.findViewById(R.id.actionButton);




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
