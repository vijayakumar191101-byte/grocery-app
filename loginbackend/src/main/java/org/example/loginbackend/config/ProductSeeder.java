package org.example.loginbackend.config;

import lombok.RequiredArgsConstructor;
import org.example.loginbackend.model.Product;
import org.example.loginbackend.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@RequiredArgsConstructor
public class ProductSeeder {

    @Bean
    public CommandLineRunner seedProducts(ProductRepository repo) {
        return args -> {
            if (repo.count() > 0) return; // don't seed again

            List<Product> list = new ArrayList<>();

            // ✅ Vegetables (20)
            list.add(Product.builder().name("Tomato").category("vegetables").price(2.0).oldPrice(2.5).weight("1 kg").imageUrl("https://images.unsplash.com/photo-1582284540020-8acbe03f4924").build());
            list.add(Product.builder().name("Potato").category("vegetables").price(1.5).oldPrice(2.0).weight("1 kg").imageUrl("https://images.unsplash.com/photo-1518977676601-b53f82aba655").build());
            list.add(Product.builder().name("Onion").category("vegetables").price(1.8).oldPrice(2.2).weight("1 kg").imageUrl("https://images.unsplash.com/photo-1618517048289-4646902edaf5").build());
            list.add(Product.builder().name("Carrot").category("vegetables").price(2.3).oldPrice(2.8).weight("1 kg").imageUrl("https://images.unsplash.com/photo-1582515073490-39981397c445").build());
            list.add(Product.builder().name("Cucumber").category("vegetables").price(1.2).oldPrice(1.6).weight("1 kg").imageUrl("https://images.unsplash.com/photo-1568584711075-3d021a7c3ca3").build());
            list.add(Product.builder().name("Capsicum").category("vegetables").price(3.0).oldPrice(3.5).weight("500 g").imageUrl("https://images.unsplash.com/photo-1563565375-f3fdfdbefa83").build());
            list.add(Product.builder().name("Broccoli").category("vegetables").price(3.8).oldPrice(4.2).weight("500 g").imageUrl("https://images.unsplash.com/photo-1584270354949-1e4460c2f7f4").build());
            list.add(Product.builder().name("Cauliflower").category("vegetables").price(3.2).oldPrice(3.8).weight("1 pc").imageUrl("https://images.unsplash.com/photo-1615478503562-ec2d8f5f61a5").build());
            list.add(Product.builder().name("Spinach").category("vegetables").price(1.1).oldPrice(1.5).weight("250 g").imageUrl("https://images.unsplash.com/photo-1580915411954-282cb1b0d780").build());
            list.add(Product.builder().name("Beans").category("vegetables").price(2.2).oldPrice(2.8).weight("500 g").imageUrl("https://images.unsplash.com/photo-1592921870789-04563d55041c").build());
            // +10 more veggies quickly (you can change later)
            for (int i = 1; i <= 10; i++) {
                list.add(Product.builder()
                        .name("Vegetable Pack " + i)
                        .category("vegetables")
                        .price(1.5 + (i * 0.1))
                        .oldPrice(2.0 + (i * 0.1))
                        .weight("500 g")
                        .imageUrl("https://images.unsplash.com/photo-1542838132-92c53300491e")
                        .build());
            }

            // ✅ Fruits (20)
            list.add(Product.builder().name("Apple").category("fruits").price(3.0).oldPrice(3.6).weight("1 kg").imageUrl("https://images.unsplash.com/photo-1560806887-1e4cd0b6cbd6").build());
            list.add(Product.builder().name("Banana").category("fruits").price(2.0).oldPrice(2.5).weight("1 dozen").imageUrl("https://images.unsplash.com/photo-1574226516831-e1dff420e42e").build());
            list.add(Product.builder().name("Orange").category("fruits").price(3.2).oldPrice(3.9).weight("1 kg").imageUrl("https://images.unsplash.com/photo-1547514701-42782101795e").build());
            list.add(Product.builder().name("Grapes").category("fruits").price(4.0).oldPrice(4.8).weight("500 g").imageUrl("https://images.unsplash.com/photo-1519996529931-28324d5a630e").build());
            list.add(Product.builder().name("Pineapple").category("fruits").price(3.5).oldPrice(4.2).weight("1 pc").imageUrl("https://images.unsplash.com/photo-1550258987-190a2d41a8ba").build());
            list.add(Product.builder().name("Watermelon").category("fruits").price(6.0).oldPrice(7.0).weight("1 pc").imageUrl("https://images.unsplash.com/photo-1563114773-84221bd62daa").build());
            list.add(Product.builder().name("Strawberry").category("fruits").price(5.2).oldPrice(6.0).weight("250 g").imageUrl("https://images.unsplash.com/photo-1464965911861-746a04b4bca6").build());
            list.add(Product.builder().name("Mango").category("fruits").price(4.5).oldPrice(5.3).weight("1 kg").imageUrl("https://images.unsplash.com/photo-1553279768-865429fa0078").build());
            list.add(Product.builder().name("Papaya").category("fruits").price(3.1).oldPrice(3.8).weight("1 pc").imageUrl("https://images.unsplash.com/photo-1603833665858-e61d17a86224").build());
            list.add(Product.builder().name("Kiwi").category("fruits").price(4.8).oldPrice(5.5).weight("3 pcs").imageUrl("https://images.unsplash.com/photo-1585059895524-72359e06133a").build());
            for (int i = 1; i <= 10; i++) {
                list.add(Product.builder()
                        .name("Fruit Box " + i)
                        .category("fruits")
                        .price(2.5 + (i * 0.15))
                        .oldPrice(3.0 + (i * 0.15))
                        .weight("500 g")
                        .imageUrl("https://images.unsplash.com/photo-1574856344991-aaa31b6f4ce3")
                        .build());
            }

            // ✅ Chips (20)
            list.add(Product.builder().name("Lays Classic").category("chips").price(1.5).oldPrice(2.0).weight("52 g").imageUrl("https://images.unsplash.com/photo-1585238342028-4b6b0e6c6e68").build());
            list.add(Product.builder().name("Doritos Nacho").category("chips").price(2.2).oldPrice(2.8).weight("60 g").imageUrl("https://images.unsplash.com/photo-1604908176997-125f25cc500f").build());
            list.add(Product.builder().name("Pringles Original").category("chips").price(3.5).oldPrice(4.0).weight("107 g").imageUrl("https://images.unsplash.com/photo-1613919113640-25732ec5e8a7").build());
            for (int i = 1; i <= 17; i++) {
                list.add(Product.builder()
                        .name("Snack Pack " + i)
                        .category("chips")
                        .price(1.2 + (i * 0.1))
                        .oldPrice(1.6 + (i * 0.1))
                        .weight("55 g")
                        .imageUrl("https://images.unsplash.com/photo-1585238342028-4b6b0e6c6e68")
                        .build());
            }

            // ✅ Beverages (20)
            list.add(Product.builder().name("Orange Juice").category("beverages").price(3.0).oldPrice(3.6).weight("1 L").imageUrl("https://images.unsplash.com/photo-1582719478250-c89cae4dc85b").build());
            list.add(Product.builder().name("Coca Cola").category("beverages").price(1.2).oldPrice(1.5).weight("500 ml").imageUrl("https://images.unsplash.com/photo-1510626176961-4b57d4fbad03").build());
            list.add(Product.builder().name("Mineral Water").category("beverages").price(0.8).oldPrice(1.0).weight("1 L").imageUrl("https://images.unsplash.com/photo-1526401485004-2fda9fca4f8b").build());
            for (int i = 1; i <= 17; i++) {
                list.add(Product.builder()
                        .name("Drink Bottle " + i)
                        .category("beverages")
                        .price(1.0 + (i * 0.12))
                        .oldPrice(1.4 + (i * 0.12))
                        .weight("500 ml")
                        .imageUrl("https://images.unsplash.com/photo-1582719478250-c89cae4dc85b")
                        .build());
            }

            repo.saveAll(list);
            System.out.println("✅ Seeded products: " + list.size());
        };
    }
}