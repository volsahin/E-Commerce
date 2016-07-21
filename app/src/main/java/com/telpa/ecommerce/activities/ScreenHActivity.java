package com.telpa.ecommerce.activities;

import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.widget.ListView;

import com.telpa.ecommerce.R;
import com.telpa.ecommerce.models.HList;
import com.telpa.ecommerce.adapters.ScreenHListAdapter;
import com.telpa.ecommerce.utils.BaseActivity;

import java.util.ArrayList;
import java.util.List;

public class ScreenHActivity extends BaseActivity {

    private RecyclerView recycler_view;
    private List<HList> list;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_h);

        recycler_view = (RecyclerView)findViewById(R.id.recycler_view);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        layoutManager.scrollToPosition(0);

        recycler_view.setLayoutManager(layoutManager);

         List<HList> list = new ArrayList<HList>();
        fcreateTitle("Categories");
        fcreateToolbar(this,false,  true, true,R.id.toolbarHnoTab);
        fcreateMenu(this, true);

        list.add(new HList("Category", "3 Product",R.drawable.photo1));
        list.add(new HList("Category", "9 Product",R.drawable.photo1));
        list.add(new HList("Category", "7 Product",R.drawable.photo1));
        list.add(new HList("Category", "35 Product",R.drawable.photo1));
        list.add(new HList("Category", "16 Product",R.drawable.photo1));
        list.add(new HList("Category", "13 Product",R.drawable.photo1));
        list.add(new HList("Category", "59 Product",R.drawable.photo1));
        list.add(new HList("Category", "27 Product",R.drawable.photo1));
        list.add(new HList("Category", "35 Product",R.drawable.photo1));
        list.add(new HList("Category", "16 Product",R.drawable.photo1));

        ScreenHListAdapter adapter_items = new ScreenHListAdapter(list);

        recycler_view.setHasFixedSize(true);

        recycler_view.setAdapter(adapter_items);

        recycler_view.setItemAnimator(new DefaultItemAnimator());

        recycler_view.addOnItemTouchListener(new RecyclerView.OnItemTouchListener() {

            @Override
            public void onTouchEvent(RecyclerView recycler, MotionEvent event) {

            }

            @Override
            public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

            }

            @Override
            public boolean onInterceptTouchEvent(RecyclerView recycler, MotionEvent event) {
                return false;
            }
        });



    }
}
