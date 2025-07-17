package com.Services;

import com.Entities.Customer;
import utils.DataStore;

public class CustomerService {

    private static final String DataStore = null;

	public void createCustomer(Customer customer) {
        DataStore.customers.add(customer);
        System.out.println("Customer created successfully!");
    }

    public void viewCustomers() {
        if (DataStore.customers.isEmpty()) {
            System.out.println("No customers found.");
            return;
        }
        for (Customer c : DataStore.customers) {
            System.out.println(c);
        }
    }
}