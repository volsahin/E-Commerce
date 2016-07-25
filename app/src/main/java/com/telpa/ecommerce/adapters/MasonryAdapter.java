package com.telpa.ecommerce.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.telpa.ecommerce.R;
import com.telpa.ecommerce.fragment.FragmentDTab;
import com.telpa.ecommerce.fragment.FragmentGTab;

/**
 * Created by Gizem İlgar on 25.7.2016.
 */
public class MasonryAdapter extends RecyclerView.Adapter<MasonryAdapter.MasonryView> {

    private FragmentDTab fragmentDTab;

    int[] imgList = {R.drawable.photo2, R.drawable.photo1, R.drawable.photo2, R.drawable.photo1,
            R.drawable.photo1, R.drawable.photo2, R.drawable.photo1, R.drawable.photo1,
            R.drawable.photo1, R.drawable.photo1};

    String[] ProducenameList = {"Product", "Product", "Product", "Product", "Product", "Product",
            "Product", "Product", "Product", "Product"};
    String[] PriceList = {"$100", "$100", "$100", "$100", "$100", "$100",
            "$100", "$100", "$100", "$100"};

    public MasonryAdapter(FragmentDTab fragmentDTab) {
        this.fragmentDTab=fragmentDTab;
    }


    @Override
    public MasonryView onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_d, parent, false);
        MasonryView masonryView = new MasonryView(layoutView);
        return masonryView;
    }

    @Override
    public void onBindViewHolder(MasonryView holder, int position) {
        holder.image.setImageResource(imgList[position]);
        holder.produceName.setText(ProducenameList[position]);
        holder.price.setText(PriceList[position]);
    }

    @Override
    public int getItemCount() {
        return ProducenameList.length;
    }

    class MasonryView extends RecyclerView.ViewHolder {
        ImageView image;
        TextView produceName;
        TextView price;

        public MasonryView(View item) {
            super(item);

            image = (ImageView) itemView.findViewById(R.id.image);
            produceName = (TextView) itemView.findViewById(R.id.productName);
            price = (TextView) itemView.findViewById(R.id.price);

        }
    }
}
