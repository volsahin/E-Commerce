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
import com.telpa.ecommerce.StandartList;

import java.util.List;

/**
 * Created by Gizem İlgar on 15.7.2016.
 */
public class ListHAdapter extends BaseAdapter{

    private LayoutInflater myInflater;
    private List<StandartList> standartList;


    public ListHAdapter (Activity activity,List<StandartList> lister){
        myInflater = (LayoutInflater) activity.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);
        standartList = lister;
    }

    @Override
    public int getCount() {
        return standartList.size();
    }

    @Override
    public Object getItem(int i) {
        return standartList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View satirView;
        satirView = myInflater.inflate(R.layout.category_h, null);
        TextView textView = (TextView) satirView.findViewById(R.id.productName );
        TextView textView2 = (TextView) satirView.findViewById(R.id.category );
        ImageView imageView = (ImageView) satirView.findViewById(R.id.image);
        StandartList standartList1=standartList.get(i);
        textView2.setText(standartList1.getCategory());
        textView.setText((standartList1.getProductName()));
        imageView.setImageResource(R.drawable.ic_photo_black_48dp);

        return satirView;
    }
}
