package com.Services;

import Entities.Admin;
import utils.DataStore;

public class AdminService {

    public void createAdmin(Admin admin) {
        DataStore.admins.add(admin);
        System.out.println("Admin created successfully!");
    }

    public void viewAdmins() {
        if (DataStore.admins.isEmpty()) {
            System.out.println("No admins found.");
            return;
        }
        for (Admin a : DataStore.admins) {
            System.out.println(a);
        }
    }

    public void updateOrderStatus(int orderId, String status) {
        var order = DataStore.findOrderById(orderId);
        if (order != null) {
            order.setStatus(status);
            System.out.println("Order status updated.");
        } else {
            System.out.println("Order not found.");
        }
    }

    public void viewAllOrders() {
        if (DataStore.orders.isEmpty()) {
            System.out.println("No orders placed yet.");
            return;
        }
        for (var order : DataStore.orders) {
            System.out.println(order);
        }
    }
}