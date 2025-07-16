package com.Main;

import Entities.*;
import Services.*;
import utils.DataStore;

import java.util.*;

import com.Entities.Customer;
import com.Entities.Product;
import com.Services.AdminService;
import com.Services.CustomerService;
import com.Services.OrderService;
import com.Services.ProductService;

public class Main {

    private static final Scanner sc = new Scanner(System.in);
    private static final ProductService productService = new ProductService();
    private static final AdminService adminService = new AdminService();
    private static final CustomerService customerService = new CustomerService();
    private static final OrderService orderService = new OrderService();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Admin Menu");
            System.out.println("2. Customer Menu");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int mainChoice = sc.nextInt();

            switch (mainChoice) {
                case 1:
                    adminMenu();
                    break;
                case 2:
                    customerMenu();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }

    private static void adminMenu() {
        while (true) {
            System.out.println("\nAdmin Menu:");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. View Products");
            System.out.println("4. Create Admin");
            System.out.println("5. View Admins");
            System.out.println("6. Update Order Status");
            System.out.println("7. View Orders");
            System.out.println("8. Return");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    removeProduct();
                    break;
                case 3:
                    productService.viewProducts();
                    break;
                case 4:
                    createAdmin();
                    break;
                case 5:
                    adminService.viewAdmins();
                    break;
                case 6:
                    updateOrderStatus();
                    break;
                case 7:
                    adminService.viewAllOrders();
                    break;
                case 8:
                    return;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }

    private static void customerMenu() {
        while (true) {
            System.out.println("\nCustomer Menu:");
            System.out.println("1. Create Customer");
            System.out.println("2. View Customers");
            System.out.println("3. Place Order");
            System.out.println("4. View Orders");
            System.out.println("5. View Products");
            System.out.println("6. Return");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    createCustomer();
                    break;
                case 2:
                    customerService.viewCustomers();
                    break;
                case 3:
                    placeOrder();
                    break;
                case 4:
                    viewCustomerOrders();
                    break;
                case 5:
                    productService.viewProducts();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }

    private static void addProduct() {
        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Product Price: ");
        double price = sc.nextDouble();
        System.out.print("Enter Stock Quantity: ");
        int qty = sc.nextInt();

        Product p = new Product(id, name, price, qty);
        productService.addProduct(p);
    }

    private static void removeProduct() {
        System.out.print("Enter Product ID to remove: ");
        int id = sc.nextInt();
        productService.removeProduct(id);
    }

    private static void createAdmin() {
        System.out.print("Enter Admin ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Username: ");
        String username = sc.nextLine();
        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        Admin a = new Admin(id, username, email);
        adminService.createAdmin(a);
    }

    private static void updateOrderStatus() {
        System.out.print("Enter Order ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter new status (Completed/Delivered/Cancelled): ");
        String status = sc.nextLine();
        adminService.updateOrderStatus(id, status);
    }

    private static void createCustomer() {
        System.out.print("Enter Customer ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Username: ");
        String username = sc.nextLine();
        System.out.print("Enter Email: ");
        String email = sc.nextLine();
        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        Customer c = new Customer(id, username, email, address);
        customerService.createCustomer(c);
    }

    private static void placeOrder() {
        System.out.print("Enter Customer ID: ");
        int id = sc.nextInt();
        Customer customer = DataStore.findCustomerById(id);
        if (customer == null) {
            System.out.println("Customer not found.");
            return;
        }

        Map<Product, Integer> orderItems = new HashMap<>();
        while (true) {
            System.out.print("Enter Product ID to add to order (or -1 to complete): ");
            int pid = sc.nextInt();
            if (pid == -1) break;

            Product p = DataStore.findProductById(pid);
            if (p == null) {
                System.out.println("Product not found.");
                continue;
            }

            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();
            orderItems.put(p, qty);
        }

        orderService.placeOrder(id, orderItems);
    }

    private static void viewCustomerOrders() {
        System.out.print("Enter Customer ID: ");
        int id = sc.nextInt();
        orderService.viewOrdersByCustomerId(id);
    }
}