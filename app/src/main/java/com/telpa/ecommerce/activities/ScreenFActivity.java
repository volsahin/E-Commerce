package com.telpa.ecommerce.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.telpa.ecommerce.R;
import com.telpa.ecommerce.fragment.FragmentATab;
import com.telpa.ecommerce.fragment.FragmentBTab;
import com.telpa.ecommerce.fragment.FragmentFTab;
import com.telpa.ecommerce.models.Category;
import com.telpa.ecommerce.utils.BaseActivity;
import com.telpa.ecommerce.utils.TabHelper;

import java.util.ArrayList;
import java.util.List;

public class ScreenFActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_f);

        fcreateTitle("My Store" + " F");
        fcreateToolbar(this,false,  true, true, R.id.toolbar);
        fcreateMenu(this, true);


        // This list holds current tabs in ScreenA
        List<TabHelper> tabHelperList = new ArrayList<>();
        List<Category> categories = new ArrayList<>();
        Category a=new Category(1,"A",1,1,1);
        categories.add(a);
        Category b=new Category(1,"B",1,1,1);
        categories.add(b);
        Category c=new Category(1,"C",1,1,1);
        categories.add(c);

        for(Category i:categories){

            FragmentFTab tab=new FragmentFTab();
            tab.createTab(i.getName());
            tabHelperList.add(tab);
        }

        fcreateTabMenu(tabHelperList);

    }
}
