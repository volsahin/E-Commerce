package com.telpa.ecommerce.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.telpa.ecommerce.R;
import com.telpa.ecommerce.adapters.RecyclerAdapter;
import com.telpa.ecommerce.adapters.RecyclerAdapter_F;
import com.telpa.ecommerce.interfaces.IBasket;
import com.telpa.ecommerce.interfaces.ICategory;
import com.telpa.ecommerce.interfaces.IProduct;
import com.telpa.ecommerce.models.Product;
import com.telpa.ecommerce.utils.TabHelper;

import java.util.ArrayList;

import javax.inject.Inject;

/**
 * Created by volkan on 20.07.2016.
 */

public class FragmentFTab extends TabHelper {
    @Inject
    IBasket basket;
    @Inject
    IProduct product;
    @Inject
    ICategory category;

    private RecyclerView recyclerView;
    private RecyclerView.Adapter recyclerAdapter;
    private RecyclerView.LayoutManager recyclerLayoutManager;
    private ArrayList<Product> products;
    public TextView productName;
    public TextView price;
    public TextView description;
    public ImageView image;
    public RatingBar ratingBar;
    public ImageButton basketButton;
    public ImageButton likeButton;

    public FragmentFTab createTab(String title) {
        FragmentFTab tabOne = new FragmentFTab();
        tabOne.setTitle(title);
        ArrayList<String> url = new ArrayList<String>();
        url.add("url1");
        url.add("urls2");
        products = new ArrayList<Product>();
        Product a = new Product();
        a.setName("");
        a.setID(1);
        a.setCategoryID(1);
        a.setDescripton("");
        a.setHighResImageUrls(url);
        a.setLowResImageUrls(url);
        a.setPrice(30);
        a.setRating(2);
        a.setRating(3);
        products.add(a);


        return tabOne;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_f_tab1, container, false);

        recyclerView = (RecyclerView) v.findViewById(R.id.recyclerViewF);

        recyclerView.setHasFixedSize(true);

        /*
        recyclerLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(recyclerLayoutManager);
        */

        recyclerLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(recyclerLayoutManager);

        recyclerView.addItemDecoration(new RecyclerAdapter.SpaceItemDecoration(0));
        recyclerAdapter = new RecyclerAdapter_F(getActivity(),products.size(), R.layout.item_f, products,getApplication());
        recyclerView.setAdapter(recyclerAdapter);

        //TODO
        productName = (TextView) v.findViewById(R.id.productNameHeader);
        price = (TextView) v.findViewById(R.id.priceHeader);
        description = (TextView) v.findViewById(R.id.descriptionHeader);
        image = (ImageView) v.findViewById(R.id.imageViewHeader);
        basketButton = (ImageButton) v.findViewById(R.id.basketHeader);
        likeButton = (ImageButton) v.findViewById(R.id.likeHeader);
        ratingBar=(RatingBar) v.findViewById(R.id.ratingBarHeader);

        productName.setText("Name ");
        price.setText("$50");
        image.setImageResource(R.drawable.ic_circle_white);
        description.setText("Açıklama");
        //basketButton.setImageResource();
        likeButton.setImageResource(R.drawable.ic_favorite_red_24dp);
        ratingBar.setRating(5);


        return v;

    }


    //TODO
    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView productName;
        public TextView price;
        public TextView description;
        public ImageView image;
        public RatingBar ratingBar;
        public ImageButton basketButton;
        public ImageButton likeButton;

        public ViewHolder(View v) {
            super(v);
            productName = (TextView) v.findViewById(R.id.productNameHeader);
            price = (TextView) v.findViewById(R.id.priceHeader);
            description = (TextView) v.findViewById(R.id.descriptionHeader);
            image = (ImageView) v.findViewById(R.id.imageViewHeader);
            basketButton = (ImageButton) v.findViewById(R.id.basketHeader);
            likeButton = (ImageButton) v.findViewById(R.id.likeHeader);
            ratingBar=(RatingBar) v.findViewById(R.id.ratingBarHeader);
        }
    }


    public void onBindViewHolder(ViewHolder holder, int position) {

        //TODO

        holder.productName.setText("Name " + position);
        holder.price.setText("$50");
        holder.image.setImageResource(R.drawable.ic_circle_white);
        holder.description.setText("Açıklama");
        // holder.basketButton.setImageResource();
        holder.likeButton.setImageResource(R.drawable.ic_favorite_red_24dp);
        holder.ratingBar.setRating(5);

    }
}
