package com.telpa.ecommerce.activities;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.melnykov.fab.FloatingActionButton;
import com.telpa.ecommerce.ECommerceApp;
import com.telpa.ecommerce.network.People;
import com.telpa.ecommerce.R;
import com.telpa.ecommerce.adapters.RecyclerAdapter;
import com.telpa.ecommerce.helper.RadioButtonHelper;
import com.telpa.ecommerce.network.APIService;
import com.telpa.ecommerce.utils.BaseActivity;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class ScreenLActivity extends BaseActivity {

    @Inject
    APIService service;


    @BindView(R.id.searchButton)
    ImageButton searchButton;
    @BindView(R.id.basketButton)
    ImageButton basketButton;
    @BindView(R.id.title)
    TextView title;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.fab)
    FloatingActionButton fab;
    /*   @BindView(R.id.bigImage)
       ImageButton bigImage;
       @BindView(R.id.image1)
       ImageButton image1;
       @BindView(R.id.image2)
       ImageButton image2;
       @BindView(R.id.image3)
       ImageButton image3;
       @BindView(R.id.image4)
       ImageButton image4;
       @BindView(R.id.image5)
       ImageButton image5;*/
    @BindView(R.id.ratingBar)
    RatingBar ratingBar;
    @BindView(R.id.reviews)
    TextView reviews;
    @BindView(R.id.Radio1)
    RadioButton Ia;
    @BindView(R.id.a)
    TextView a;
    @BindView(R.id.Radio2)
    RadioButton Ib;
    @BindView(R.id.b)
    TextView b;
    @BindView(R.id.Radio3)
    RadioButton Ic;
    @BindView(R.id.c)
    TextView c;
    @BindView(R.id.Radio4)
    RadioButton Id;
    @BindView(R.id.d)
    TextView d;
    @BindView(R.id.Radio5)
    RadioButton Ie;
    @BindView(R.id.e)
    TextView e;
    @BindView(R.id.productRadio1)
    RadioButton check1;
    @BindView(R.id.productRadio2)
    RadioButton check2;
    @BindView(R.id.productRadio3)
    RadioButton check3;
    @BindView(R.id.productRadio4)
    RadioButton check4;

    private RecyclerView recyclerView;
    private RecyclerView recyclerViewPopUp;
    private RecyclerView.Adapter recyclerAdapter;
    private RecyclerView.LayoutManager recyclerLayoutManager;
    private RecyclerView.LayoutManager recyclerLayoutManagerPopUp;
    private RadioButtonHelper radioButtonHelper;
    private TextView[] textViews;
    private RadioButton[] radioButtons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_l);
        ButterKnife.bind(this);
        textViews = new TextView[5];
        textViews[0] = a;
        textViews[1] = b;
        textViews[2] = c;
        textViews[3] = d;
        textViews[4] = e;
        radioButtons = new RadioButton[5];
        radioButtons[0] = Ia;
        radioButtons[1] = Ib;
        radioButtons[2] = Ic;
        radioButtons[3] = Id;
        radioButtons[4] = Ie;
        radioButtonHelper = new RadioButtonHelper();

        ((ECommerceApp) getApplication()).getComponent().inject(this);


        fcreateTitle("Product");
        fcreateToolbar(this, false, true, false, R.id.toolbar);
        fcreateMenu(this, true);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_l);
        recyclerView.setHasFixedSize(true);
        recyclerLayoutManager = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(recyclerLayoutManager);
        recyclerView.addItemDecoration(new RecyclerAdapter.SpaceItemDecoration(10));
        recyclerAdapter = new RecyclerAdapter(3, R.layout.item_l_comment);
        recyclerView.setAdapter(recyclerAdapter);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.attachToRecyclerView(recyclerView);

        service.getPeople().enqueue(new Callback<People>() {
            @Override
            public void onResponse(Call<People> call, Response<People> response) {
                Toast.makeText(ScreenLActivity.this, response.body().getMusteri().get(0).getName(), Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onFailure(Call<People> call, Throwable t) {

            }
        });
    }


    @OnClick({R.id.searchButton, R.id.basketButton, R.id.fab, R.id.bigImage, R.id.image1, R.id.image2, R.id.image3, R.id.image4, R.id.image5, R.id.ratingBar, R.id.Radio1, R.id.Radio2, R.id.Radio3, R.id.Radio4, R.id.Radio5, R.id.productRadio1, R.id.productRadio2, R.id.productRadio3, R.id.productRadio4})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.searchButton:
                break;
            case R.id.basketButton:
                break;
            case R.id.fab:
                View v = getLayoutInflater().inflate(R.layout.activity_screen_l_popup, null);
                recyclerViewPopUp = (RecyclerView) v.findViewById(R.id.popupList);

                recyclerViewPopUp.setHasFixedSize(true);
                recyclerLayoutManagerPopUp = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL);
                recyclerViewPopUp.setLayoutManager(recyclerLayoutManagerPopUp);

                recyclerViewPopUp.addItemDecoration(new RecyclerAdapter.SpaceItemDecoration(3));
                recyclerAdapter = new RecyclerAdapter(4, R.layout.item_l_popup);
                recyclerViewPopUp.setAdapter(recyclerAdapter);

                AlertDialog.Builder dialog = new AlertDialog.Builder(ScreenLActivity.this);
                dialog.setView(v);
                dialog.setTitle("Your Basket");
                dialog.show();
                break;
            case R.id.image1:
                break;
            case R.id.image2:
                break;
            case R.id.image3:
                break;
            case R.id.image4:
                break;
            case R.id.image5:
                break;
            case R.id.image:
                break;
            case R.id.ratingBar:
                break;
            case R.id.Radio1:
                radioButtonHelper.click("a", textViews, radioButtons, ScreenLActivity.this);
                break;
            case R.id.Radio2:
                radioButtonHelper.click("b", textViews, radioButtons, ScreenLActivity.this);
                break;
            case R.id.Radio3:
                radioButtonHelper.click("c", textViews, radioButtons, ScreenLActivity.this);
                break;
            case R.id.Radio4:
                radioButtonHelper.click("d", textViews, radioButtons, ScreenLActivity.this);
                break;
            case R.id.Radio5:
                radioButtonHelper.click("e", textViews, radioButtons, ScreenLActivity.this);
                break;
            case R.id.productRadio1:
                break;
            case R.id.productRadio2:
                break;
            case R.id.productRadio3:
                break;
            case R.id.productRadio4:
                break;
        }
    }
}
