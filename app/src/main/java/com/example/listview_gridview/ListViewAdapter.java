package com.example.listview_gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {
    Context context;
    int layoutItem;
    ArrayList<Product> products;

    public ListViewAdapter(Context context, int layoutItem, ArrayList<Product> products) {
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
        view= LayoutInflater.from(context).inflate(layoutItem, parent, false);
        TextView txtTenSP= view.findViewById(R.id.txtTenSP);
        TextView txtTenShop= view.findViewById(R.id.txtTenShop);
        ImageView img= view.findViewById((R.id.img));
        txtTenShop.setText(products.get(i).getShopName());
        txtTenSP.setText(products.get(i).getProductName());
        img.setImageResource(products.get(i).getImg());

        return view;
    }
}
