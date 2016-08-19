package com.telpa.ecommerce.activities.activityA.fragmentA;

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
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;
import com.telpa.ecommerce.R;
import com.telpa.ecommerce.activities.activityF.ScreenF;
import com.telpa.ecommerce.activities.activityK.ScreenK;
import com.telpa.ecommerce.activities.activityM.ScreenM;
import com.telpa.ecommerce.adapters.RecyclerAdapter;
import com.telpa.ecommerce.adapters.RecyclerAdapter_ABCG;
import com.telpa.ecommerce.models.BasketItem;
import com.telpa.ecommerce.models.Category;
import com.telpa.ecommerce.models.Product;
import com.telpa.ecommerce.utils.TabHelper;

import java.util.ArrayList;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Mert on 16.08.2016.
 */

public class FragmentAView extends TabHelper implements IFragmentAView {


    private IFragmentAPresenter fragmentAPresenter;
    private View view;
    private Category category;
    private Application application;
    private Product featuredProduct;
    private int customerID;

    private ImageButton bigImage;
    private TextView bigPrice;
    private TextView bigDescription;
    private RatingBar bigRatingBar;
    private ImageButton bigActionButton;
    private ImageButton bigLikeButton;
    private ImageButton bigBasketButton;
    private TextView bigProductName;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.application = getApplication();
        this.view = getView();
        this.category = getCategory();
        customerID=0;
        viewInitializer();
        fragmentAPresenter.getTopProduct(category,view);
        fragmentAPresenter.getSubCategories(view);
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
                Intent i = new Intent(getActivity(), ScreenF.class);
                startActivity(i);
            }
        });
    }

    @Override
    public void setTopCategoryProduct(String name, int price, String description, float rating, String url,Product product) {
        featuredProduct=product;
        bigProductName.setText(name);
        bigPrice.setText(Integer.toString(price));
        bigDescription.setText(description);
        bigRatingBar.setRating(rating);
        Picasso.with(getActivity()).load(url).into(bigImage);
    }

    @Override
    public void setOtherSubCategories(ArrayList<Category> subCategories) {

        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.recyclerViewA);
        recyclerView2.setHasFixedSize(true);
        StaggeredGridLayoutManager recyclerLayoutManager2 = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL);
        recyclerView2.setLayoutManager(recyclerLayoutManager2);
        recyclerView2.addItemDecoration(new RecyclerAdapter.SpaceItemDecoration(0));
        RecyclerAdapter_ABCG recyclerAdapter2 = new RecyclerAdapter_ABCG(getActivity(), subCategories.size(), R.layout.item_abcg, subCategories, "a", getApplication());
        recyclerView2.setAdapter(recyclerAdapter2);
    }

    @Override
    public void goToProduct(int ProductID) {

    }

    @Override
    public void addFavorites(int ProductID) {

    }



    @OnClick({R.id.bigImage, R.id.bigActionButton, R.id.likeButton, R.id.bigBasketButton})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bigImage:
                Intent i=new Intent(getActivity(), ScreenK.class);
                i.putExtra("product", featuredProduct);
                startActivity(i);
                break;
            case R.id.bigActionButton:
                break;
            case R.id.likeButton:
                if (fragmentAPresenter.getFavorites(customerID).contains(featuredProduct.getID())) {
                    bigLikeButton.setImageResource(R.drawable.ic_favorite_darkgrey_24dp);
                    fragmentAPresenter.removeFavorites(customerID, featuredProduct.getID());
                } else {
                   bigLikeButton.setImageResource(R.drawable.ic_favorite_red_24dp);
                    fragmentAPresenter.addFavorites(customerID,featuredProduct.getID());
                }
                break;
            case R.id.bigBasketButton:
                if (!fragmentAPresenter.isInBasket(featuredProduct.getID())) {
                    BasketItem basketItem = new BasketItem();
                    basketItem.setProduct(featuredProduct);
                    basketItem.setNumber(1);
                    basketItem.setVariant1(1);
                    basketItem.setVariant2(1);
                    fragmentAPresenter.addBasket(customerID, basketItem);
                    Toast.makeText(getActivity(), "Ürün sepete eklendi!", Toast.LENGTH_SHORT).show();
                    Intent k=new Intent(getActivity(), ScreenM.class);
                    startActivity(k);
                }
                else
                    Toast.makeText(getActivity(), "Ürün zaten sepetinizde!", Toast.LENGTH_SHORT).show();
                break;
        }
    }
    @Override
    public void viewInitializer() {
        bigImage=(ImageButton) view.findViewById(R.id.bigImage);
        bigPrice=(TextView) view.findViewById(R.id.bigPrice);
        bigDescription= (TextView) view.findViewById(R.id.description);
        bigRatingBar= (RatingBar) view.findViewById(R.id.ratingBar);
        bigActionButton= (ImageButton) view.findViewById(R.id.bigActionButton);
        bigLikeButton= (ImageButton) view.findViewById(R.id.likeButton);
        bigBasketButton= (ImageButton) view.findViewById(R.id.bigBasketButton);
        bigProductName= (TextView) view.findViewById(R.id.bigProductName);

        fragmentAPresenter = new FragmentAPresenter(this, application);
    }

}
