package com.telpa.ecommerce.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.ImageView;

import com.telpa.ecommerce.R;
import com.telpa.ecommerce.models.HList;

import java.util.List;

/**
 * Created by Gizem İlgar on 15.7.2016.
 */
public class ScreenHListAdapter extends BaseAdapter {

    private LayoutInflater myInflater;
    private List<HList> hList;


    public ScreenHListAdapter(Activity activity, List<HList> lister) {
        myInflater = (LayoutInflater) activity.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);
        hList = lister;
    }

    @Override
    public int getCount() {
        return hList.size();
    }

    @Override
    public Object getItem(int i) {
        return hList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View satirView;
        satirView = myInflater.inflate(R.layout.screen_h_row, null);
        TextView textView = (TextView) satirView.findViewById(R.id.productName);
        TextView textView2 = (TextView) satirView.findViewById(R.id.category);
        ImageView imageView = (ImageView) satirView.findViewById(R.id.image);
        HList hList1 = hList.get(i);
        textView2.setText(hList1.getCategory());
        textView.setText((hList1.getProductName()));
        imageView.setImageResource(R.drawable.ic_photo_black_48dp);

        return satirView;
    }
}
