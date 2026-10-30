package org.example.productcatalogservice.controllers;

import org.example.productcatalogservice.models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {


    @GetMapping("/products")
    public List<Product> getAllProducts() {
        Product product = new Product();
        product.setPrice(1000);
        product.setId(12);
        product.setName("Jhenga");
        product.setDescription("Jhenga description");
        List<Product> products = new ArrayList<>();
        products.add(product);
        return products;
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable("id") long productId) {
        Product product = new Product();
        product.setId(productId);
        return product;
    }

//    @GetMapping("/products/{pid}/users/{uid}")
//    public Product getProductBasedOnUser(@PathVariable("uid") Long userId,
//                                         @PathVariable("pid") Long productId) {}
}
