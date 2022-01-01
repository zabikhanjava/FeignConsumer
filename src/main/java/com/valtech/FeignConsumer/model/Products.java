package com.valtech.FeignConsumer.model;


public class Products {
    int id;
    String productName;
    String productType;
    int productQuantity;

    public Products(int id, String productName, String productType, int productQuantity) {
        this.id = id;
        this.productName = productName;
        this.productType = productType;
        this.productQuantity = productQuantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }
}
