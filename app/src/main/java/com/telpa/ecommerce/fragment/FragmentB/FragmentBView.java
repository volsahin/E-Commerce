package com.telpa.ecommerce.fragment.FragmentB;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.telpa.ecommerce.R;
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
public class FragmentBView extends TabHelper implements IFragmentBView  {
    private IFragmentBPresenter fragmentBPresenter;
    private View view;
    private int categoryID;

    public FragmentBView createTab(Category category) {  //, ArrayList<Product> products
        FragmentBView tab = new FragmentBView();
        fragmentBPresenter=new FragmentBPresenter();
        tab.setTitle(category.getName());
        this.categoryID=category.getID();
        fragmentBPresenter.loadView(this.categoryID);
        return tab;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_b_tab1, container, false);



        return view;
    }

    @Override
    public void viewAll(int subCategoryID) {

    }

    @Override
    public void setTopCategoryTitle(String title) {
        TextView subCategoryTop= (TextView) view.findViewById(R.id.subcategories);
        subCategoryTop.setText(title);
    }

    @Override
    public void setTopCategoryProducts(ArrayList<Product> products) {


        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView1);
        recyclerView.setHasFixedSize(true);
        StaggeredGridLayoutManager recyclerLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(recyclerLayoutManager);
        recyclerView.addItemDecoration(new RecyclerAdapter.SpaceItemDecoration(2));
        RecyclerAdapter_BBig recyclerAdapter = new RecyclerAdapter_BBig(getActivity(), products.size(), R.layout.item_b_big, products);
        recyclerView.setAdapter(recyclerAdapter);
    }

    @Override
    public void setOtherSubCategories(ArrayList<Category> subCategories) {
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.recyclerView2);
        recyclerView2.setHasFixedSize(true);
        StaggeredGridLayoutManager recyclerLayoutManager2 = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL);
        recyclerView2.setLayoutManager(recyclerLayoutManager2);
        recyclerView2.addItemDecoration(new RecyclerAdapter.SpaceItemDecoration(0));
        RecyclerAdapter_ABCG recyclerAdapter2 = new RecyclerAdapter_ABCG(getActivity(), subCategories.size(), R.layout.item_abcg, subCategories, "b");
        recyclerView2.setAdapter(recyclerAdapter2);
    }

    @Override
    public void goToProduct(int ProductID) {

    }

    @Override
    public void addFavorites(int ProductID) {

    }
}
