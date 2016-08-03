package com.telpa.ecommerce.adapters;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RatingBar;
import android.widget.TextView;

import com.telpa.ecommerce.R;
import com.telpa.ecommerce.interfaces.Comment;

import java.util.ArrayList;


/**
 * Created by volkan on 14.07.2016.
 */

public class RecyclerAdapter_KLComment extends RecyclerView.Adapter<RecyclerAdapter_KLComment.ViewHolder> {

    private int amountOfData;
    private int id;
    private ArrayList<Comment> comments;

    public RecyclerAdapter_KLComment(int amountOfData, int id, ArrayList<Comment> comments) {
        this.amountOfData = amountOfData;
        this.id = id;
        this.comments=comments;
    }

    @Override
    public RecyclerAdapter_KLComment.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(id, parent, false);

        RecyclerAdapter_KLComment.ViewHolder viewHolder = new RecyclerAdapter_KLComment.ViewHolder(v);
        new SpaceItemDecoration(300);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        //TODO

        holder.username.setText("User " + position);
        holder.description.setText("Lorem ipsum....");
        holder.time.setText("" + position+" hours ago");
        holder.ratingBar.setRating(2);
        // holder.textView.setText("DATA - DATA "+position);
    }

    @Override
    public int getItemCount() {
        return amountOfData;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView username;
        public TextView description;
        public TextView time;
        public RatingBar ratingBar;

        public ViewHolder(View v) {
            super(v);
            username = (TextView) v.findViewById(R.id.username);
            description = (TextView) v.findViewById(R.id.description);
            time = (TextView) v.findViewById(R.id.time);
            ratingBar = (RatingBar) v.findViewById(R.id.ratingBar);
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
