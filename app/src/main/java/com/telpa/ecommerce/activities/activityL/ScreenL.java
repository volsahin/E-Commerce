package com.telpa.ecommerce.activities.activityL;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.melnykov.fab.FloatingActionButton;
import com.telpa.ecommerce.ECommerceApp;
import com.telpa.ecommerce.R;
import com.telpa.ecommerce.adapters.RecyclerAdapter;
import com.telpa.ecommerce.adapters.RecyclerAdapter_KLComment;
import com.telpa.ecommerce.helper.RadioButtonHelper;
import com.telpa.ecommerce.interfaces.IBasket;
import com.telpa.ecommerce.interfaces.ICategory;
import com.telpa.ecommerce.interfaces.IProduct;
import com.telpa.ecommerce.models.Product;
import com.telpa.ecommerce.network.APIService;
import com.telpa.ecommerce.network.People;
import com.telpa.ecommerce.utils.BaseActivity;

import java.util.ArrayList;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class ScreenL extends BaseActivity implements IScreenLView {
    @Inject
    APIService service;
    @Inject
    IBasket basket;
    @Inject
    IProduct product;
    @Inject
    ICategory category;


    @BindView(R.id.fab)
    FloatingActionButton fab;
    @BindView(R.id.ratingBar)
    RatingBar ratingBar;
    @BindView(R.id.reviews)
    TextView reviews;
    @BindView(R.id.lin_2_l)
    RadioGroup radioGroup1;
    @BindView(R.id.lin_3_l)
    RadioGroup radioGroup2;


    private RecyclerView recyclerView;
    private RecyclerView recyclerViewPopUp;
    private RecyclerView.Adapter recyclerAdapter;
    private RecyclerView.LayoutManager recyclerLayoutManager;
    private RecyclerView.LayoutManager recyclerLayoutManagerPopUp;
    private RadioButtonHelper radioButtonHelper;
    private TextView[] textViews;
    private RadioButton[] radioButtons;
    private ArrayList<Product> products;
    private IScreenLPresenter screenLPresenter;
    //TODO
    public TextView price;
    public TextView description;
    public TextView variants1, variants2;
    //public RatingBar ratingBar;
    public TextView reviewsCount;
    public ImageButton bigImage, image1, image2, image3, image4, image5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_l);

        screenLPresenter=new ScreenLPresenter(this,getApplication());
       // ButterKnife.bind(this);

        screenLPresenter = new ScreenLPresenter(this, getApplication());
        ButterKnife.bind(this);



//TODO
        ArrayList<String> url = new ArrayList<String>();
        url.add("url1");
        url.add("urls2");


        ((ECommerceApp) getApplication()).getComponent().inject(this);


        //TODO


        fcreateTitle("Product");
        fcreateToolbar(this, false, true, false, R.id.toolbar);
        fcreateMenu(this, true);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_l);
        recyclerView.setHasFixedSize(true);
        recyclerLayoutManager = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(recyclerLayoutManager);
        recyclerView.addItemDecoration(new RecyclerAdapter.SpaceItemDecoration(10));
        recyclerAdapter = new RecyclerAdapter_KLComment(ScreenL.this,screenLPresenter.fillList().size(), R.layout.item_l_comment, screenLPresenter.fillList());

        recyclerAdapter = new RecyclerAdapter_KLComment(ScreenL.this, screenLPresenter.fillList().size(), R.layout.item_l_comment, screenLPresenter.fillList());
        recyclerView.setAdapter(recyclerAdapter);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

        //TODO

        bigImage = (ImageButton) findViewById(R.id.bigImage);
        price = (TextView) findViewById(R.id.bigPrice);
        description = (TextView) findViewById(R.id.description);
        reviewsCount = (TextView) findViewById(R.id.reviews);
        ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        variants1 = (TextView) findViewById(R.id.variants1);
        variants2 = (TextView) findViewById(R.id.variants2);

        setTitle("Product15");
        price.setText("$50");
        description.setText("Açıklama");
        reviewsCount.setText("50 reviews");
        variants1.setText("Renk");
        variants2.setText("Beden");
        ratingBar.setRating(5);
    }


    @OnClick({R.id.searchButton, R.id.basketButton, R.id.fab, R.id.bigImage, R.id.image1, R.id.image2, R.id.image3, R.id.image4, R.id.image5, R.id.ratingBar})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bigImage:
                Toast.makeText(ScreenL.this, "mertblt", Toast.LENGTH_SHORT).show();
            case R.id.searchButton:
                break;
            case R.id.basketButton:
                break;
            case R.id.fab:
                screenLPresenter.onButtonClick(radioGroup1, radioGroup2);
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

        }
    }

    @Override
    public void onButtonClick(String cumle) {
        Toast.makeText(ScreenL.this, cumle, Toast.LENGTH_SHORT).show();
    }
}
