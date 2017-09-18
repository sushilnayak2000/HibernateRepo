package com.hibernate.model;

import java.io.Serializable;

/**
 * Created by sushilnayak2000 on 9/17/2017.
 */
public class Product implements Serializable{
    private int productId;
    private String productName;
    private double price;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
