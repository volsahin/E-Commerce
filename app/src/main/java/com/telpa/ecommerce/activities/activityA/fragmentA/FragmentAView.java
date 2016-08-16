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
import android.widget.TextView;
import android.widget.Toast;

import com.telpa.ecommerce.R;
import com.telpa.ecommerce.activities.ScreenFActivity;
import com.telpa.ecommerce.adapters.RecyclerAdapter;
import com.telpa.ecommerce.adapters.RecyclerAdapter_ABCG;
import com.telpa.ecommerce.models.Category;
import com.telpa.ecommerce.models.Product;
import com.telpa.ecommerce.utils.TabHelper;

import java.util.ArrayList;

/**
 * Created by Mert on 16.08.2016.
 */

public class FragmentAView extends TabHelper implements IFragmentAView {
    private IFragmentAPresenter fragmentAPresenter;
    private View view;
    private Category category;
    private Application application;


    @Override
    public void onCreate(@org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.application = getApplication();
        this.view = getView();
        this.category = getCategory();
        setTitle("Test");

        fragmentAPresenter = new FragmentAPresenter(this, application);
        fragmentAPresenter.loadView(category);
        fragmentAPresenter.getTopSubCategory(view);
        fragmentAPresenter.getSubCategories(view);

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
                Intent i = new Intent(getActivity(), ScreenFActivity.class);
                startActivity(i);
            }
        });
    }

    @Override
    public void setTopCategoryTitle(String title) {
        TextView subCategoryTop = (TextView) view.findViewById(R.id.featured);
        subCategoryTop.setText(title);
    }

    @Override
    public void setTopCategoryProducts(ArrayList<Product> products) {


    }

    @Override
    public void setOtherSubCategories(ArrayList<Category> subCategories) {

        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.recyclerViewA);
        recyclerView2.setHasFixedSize(true);
        StaggeredGridLayoutManager recyclerLayoutManager2 = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL);
        recyclerView2.setLayoutManager(recyclerLayoutManager2);
        recyclerView2.addItemDecoration(new RecyclerAdapter.SpaceItemDecoration(0));
        RecyclerAdapter_ABCG recyclerAdapter2 = new RecyclerAdapter_ABCG(getActivity(), subCategories.size(), R.layout.item_abcg, subCategories, "a",getApplication());
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
