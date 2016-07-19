package com.telpa.ecommerce.adapters;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.telpa.ecommerce.R;


/**
 * Created by volkan on 14.07.2016.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

   // private String[] dataset;
    private int amountOfData;
    private int id;

    public RecyclerAdapter(int amountOfData, int id) {
        this.amountOfData = amountOfData;
        this.id = id;
    }

    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(id, parent, false);

        RecyclerAdapter.ViewHolder viewHolder = new RecyclerAdapter.ViewHolder(v);
        new SpaceItemDecoration(300);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        // holder.textView.setText("DATA - DATA "+position);
    }

    @Override
    public int getItemCount() {
        return amountOfData;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView textView;

        public ViewHolder(View v) {
            super(v);
            textView = (TextView) v.findViewById(R.id.price);
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
