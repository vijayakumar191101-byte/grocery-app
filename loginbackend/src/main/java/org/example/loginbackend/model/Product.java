package org.example.loginbackend.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "products")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;          // Tomato

    @Column(nullable = false)
    private String category;      // vegetables, fruits, chips, beverages

    @Column(nullable = false)
    private Double price;         // new price

    private Double oldPrice;      // optional old price (strike)

    private String weight;        // "1 kg", "500 g", "250 ml"

    @Column(length = 1000)
    private String imageUrl;      // product image
}