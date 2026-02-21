package Model;

import java.io.Serializable;

public abstract class Product implements Stockable, Serializable {

    protected String productId;
    protected String productName;
    protected double productPrice;
    protected int productQuantity;
    protected int productMax;
    protected int productMin;
    protected boolean productStatus;

    public Product(String id, String name, double price,
                   int qty, int max, int min, boolean status) {

        productId = id;
        productName = name;
        productPrice = price;
        productQuantity = qty;
        productMax = max;
        productMin = min;
        productStatus = status;

        updateStatus();
    }

    public String getProductId() { return productId; }
    public String getProductName() { return productName; }
    public double getProductPrice() { return productPrice; }
    public int getProductQuantity() { return productQuantity; }
    public int getProductMax() { return productMax; }
    public int getProductMin() { return productMin; }

    public void setProductQuantity(int qty) {

        if (qty < 0) qty = 0;
        if (qty > productMax) qty = productMax;

        productQuantity = qty;
        updateStatus();
    }

    private void updateStatus() {
        productStatus = !isLowStock();
    }

    @Override
    public boolean isLowStock() {
        return productQuantity <= productMin;
    }

    @Override
    public boolean isFullStock() {
        return productQuantity >= productMax;
    }

    public String toString(String id) {
        return "ID: " + id +
                " Name: " + productName +
                " Qty: " + productQuantity;
    }
}