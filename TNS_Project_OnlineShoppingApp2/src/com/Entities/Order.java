package com.Entities;

import java.util.*;

public class Order {
    private static int count = 1;
    private int orderId;
    private Customer customer;
    private List<ProductQuantityPair> items;
    private String status;

    public Order(Customer customer, List<ProductQuantityPair> items) {
        this.orderId = count++;
        this.customer = customer;
        this.items = items;
        this.status = "Pending";
    }

    public int getOrderId() { return orderId; }
    public Customer getCustomer() { return customer; }
    public List<ProductQuantityPair> getItems() { return items; }
    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Order ID: " + orderId + ", Customer: " + customer.getUsername() + ", Status: " + status + "\n");
        for (ProductQuantityPair p : items) {
            sb.append("  ").append(p).append("\n");
        }
        return sb.toString();
    }
}