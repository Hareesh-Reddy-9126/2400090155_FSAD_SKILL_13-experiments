package com.example.skill8;

import com.example.skill8.model.Product;
import com.example.skill8.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Skill8Application {
    public static void main(String[] args) {
        SpringApplication.run(Skill8Application.class, args);
    }

    @Bean
    CommandLineRunner runner(ProductRepository repo) {
        return args -> {
            repo.save(new Product("Laptop", "Electronics", 65000));
            repo.save(new Product("Phone", "Electronics", 30000));
            repo.save(new Product("Shoes", "Fashion", 2500));
            repo.save(new Product("Watch", "Fashion", 5000));
            repo.save(new Product("TV", "Electronics", 45000));
        };
    }
}
