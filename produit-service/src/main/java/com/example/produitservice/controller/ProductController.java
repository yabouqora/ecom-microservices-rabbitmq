package com.example.produitservice.controller;


import com.example.produitservice.Services.ProductService;
import com.example.produitservice.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produits")
public class ProductController {
    @Autowired
    private ProductService productService ;

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts() ;
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable String id) {
        return productService.getProductById(id) ;
    }
    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product) ;
    }
}
