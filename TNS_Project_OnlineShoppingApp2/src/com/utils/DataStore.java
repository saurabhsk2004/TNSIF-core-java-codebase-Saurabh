package com.utils;

import Entities.*;
import java.util.*;

import com.Entities.Customer;

public class DataStore {
    public static List<Product> products = new ArrayList<>();
    public static List<Customer> customers = new ArrayList<>();
    public static List<Admin> admins = new ArrayList<>();
    public static List<Order> orders = new ArrayList<>();

    // Helper to find product by ID
    public static Product findProductById(int id) {
        for (Product p : products) {
            if (p.getProductId() == id)
                return p;
        }
        return null;
    }

    public static Customer findCustomerById(int id) {
        for (Customer c : customers) {
            if (c.getUserId() == id)
                return c;
        }
        return null;
    }

    public static Order findOrderById(int id) {
        for (Order o : orders) {
            if (o.getOrderId() == id)
                return o;
        }
        return null;
    }
}