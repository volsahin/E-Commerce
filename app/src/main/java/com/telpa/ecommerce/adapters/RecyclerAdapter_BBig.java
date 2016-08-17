package com.telpa.ecommerce.adapters;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
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
import com.telpa.ecommerce.activities.activityB.fragmentB.FragmentBView;
import com.telpa.ecommerce.activities.activityM.ScreenM;
import com.telpa.ecommerce.interfaces.IBasket;
import com.telpa.ecommerce.interfaces.IProduct;
import com.telpa.ecommerce.models.BasketItem;
import com.telpa.ecommerce.models.Product;

import org.w3c.dom.Text;

import java.util.ArrayList;

import javax.inject.Inject;


/**
 * Created by volkan on 14.07.2016.
 */

public class RecyclerAdapter_BBig extends RecyclerView.Adapter<RecyclerAdapter_BBig.ViewHolder> {
    @Inject
    IProduct IProduct;
    @Inject
    IBasket basket;
    private int amountOfData;
    private int id;
    private ArrayList<Product> products;
    private Activity activity;
    private int customerID;
    private Application application;
    private FragmentBView view;

    public RecyclerAdapter_BBig(Activity activity, int amountOfData, int id, ArrayList<Product> products, Application application, FragmentBView fragmentBView) {
        this.amountOfData = amountOfData;
        this.id = id;
        this.products = products;
        this.activity = activity;
        this.application = application;
        customerID = 0;
        view=fragmentBView;
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
    public void onBindViewHolder(final ViewHolder holder, int position) {
        final int pos = position;

        holder.bigProductName.setText(products.get(position).getName());
        holder.bigPrice.setText("$" + products.get(position).getPrice());
        holder.description.setText(products.get(position).getDescripton());
        Picasso.with(activity).load(products.get(position).getHighResImageUrls().get(0)).into(holder.bigImage);


        if (IProduct.getFavorites(customerID).contains(products.get(position).getID())) {
            holder.likeButton.setImageResource(R.drawable.ic_favorite_red_24dp);
        }

        holder.likeButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (IProduct.getFavorites(customerID).contains(products.get(pos).getID())) {
                    holder.likeButton.setImageResource(R.drawable.ic_favorite_darkgrey_24dp);
                    IProduct.removeFavorites(customerID, products.get(pos).getID());
                } else {
                    holder.likeButton.setImageResource(R.drawable.ic_favorite_red_24dp);
                    IProduct.addFavorites(customerID, products.get(pos).getID());
                }
            }
        });

        holder.bigBasketButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isInBasket(products.get(pos))) {
                    BasketItem basketItem = new BasketItem();
                    basketItem.setProduct(products.get(pos));
                    basketItem.setNumber(1);
                    basketItem.setVariant1(1);
                    basketItem.setVariant2(1);
                    basket.addBasket(customerID, basketItem);
                    view.addBasketSuccess(products.get(pos).getID());
                    Intent i=new Intent(activity, ScreenM.class);
                    activity.startActivity(i);
                }
                else
                    view.addBasketFail(products.get(pos).getID());
            }
        });

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

    public boolean isInBasket(Product product) {
        ArrayList<BasketItem> basketItems = basket.getBasket(customerID);
        ArrayList<Product> products = new ArrayList<>();
        for (BasketItem i : basketItems)
            products.add(i.getProduct());
        if (products.contains(product))
            return true;
        else
            return false;
    }

}
