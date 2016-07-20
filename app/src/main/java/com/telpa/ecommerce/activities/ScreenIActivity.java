package com.telpa.ecommerce.activities;


import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.widget.ListView;
import com.telpa.ecommerce.R;
import com.telpa.ecommerce.adapters.ScreenHListAdapter;
import com.telpa.ecommerce.adapters.ScreenIListAdapter;
import com.telpa.ecommerce.models.HList;
import com.telpa.ecommerce.models.IList;
import com.telpa.ecommerce.utils.BaseActivity;

import java.util.ArrayList;
import java.util.List;

public class ScreenIActivity extends BaseActivity {

    private RecyclerView recycler_view;
    private List<IList> list;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_i);

        recycler_view = (RecyclerView)findViewById(R.id.recycler_view);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        layoutManager.scrollToPosition(0);

        recycler_view.setLayoutManager(layoutManager);

        List<IList> list = new ArrayList<IList>();
        fcreateTitle("Category");
        fcreateToolbar(this, true, false,R.id.toolbar);
        fcreateMenu(this, true);


        String string=getString(R.string.lorem);


        list.add(new IList("Product", "100$",string,R.drawable.photo,R.drawable.ic_more_vert_black_24dp));
        list.add(new IList("Product", "100$",string,R.drawable.photo,R.drawable.ic_more_vert_black_24dp));
        list.add(new IList("Product", "100$",string,R.drawable.photo,R.drawable.ic_more_vert_black_24dp));
        list.add(new IList("Product", "100$",string,R.drawable.photo,R.drawable.ic_more_vert_black_24dp));
        list.add(new IList("Product", "100$",string,R.drawable.photo,R.drawable.ic_more_vert_black_24dp));
        list.add(new IList("Product", "100$",string,R.drawable.photo,R.drawable.ic_more_vert_black_24dp));
        list.add(new IList("Product", "100$",string,R.drawable.photo,R.drawable.ic_more_vert_black_24dp));
        list.add(new IList("Product", "100$",string,R.drawable.photo,R.drawable.ic_more_vert_black_24dp));
        list.add(new IList("Product", "100$",string,R.drawable.photo,R.drawable.ic_more_vert_black_24dp));




        ScreenIListAdapter adapter_items = new ScreenIListAdapter(list);

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
