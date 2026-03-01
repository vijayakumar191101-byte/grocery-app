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

    public List<Product> getAll() {
        return productRepository.findAll();
    }

    public List<Product> getByCategory(String category) {
        return productRepository.findByCategoryIgnoreCase(category);
    }
}