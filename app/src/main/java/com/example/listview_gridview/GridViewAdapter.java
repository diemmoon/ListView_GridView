package com.example.listview_gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class GridViewAdapter extends BaseAdapter {
    Context context;
    int layoutItem;
    ArrayList<Product> products;

    public GridViewAdapter(Context context, int layoutItem, ArrayList<Product> products) {
        this.context = context;
        this.layoutItem = layoutItem;
        this.products = products;
    }

    @Override
    public int getCount() {
        return products.size();
    }

    @Override
    public Object getItem(int i) {
        return products.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        Locale localeVN= new Locale("vi", "VN");
        NumberFormat numberFormat= NumberFormat.getCurrencyInstance(localeVN);
        view= LayoutInflater.from(context).inflate(layoutItem, parent, false);
        TextView txtProductName= view.findViewById(R.id.txtProductName);
        RatingBar rating= view.findViewById(R.id.rating);
        TextView txtQuantity= view.findViewById(R.id.txtQuantity);
        TextView txtPrice= view.findViewById(R.id.txtPrice);
        TextView txtDiscount= view.findViewById(R.id.txtDiscount);
        ImageView img= view.findViewById(R.id.image);

        img.setImageResource(products.get(i).getImg());
        txtProductName.setText(products.get(i).getProductName());
        txtQuantity.setText(String.valueOf(products.get(i).getQuantity()));
        rating.setRating(products.get(i).getRating());
        txtPrice.setText(numberFormat.format(products.get(i).getPrice()));
        txtDiscount.setText("-" + products.get(i).getDiscount()+"%");


        return view;
    }
}
