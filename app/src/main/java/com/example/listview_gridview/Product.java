package com.example.listview_gridview;

public class Product {
    private int img;
    private String productName;
    private String shopName;
    private int quantity;
    private float rating;
    private double price;
    private int discount;

    public Product() {
    }

    public Product(int img, String productName, String shopName) {
        this.img = img;
        this.productName = productName;
        this.shopName = shopName;
    }

    public Product(int img, String productName, int quantity, float rating, double price, int discount) {
        this.img = img;
        this.productName = productName;
        this.quantity = quantity;
        this.rating = rating;
        this.price = price;
        this.discount = discount;
    }

    public Product(int img, String productName, String shopName, int quantity, int rating, double price, int discount) {
        this.img = img;
        this.productName = productName;
        this.shopName = shopName;
        this.quantity = quantity;
        this.rating = rating;
        this.price = price;
        this.discount = discount;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "img=" + img +
                ", productName='" + productName + '\'' +
                ", shopName='" + shopName + '\'' +
                ", quantity=" + quantity +
                ", rating=" + rating +
                ", price=" + price +
                ", discount=" + discount +
                '}';
    }
}
