package com.telpa.ecommerce.adapters;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.telpa.ecommerce.R;
import com.telpa.ecommerce.models.IList;
import java.util.List;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.RatingBar;

/**
 * Created by Gizem İlgar on 19.7.2016.
 */
public class ScreenIListAdapter extends RecyclerView.Adapter<ScreenIListAdapter.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView productName;
        public TextView price;
        public ImageView image;
        public ImageView image2;
        public CardView card_view;
        public RatingBar star;
        public TextView description;


        public ViewHolder(View view) {
            super(view);

            card_view = (CardView) view.findViewById(R.id.card_view2);
            productName = (TextView) view.findViewById(R.id.productName);
            price = (TextView) view.findViewById(R.id.bigPrice);
            description = (TextView) view.findViewById(R.id.description);
            image = (ImageView) view.findViewById(R.id.image);
            image2 = (ImageView) view.findViewById(R.id.bigActionButton);
            star = (RatingBar) view.findViewById(R.id.ratingBar);


        }
    }

    List<IList> iList;

    public ScreenIListAdapter(List<IList> iList) {

        this.iList = iList;
    }

    @Override
    public ScreenIListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_i, parent, false);

        ViewHolder view_holder = new ViewHolder(v);
        return view_holder;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.productName.setText(iList.get(position).getProductName());
        holder.description.setText(iList.get(position).getDescription());
        holder.image.setImageResource(iList.get(position).getImage_id());
        holder.image2.setImageResource(iList.get(position).getImage2_id());
        holder.price.setText(iList.get(position).getPrice());


    }

    @Override
    public int getItemCount() {
        return iList.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}

