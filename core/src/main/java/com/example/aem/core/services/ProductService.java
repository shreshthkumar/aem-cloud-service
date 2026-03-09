package com.example.aem.core.services;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List getProducts();
    Optional getProductById(String productId);
    List searchProducts(String query);
    List getCategories();
}

class Product {
    private String id;
    private String name;
    private String description;
    private String category;
    private double price;
    private String imageUrl;

    public Product(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Product(String id, String name, String description, String category, double price, String imageUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.imageUrl = imageUrl;
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

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}