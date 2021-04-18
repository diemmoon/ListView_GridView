package com.example.listview_gridview;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class GridViewActivity extends AppCompatActivity {
    GridView gridView;
    ArrayList<Product> products;
   GridViewAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridview);
        gridView= findViewById(R.id.gridView);
        products= new ArrayList<Product>();
        products.add(new Product(R.drawable.giacchuyen_1, "Cáp chuyển từ Cổng USB sang PS2...", 15, 4, 69900, 39));
        products.add(new Product(R.drawable.daynguon_1, "Cáp chuyển từ Cổng USB sang PS2...", 15, 4, 69900, 39));
        products.add(new Product(R.drawable.dauchuyendoi_1, "Cáp chuyển từ Cổng USB sang PS2...", 15, 4, 69900, 39));
        products.add(new Product(R.drawable.dauchuyendoipsps2_1, "Cáp chuyển từ Cổng USB sang PS2...", 15, 4, 69900, 39));
        products.add(new Product(R.drawable.carbusbtops2_1, "Cáp chuyển từ Cổng USB sang PS2...", 15, 4, 69900, 39));
        products.add(new Product(R.drawable.daucam_1, "Cáp chuyển từ Cổng USB sang PS2...", 15, 4, 69900, 39));

        adapter= new GridViewAdapter(this, R.layout.gridview_item, products);
        gridView.setAdapter(adapter);
    }
}
