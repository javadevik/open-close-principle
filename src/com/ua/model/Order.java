package com.ua.model;

public class Order {
    private final String productName;
    private final String email;
    private final double price;
    private final boolean isValid;

    public Order(String productName, String email, double price) {
        this.productName = productName;
        this.email = email;
        this.price = price;
        this.isValid = true;
    }

    public String getProductName() {
        return productName;
    }

    public String getEmail() {
        return email;
    }

    public double getPrice() {
        return price;
    }

    public boolean isValid() {
        return isValid;
    }

    @Override
    public String toString() {
        return "Order{" +
                "productName='" + productName + '\'' +
                ", email='" + email + '\'' +
                ", price=" + price +
                '}';
    }
}
