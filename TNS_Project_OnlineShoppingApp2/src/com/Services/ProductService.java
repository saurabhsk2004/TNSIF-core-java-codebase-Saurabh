package com.Services;
import Entities.Product;
import utils.DataStore;

public class ProductService {

    public void addProduct(Product product) {
        DataStore.products.add(product);
        System.out.println("Product added successfully!");
    }

    public void removeProduct(int productId) {
        Product product = DataStore.findProductById(productId);
        if (product != null) {
            DataStore.products.remove(product);
            System.out.println("Product removed successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }

    public void viewProducts() {
        if (DataStore.products.isEmpty()) {
            System.out.println("No products available.");
            return;
        }
        for (Product p : DataStore.products) {
            System.out.println(p);
        }
    }
}