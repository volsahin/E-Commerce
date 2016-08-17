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
import com.telpa.ecommerce.activities.activityM.IScreenMView;
import com.telpa.ecommerce.interfaces.IBasket;
import com.telpa.ecommerce.models.BasketItem;

import java.util.ArrayList;

import javax.inject.Inject;


/**
 * Created by volkan on 14.07.2016.
 */

public class RecyclerAdapter_MBasket extends RecyclerView.Adapter<RecyclerAdapter_MBasket.ViewHolder> {
    @Inject
    IBasket basket;
IScreenMView screenMView;
    private int amountOfData;
    private int id;
    private ArrayList<BasketItem> basketItems;
    private Activity activity;


    public RecyclerAdapter_MBasket(Activity activity, int amountOfData, int id, ArrayList<BasketItem> basketItems,IScreenMView v) {
        this.amountOfData = amountOfData;
        this.id = id;
        this.basketItems = basketItems;
        this.activity = activity;
        screenMView=v;
    }

    @Override
    public RecyclerAdapter_MBasket.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(id, parent, false);
        RecyclerAdapter_MBasket.ViewHolder viewHolder = new RecyclerAdapter_MBasket.ViewHolder(v);
        new SpaceItemDecoration(300);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {

        //TODO
        final ViewHolder viewHolder=holder;
        holder.productName.setText(basketItems.get(position).getProduct().getName());
        holder.price.setText("" + basketItems.get(position).getProduct().getPrice());
        holder.number.setText("" + basketItems.get(position).getNumber());
        Picasso.with(activity).load(basketItems.get(position).getProduct().getHighResImageUrls().get(0)).into(holder.image);
        holder.up.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                viewHolder.number.setText("" + (basketItems.get(position).getNumber()+1));
                basketItems.get(position).setNumber(basketItems.get(position).getNumber()+1);
                screenMView.itemUp(basketItems.get(position).getProduct().getPrice());
            }
        });

        holder.down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(basketItems.get(position).getNumber()>0) {
                    viewHolder.number.setText("" + (basketItems.get(position).getNumber()-1));
                    basketItems.get(position).setNumber(basketItems.get(position).getNumber() - 1);
                    screenMView.itemDown(basketItems.get(position).getProduct().getPrice());
                }
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
        public TextView number;
        public ImageButton image;
        public ImageButton up;
        public ImageButton down;


        public ViewHolder(View v) {
            super(v);

            productName = (TextView) v.findViewById(R.id.basketProductName);
            price = (TextView) v.findViewById(R.id.basketPrice);
            number = (TextView) v.findViewById(R.id.basketNumber);
            image = (ImageButton) v.findViewById(R.id.basketImageButton);
            up = (ImageButton) v.findViewById(R.id.basketArrowUp);
            down = (ImageButton) v.findViewById(R.id.basketArrowDown);
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
