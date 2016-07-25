package com.telpa.ecommerce.adapters;


import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;
import com.telpa.ecommerce.R;
import com.telpa.ecommerce.models.HList;

import java.util.List;

/**
 * Created by Gizem İlgar on 15.7.2016.
 */
public class ScreenHListAdapter extends RecyclerView.Adapter<ScreenHListAdapter.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView productName;
        public TextView category;
        public ImageView image;
        public ImageView image2;
        public CardView card_view;



        public ViewHolder(View view) {
            super(view);

            card_view = (CardView) view.findViewById(R.id.card_view2);
            productName = (TextView) view.findViewById(R.id.productName);
            category = (TextView) view.findViewById(R.id.category);
            image = (ImageView) view.findViewById(R.id.image);
            image2 = (ImageView) view.findViewById(R.id.actionButton);

        }
    }

    List<HList> hList;
    public ScreenHListAdapter(List<HList> hList) {

        this.hList = hList;
    }

    @Override
    public ScreenHListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_h, parent, false);

        ViewHolder view_holder = new ViewHolder(v);
        return view_holder;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.productName.setText(hList.get(position).getProductName());
        holder.category.setText(hList.get(position).getCategory());
        holder.image.setImageResource(hList.get(position).getImage_id());


    }

    @Override
    public int getItemCount() {
        return hList.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }


}

