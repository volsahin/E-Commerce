package com.telpa.ecommerce.adapters;

import android.app.Activity;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.telpa.ecommerce.R;
import com.telpa.ecommerce.activities.ScreenAActivity;
import com.telpa.ecommerce.fragment.FragmentFTab;
import com.telpa.ecommerce.fragment.FragmentGTab;
import com.telpa.ecommerce.models.Category;
import com.telpa.ecommerce.models.Product;

import java.util.ArrayList;


/**
 * Created by volkan on 14.07.2016.
 */

public class RecyclerAdapter_ABCG extends RecyclerView.Adapter<RecyclerAdapter_ABCG.ViewHolder> {

    private int amountOfData;
    private int id;
    private ArrayList<Category> categories;
    Activity activity;
    String type;


    public RecyclerAdapter_ABCG(Activity activity, int amountOfData, int id, ArrayList<Category> categories, String type) {
        this.amountOfData = amountOfData;
        this.id = id;
        this.categories=categories;
        this.activity=activity;
        this.type=type;
    }

    @Override
    public RecyclerAdapter_ABCG.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(id, parent, false);

        RecyclerAdapter_ABCG.ViewHolder viewHolder = new RecyclerAdapter_ABCG.ViewHolder(v);
        new SpaceItemDecoration(300);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
            holder.subcategory.setText("Alt kategori "+position);

    }

    @Override
    public int getItemCount() {
        return amountOfData;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView subcategory;
        public RecyclerView recyclerView2;
        public RecyclerView.Adapter recyclerAdapter2;
        public RecyclerView.LayoutManager recyclerLayoutManager2;
        public ArrayList<Product> products;

        public ViewHolder(View v) {
            super(v);
            final RecyclerAdapter_ABCG adapter=RecyclerAdapter_ABCG.this;
            Activity context=adapter.activity;
            String type=adapter.type;

            subcategory = (TextView) v.findViewById(R.id.subcategories);


            ArrayList<String> url=new ArrayList<String>();
            url.add("url1");
            url.add("urls2");
            products=new ArrayList<Product>();
            Product b=new Product();
            b.setName("");
            b.setID(1);
            b.setCategoryID(1);
            b.setDescripton("");
            b.setHighResImageUrls(url);
            b.setLowResImageUrls(url);
            b.setPrice(30);
            b.setRating(2);
            b.setRating(3);
            products.add(b);

            recyclerView2 = (RecyclerView) v.findViewById(R.id.recyclerViewABCGitem);

            recyclerView2.setHasFixedSize(true);

            recyclerLayoutManager2 = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
            recyclerView2.setLayoutManager(recyclerLayoutManager2);

            recyclerView2.addItemDecoration(new RecyclerAdapter.SpaceItemDecoration(12));

           if(type.equals("a") || type.equals("b")){
               recyclerAdapter2 = new RecyclerAdapter_ABGSmall(context,products.size(), R.layout.item_a_and_b_small, products,"a");
           }

            else if(type.equals("c")){
               recyclerLayoutManager2 = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL);
               recyclerView2.setLayoutManager(recyclerLayoutManager2);
               recyclerAdapter2 = new RecyclerAdapter_ABGSmall(context,products.size(), R.layout.item_i_and_c, products,"c");
           }

            else if(type.equals("g")){
               recyclerAdapter2 = new RecyclerAdapter_ABGSmall(context,products.size(), R.layout.item_g, products,"g");
           }

            recyclerView2.setAdapter(recyclerAdapter2);

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
