package com.telpa.ecommerce.activities.activityF.fragmentF;

import android.app.Application;
import android.content.Intent;
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

import com.squareup.picasso.Picasso;
import com.telpa.ecommerce.R;
import com.telpa.ecommerce.activities.ScreenFActivity;
import com.telpa.ecommerce.adapters.RecyclerAdapter;
import com.telpa.ecommerce.adapters.RecyclerAdapter_F;
import com.telpa.ecommerce.models.Category;
import com.telpa.ecommerce.models.Product;
import com.telpa.ecommerce.utils.TabHelper;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Gizem İlgar on 16.8.2016.
 */
public class FragmentFView extends TabHelper implements IFragmentFView {

    private IFragmentFPresenter fragmentFPresenter;
    private View view;
    private Category category;
    private Application application;

    public TextView productName;
    public TextView price;
    public TextView description;
    public ImageView image;
    public RatingBar ratingBar;
    public ImageButton basketButton;
    public ImageButton likeButton;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.application = getApplication();
        this.view = getView();
        this.category = getCategory();
        setTitle("Test");
        ButterKnife.bind(view);

        fragmentFPresenter = new FragmentFPresenter(this, application);
        fragmentFPresenter.loadView(category);
        fragmentFPresenter.getProduct(category);
        fragmentFPresenter.getTopProduct(category);

    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void viewAll() {
        view.findViewById(R.id.viewallTop).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), ScreenFActivity.class);
                startActivity(i);
            }
        });
    }

    @Override
    public void setTopProduct(Product product) {

        productName = (TextView) view.findViewById(R.id.productNameHeader);
        price = (TextView) view.findViewById(R.id.priceHeader);
        description = (TextView) view.findViewById(R.id.descriptionHeader);
        image = (ImageView) view.findViewById(R.id.imageViewHeader);
        basketButton = (ImageButton) view.findViewById(R.id.basketHeader);
        likeButton = (ImageButton) view.findViewById(R.id.likeHeader);
        ratingBar=(RatingBar) view.findViewById(R.id.ratingBarHeader);

        productName.setText(product.getName());
        price.setText("$"+product.getPrice());
        Picasso.with(getActivity()).load(product.getHighResImageUrls().get(0)).into(image);

        description.setText(product.getDescripton());
        //basketButton.setImageResource();
        likeButton.setImageResource(R.drawable.ic_favorite_red_24dp);
        ratingBar.setRating(product.getRating());
    }

    @Override
    public void setProducts(ArrayList<Product> products) {

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerViewF);
        recyclerView.setHasFixedSize(true);
        StaggeredGridLayoutManager recyclerLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(recyclerLayoutManager);
        recyclerView.addItemDecoration(new RecyclerAdapter.SpaceItemDecoration(0));
        RecyclerAdapter_F recyclerAdapter = new RecyclerAdapter_F(getActivity(), products.size(), R.layout.item_f, products);
        recyclerView.setAdapter(recyclerAdapter);
    }


    @Override
    public void goToProduct(int ProductID) {

    }

    @Override
    public void addFavorites(int ProductID) {

    }


    @OnClick({R.id.imageViewHeader, R.id.basketHeader, R.id.likeHeader, R.id.actionHeader})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imageViewHeader:
                break;
            case R.id.basketHeader:
                break;
            case R.id.likeHeader:
                break;
            case R.id.actionHeader:
                break;
        }
    }
}
