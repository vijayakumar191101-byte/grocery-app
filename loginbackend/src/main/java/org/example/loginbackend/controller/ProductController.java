package org.example.loginbackend.controller;

import lombok.RequiredArgsConstructor;
import org.example.loginbackend.model.Product;
import org.example.loginbackend.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class ProductController {

    private final ProductService productService;

    // GET: /api/products
    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAll();
    }

    // GET: /api/products/category/vegetables
    @GetMapping("/category/{category}")
    public List<Product> getByCategory(@PathVariable String category) {
        return productService.getByCategory(category);
    }
}