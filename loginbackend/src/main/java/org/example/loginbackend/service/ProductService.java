package org.example.loginbackend.service;

import lombok.RequiredArgsConstructor;
import org.example.loginbackend.model.Product;
import org.example.loginbackend.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<Product> getAll(String category) {
        if (category == null || category.isBlank()) {
            return productRepository.findAll();
        }
        return productRepository.findByCategoryIgnoreCase(category);
    }

    public Product create(Product product) {
        return productRepository.save(product);
    }
}