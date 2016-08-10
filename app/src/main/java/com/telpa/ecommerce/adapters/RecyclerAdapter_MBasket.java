package com.telpa.ecommerce.adapters;

import android.app.Activity;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;
import com.telpa.ecommerce.R;
import com.telpa.ecommerce.models.BasketItem;
import com.telpa.ecommerce.models.Product;

import java.util.ArrayList;

import butterknife.OnClick;


/**
 * Created by volkan on 14.07.2016.
 */

public class RecyclerAdapter_MBasket extends RecyclerView.Adapter<RecyclerAdapter_MBasket.ViewHolder> {

    private int amountOfData;
    private int id;
    private ArrayList<BasketItem> basketItems;
    private Activity activity;

    public RecyclerAdapter_MBasket(Activity activity,int amountOfData, int id, ArrayList<BasketItem> basketItems) {
        this.amountOfData = amountOfData;
        this.id = id;
        this.basketItems = basketItems;
        this.activity=activity;
    }

    @Override
    public RecyclerAdapter_MBasket.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(id, parent, false);
        RecyclerAdapter_MBasket.ViewHolder viewHolder = new RecyclerAdapter_MBasket.ViewHolder(v);
        new SpaceItemDecoration(300);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        //TODO

        holder.productName.setText(basketItems.get(position).getProduct().getName());
        holder.price.setText(basketItems.get(position).getProduct().getPrice());
        holder.number.setText(basketItems.get(position).getNumber());
        Picasso.with(activity).load(basketItems.get(position).getProduct().getHighResImageUrls().get(0)).into(holder.image);
        // holder.productName.setText(products.get(position).getName());
        // holder.textView.setText("DATA - DATA "+position);
    }

    @Override
    public int getItemCount() {
        return amountOfData;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView productName;
        public TextView price;
        public TextView number;
        public ImageButton image;

        public ViewHolder(View v) {
            super(v);

            productName = (TextView) v.findViewById(R.id.basketProductName);
            price = (TextView) v.findViewById(R.id.basketPrice);
            number = (TextView) v.findViewById(R.id.basketNumber);
            image = (ImageButton) v.findViewById(R.id.basketImageButton);


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
