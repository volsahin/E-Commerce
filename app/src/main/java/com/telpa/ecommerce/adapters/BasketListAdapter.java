package com.telpa.ecommerce.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.telpa.ecommerce.R;
import com.telpa.ecommerce.models.BasketList;
import com.telpa.ecommerce.models.IList;

import java.util.List;

/**
 * Created by SAMSUNGNB on 19.07.2016.
 */
public class BasketListAdapter extends BaseAdapter {
    private LayoutInflater mInflater;
    private List<BasketList> list;


    public BasketListAdapter(Activity activity, List<BasketList> list) {
        mInflater = (LayoutInflater) activity.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View satirView;
        satirView = mInflater.inflate(R.layout.basket_row, null);
        TextView basketProductName = (TextView) satirView.findViewById(R.id.basketProductName);
        TextView textView2 = (TextView) satirView.findViewById(R.id.basketPrice);
        ImageView imageView = (ImageView) satirView.findViewById(R.id.basketImage);


        BasketList list = this.list.get(i);
        basketProductName.setText((list.getProductName()));
        textView2.setText((list.getPrice()));
        imageView.setImageResource(R.drawable.ic_photo_black_48dp);


        return satirView;
    }

}

