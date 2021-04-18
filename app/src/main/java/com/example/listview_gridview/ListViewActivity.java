package com.example.listview_gridview;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<Product> products;
    ListViewAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        listView= findViewById(R.id.listView);
        products= new ArrayList<Product>();
        products.add(new Product(R.drawable.ca_nau_lau, "Ca nấu lẩu, nấu mì mini","Shop Devang"));
        products.add(new Product(R.drawable.ga_bo_toi, "1KG KHÔ GÀ BƠ TỎI","Shop LTD Food"));
        products.add(new Product(R.drawable.xa_can_cau, "Xe cần cẩu da năng","Shop Thế giói đồ chơi"));
        products.add(new Product(R.drawable.do_choi_dang_mo_hinh, "Đồ chơi dạng mô hình","Shop Thế giói đồ chơi"));
        products.add(new Product(R.drawable.lanh_dao_gian_don, "Lãnh đạo giản đơn","Shop Minh Long Book"));
        products.add(new Product(R.drawable.hieu_long_con_tre, "Hiểu lòng con trẻ","Shop Minh Long Book"));
        adapter= new ListViewAdapter(this, R.layout.listview_item, products);
        listView.setAdapter(adapter);
    }
}
