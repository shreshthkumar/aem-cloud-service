package com.example.aem.core.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductServiceImpl {

    public List<Product> getProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("1", "Product 1", "Description of Product 1"));
        products.add(new Product("2", "Product 2", "Description of Product 2"));
        return products;
    }

    public Optional<Product> getProductById(String productId) {
        return getProducts().stream()
                .filter(product -> product.getId().equals(productId))
                .findFirst();
    }

    public List<Product> searchProducts(String query) {
        List<Product> products = getProducts();
        List<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().toLowerCase().contains(query.toLowerCase())) {
                result.add(product);
            }
        }
        return result;
    }

    public List<String> getCategories() {
        List<String> categories = new ArrayList<>();
        categories.add("Category 1");
        categories.add("Category 2");
        return categories;
    }

    // Product inner class for demonstration purposes
    class Product {
        private String id;
        private String name;
        private String description;

        public Product(String id, String name, String description) {
            this.id = id;
            this.name = name;
            this.description = description;
        }

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }
    }
}