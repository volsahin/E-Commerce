package com.telpa.ecommerce.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.telpa.ecommerce.R;
import com.telpa.ecommerce.models.IList;

import java.util.List;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.RatingBar;
/**
 * Created by Gizem İlgar on 19.7.2016.
 */
public class ScreenIListAdapter extends BaseAdapter {
    private LayoutInflater mInflater;
    private List<IList> i_construction;


    public ScreenIListAdapter(Activity activity, List<IList> lister) {
        mInflater = (LayoutInflater) activity.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);
        i_construction = lister;
    }

    @Override
    public int getCount() {
        return i_construction.size();
    }

    @Override
    public Object getItem(int i) {
        return i_construction.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View satirView;
        satirView = mInflater.inflate(R.layout.item_i_row, null);
        TextView textView = (TextView) satirView.findViewById(R.id.productName);
        TextView textView2=(TextView) satirView.findViewById(R.id.bigPrice);
        TextView textView3=(TextView) satirView.findViewById(R.id.description);
        ImageView imageView = (ImageView) satirView.findViewById(R.id.image);
        ImageView imageView1=(ImageView) satirView.findViewById(R.id.bigActionButton);
        RatingBar ratingBar=(RatingBar) satirView.findViewById(R.id.ratingBar);
        IList i_construction1 = i_construction.get(i);
        textView.setText((i_construction1.getProductName()));
        textView2.setText((i_construction1.getPrice()));
        textView3.setText((i_construction1.getDescription()));
        imageView.setImageResource(R.drawable.ic_photo_black_48dp);
        imageView1.setImageResource(R.drawable.ic_more_vert_black_24dp);



        return satirView;
    }
}