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
import com.telpa.ecommerce.activities.activityI.ScreenI;
import com.telpa.ecommerce.adapters.RecyclerAdapter;
import com.telpa.ecommerce.adapters.RecyclerAdapter_ABCG;
import com.telpa.ecommerce.adapters.RecyclerAdapter_BBig;
import com.telpa.ecommerce.models.Category;
import com.telpa.ecommerce.models.Product;
import com.telpa.ecommerce.utils.TabHelper;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by SAMSUNGNB on 12.08.2016.
 */
public class FragmentBView extends TabHelper implements IFragmentBView {
    @BindView(R.id.subcategories)
    TextView subcategories;
    @BindView(R.id.viewallTop)
    TextView viewallTop;
    @BindView(R.id.recyclerView1)
    RecyclerView recyclerView1;
    @BindView(R.id.recyclerView2)
    RecyclerView recyclerView2;
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


        subcategories = (TextView) view.findViewById(R.id.subcategories);
        viewallTop = (TextView) view.findViewById(R.id.viewallTop);
        recyclerView1 = (RecyclerView) view.findViewById(R.id.recyclerView1);
        recyclerView2 = (RecyclerView) view.findViewById(R.id.recyclerView2);

        fragmentBPresenter = new FragmentBPresenter(this, application);
        fragmentBPresenter.loadView(category);
        fragmentBPresenter.getTopSubCategory();
        fragmentBPresenter.getSubCategories();

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


        recyclerView1.setHasFixedSize(true);
        StaggeredGridLayoutManager recyclerLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recyclerView1.setLayoutManager(recyclerLayoutManager);
        recyclerView1.addItemDecoration(new RecyclerAdapter.SpaceItemDecoration(2));
        RecyclerAdapter_BBig recyclerAdapter;
        if (products.size() >= 2) {
            recyclerAdapter = new RecyclerAdapter_BBig(getActivity(), 2, R.layout.item_b_big, products, getApplication(), this);
        } else {
            recyclerAdapter = new RecyclerAdapter_BBig(getActivity(), products.size(), R.layout.item_b_big, products, getApplication(), this);
        }
        recyclerView1.setAdapter(recyclerAdapter);
    }

    @Override
    public void setOtherSubCategories(ArrayList<Category> subCategories) {


        recyclerView2.setHasFixedSize(true);
        StaggeredGridLayoutManager recyclerLayoutManager2 = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL);
        recyclerView2.setLayoutManager(recyclerLayoutManager2);
        recyclerView2.addItemDecoration(new RecyclerAdapter.SpaceItemDecoration(0));
        RecyclerAdapter_ABCG recyclerAdapter2 = new RecyclerAdapter_ABCG(getActivity(), subCategories.size(), R.layout.item_abcg, subCategories, "b", getApplication());
        recyclerView2.setAdapter(recyclerAdapter2);
    }

    @Override
    public void viewAll(final Category category) {
        viewallTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), ScreenI.class);
                i.putExtra("category", category);
                startActivity(i);
            }
        });
    }

    @Override
    public void addFavorites() {
        Toast.makeText(getActivity(), "Ürün favorilerinize eklendi!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void removeFavorites() {
        Toast.makeText(getActivity(), "Ürün favorilerinizden çıkarıldı!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void addBasketSuccess(int ProductID) {
        Toast.makeText(getActivity(), "Ürün sepetinize eklendi!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void addBasketFail(int ProductID) {
        Toast.makeText(getActivity(), "Ürün zaten sepetinizde bulunmaktadır!", Toast.LENGTH_SHORT).show();
    }


}
