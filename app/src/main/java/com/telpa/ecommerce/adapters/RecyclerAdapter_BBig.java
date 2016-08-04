package com.telpa.ecommerce.adapters;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.telpa.ecommerce.R;
import com.telpa.ecommerce.models.Product;

import org.w3c.dom.Text;

import java.util.ArrayList;


/**
 * Created by volkan on 14.07.2016.
 */

public class RecyclerAdapter_BBig extends RecyclerView.Adapter<RecyclerAdapter_BBig.ViewHolder> {

    private int amountOfData;
    private int id;
    private ArrayList<Product> products;

    public RecyclerAdapter_BBig(int amountOfData, int id,ArrayList<Product> products) {
        this.amountOfData = amountOfData;
        this.id = id;
        this.products=products;
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
        holder.bigImageButton.setImageResource(R.drawable.ic_favorite_red_24dp);
        holder.bigProductName.setText("Name "+position);
        // holder.textView.setText("DATA - DATA "+position);
    }

    @Override
    public int getItemCount() {
        return amountOfData;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageButton bigImageButton;
        public TextView bigProductName;
        public TextView description;
        public TextView bigPrice;
        public ImageButton bigBasketButton;
        public ImageButton likeButton;

        public ViewHolder(View v) {
            super(v);
            bigImageButton = (ImageButton) v.findViewById(R.id.bigImageButton);
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
