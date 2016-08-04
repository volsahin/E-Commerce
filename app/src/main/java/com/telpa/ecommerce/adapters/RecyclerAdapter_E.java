package com.telpa.ecommerce.adapters;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.telpa.ecommerce.R;
import com.telpa.ecommerce.interfaces.Category;

import java.util.ArrayList;


/**
 * Created by volkan on 14.07.2016.
 */

public class RecyclerAdapter_E extends RecyclerView.Adapter<RecyclerAdapter_E.ViewHolder> {

    private int amountOfData;
    private int id;
    private ArrayList<Category> categories;

    public RecyclerAdapter_E(int amountOfData, int id, ArrayList<Category> categories) {
        this.amountOfData = amountOfData;
        this.id = id;
        this.categories=categories;
    }

    @Override
    public RecyclerAdapter_E.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(id, parent, false);

        RecyclerAdapter_E.ViewHolder viewHolder = new RecyclerAdapter_E.ViewHolder(v);
        new SpaceItemDecoration(300);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.category.setText("Category"+position);
        holder.productName.setText("Name " + position);
        holder.image.setImageResource(R.drawable.ic_circle_white);

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
            category = (TextView) v.findViewById(R.id.ustText);
            productName = (TextView) v.findViewById(R.id.productName);
            image = (ImageButton) v.findViewById(R.id.image);
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
