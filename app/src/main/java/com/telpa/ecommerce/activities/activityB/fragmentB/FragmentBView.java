package com.telpa.ecommerce.activities.activityB.fragmentB;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.telpa.ecommerce.R;
import com.telpa.ecommerce.activities.activityF.ScreenF;
import com.telpa.ecommerce.adapters.RecyclerAdapter;
import com.telpa.ecommerce.adapters.RecyclerAdapter_ABCG;
import com.telpa.ecommerce.adapters.RecyclerAdapter_BBig;
import com.telpa.ecommerce.models.Category;
import com.telpa.ecommerce.models.Product;
import com.telpa.ecommerce.utils.TabHelper;

import java.util.ArrayList;

/**
 * Created by SAMSUNGNB on 12.08.2016.
 */
public class FragmentBView extends TabHelper implements IFragmentBView {
    private IFragmentBPresenter fragmentBPresenter;
    private View view;
    private Category category;
    private Application application;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.application = getApplication();
        this.view = getView();
        this.category = getCategory();
        setTitle("Test");

        fragmentBPresenter = new FragmentBPresenter(this, application);
        fragmentBPresenter.loadView(category);
        fragmentBPresenter.getTopSubCategory(view);
        fragmentBPresenter.getSubCategories(view);

    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
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
    public void setTopCategoryTitle(String title) {
        TextView subCategoryTop = (TextView) view.findViewById(R.id.subcategories);
        subCategoryTop.setText(title);
    }

    @Override
    public void setTopCategoryProducts(ArrayList<Product> products) {

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView1);
        recyclerView.setHasFixedSize(true);
        StaggeredGridLayoutManager recyclerLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(recyclerLayoutManager);
        recyclerView.addItemDecoration(new RecyclerAdapter.SpaceItemDecoration(2));
        RecyclerAdapter_BBig recyclerAdapter;
        if (products.size() >= 2) {
            recyclerAdapter = new RecyclerAdapter_BBig(getActivity(), 2, R.layout.item_b_big, products,getApplication());
        } else {
            recyclerAdapter = new RecyclerAdapter_BBig(getActivity(), products.size(), R.layout.item_b_big, products,getApplication());
        }
        recyclerView.setAdapter(recyclerAdapter);
    }

    @Override
    public void setOtherSubCategories(ArrayList<Category> subCategories) {

        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.recyclerView2);
        recyclerView2.setHasFixedSize(true);
        StaggeredGridLayoutManager recyclerLayoutManager2 = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL);
        recyclerView2.setLayoutManager(recyclerLayoutManager2);
        recyclerView2.addItemDecoration(new RecyclerAdapter.SpaceItemDecoration(0));
        RecyclerAdapter_ABCG recyclerAdapter2 = new RecyclerAdapter_ABCG(getActivity(), subCategories.size(), R.layout.item_abcg, subCategories, "b",getApplication());
        recyclerView2.setAdapter(recyclerAdapter2);
    }

    @Override
    public void goToProduct(int ProductID) {

    }

    @Override
    public void addFavorites(int ProductID) {

    }

    @Override
    public void onFail() {
        Toast.makeText(getActivity(), "Connection failed!", Toast.LENGTH_SHORT).show();
    }

    //TODO bu methodu sil
    @Override
    public void onSuccess() {
        Toast.makeText(getActivity(), "Başarılı", Toast.LENGTH_SHORT).show();
    }


}
