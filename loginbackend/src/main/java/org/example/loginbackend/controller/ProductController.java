package org.example.loginbackend.controller;

import lombok.RequiredArgsConstructor;
import org.example.loginbackend.model.Product;
import org.example.loginbackend.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class ProductController {

    private final ProductService productService;

    // ✅ GET all products OR by category
    // /api/products
    // /api/products?category=fruits
    @GetMapping
    public ResponseEntity<List<Product>> getProducts(
            @RequestParam(required = false) String category
    ) {
        return ResponseEntity.ok(productService.getAll(category));
    }

    // ✅ ADMIN: Create product
    // POST /api/products
    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        if (product.getName() == null || product.getName().isBlank()) {
            return ResponseEntity.badRequest().build();
        }
        if (product.getCategory() == null || product.getCategory().isBlank()) {
            return ResponseEntity.badRequest().build();
        }
        if (product.getPrice() == null) {
            return ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(productService.create(product));
    }
}