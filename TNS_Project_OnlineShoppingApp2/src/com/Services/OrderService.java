package com.Services;

import com.Entities.*;
import utils.DataStore;

import java.util.*;

public class OrderService {

    public void placeOrder(int customerId, Map<Product, Integer> itemsToOrder) {
        Customer customer = DataStore.findCustomerById(customerId);
        if (customer == null) {
            System.out.println("Customer not found.");
            return;
        }

        List<ProductQuantityPair> pqList = new ArrayList<>();

        for (Map.Entry<Product, Integer> entry : itemsToOrder.entrySet()) {
            Product p = entry.getKey();
            int quantity = entry.getValue();

            if (p.getStockQuantity() < quantity) {
                System.out.println("Not enough stock for product: " + p.getName());
                return;
            }
            p.setStockQuantity(p.getStockQuantity() - quantity);  // reduce stock
            pqList.add(new ProductQuantityPair(p, quantity));
        }

        Order order = new Order(customer, pqList);
        DataStore.orders.add(order);
        customer.getOrders().add(order);
        customer.getCart().clearCart();

        System.out.println("Order placed successfully!");
    }

    public void viewOrdersByCustomerId(int customerId) {
        Customer customer = DataStore.findCustomerById(customerId);
        if (customer == null) {
            System.out.println("Customer not found.");
            return;
        }

        if (customer.getOrders().isEmpty()) {
            System.out.println("No orders found for this customer.");
        } else {
            for (Order o : customer.getOrders()) {
                System.out.println(o);
            }
        }
    }
}