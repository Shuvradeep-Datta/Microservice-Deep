package com.deep.infosys.stream.product;

import java.util.Arrays;
import java.util.List;

public class ProductData {

    public static List<Product> getProducts() {
        return Arrays.asList(
                new Product(1, "Laptop", "Electronics", 75000),
                new Product(2, "Mouse", "Electronics", 1500),
                new Product(3, "Keyboard", "Electronics", 2500),
                new Product(4, "Shirt", "Fashion", 1200),
                new Product(5, "Jeans", "Fashion", 2000),
                new Product(6, "Watch", "Accessories", 5000),
                new Product(7, "Shoes", "Fashion", 3000)
        );
    }
}

