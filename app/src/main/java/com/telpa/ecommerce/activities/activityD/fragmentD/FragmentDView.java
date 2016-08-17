package com.telpa.ecommerce.activities.activityD.fragmentD;

import android.app.Application;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.telpa.ecommerce.R;
import com.telpa.ecommerce.activities.activityB.fragmentB.FragmentBPresenter;
import com.telpa.ecommerce.activities.activityB.fragmentB.IFragmentBPresenter;
import com.telpa.ecommerce.adapters.RecyclerAdapter;
import com.telpa.ecommerce.adapters.RecyclerAdapter_D;
import com.telpa.ecommerce.models.Category;
import com.telpa.ecommerce.models.Product;
import com.telpa.ecommerce.utils.TabHelper;

import java.util.ArrayList;


/**
 * Created by Mert on 16.08.2016.
 */
public class FragmentDView extends TabHelper implements IFragmentDView {


    private IFragmentDPresenter fragmentDPresenter;
    private View view;
    private Category category;
    private Application application;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.application = getApplication();
        this.view = getView();
        this.category = getCategory();
        setTitle("Mert");

        fragmentDPresenter = new FragmentDPresenter(this, application);
        fragmentDPresenter.getProducts(category.getID());

    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return view;
    }

    @Override
    public void onFail() {

    }

    @Override
    public void onSuccess() {

    }

    @Override
    public void goToProduct(int ProductID) {

    }

    @Override
    public void fillProducts(ArrayList<Product> products) {
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerViewD);

        recyclerView.setHasFixedSize(true);


        StaggeredGridLayoutManager recyclerLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(recyclerLayoutManager);


        recyclerView.addItemDecoration(new RecyclerAdapter.SpaceItemDecoration(2));

        RecyclerAdapter_D recyclerAdapter = new RecyclerAdapter_D(getActivity(), products.size(), R.layout.item_d, products);

        recyclerView.setAdapter(recyclerAdapter);
    }
}
