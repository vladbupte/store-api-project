package com.example.storeapi.config;

import com.example.storeapi.entity.Product;
import com.example.storeapi.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner seed(ProductRepository repo) {
        return args -> {
            if (repo.count() == 0) {
                repo.save(new Product("Laptop", "Electronics", 3500.0, 5));
                repo.save(new Product("Keyboard", "Electronics", 180.0, 20));
                repo.save(new Product("Coffee", "Food", 25.0, 60));
            }
        };
    }
}
