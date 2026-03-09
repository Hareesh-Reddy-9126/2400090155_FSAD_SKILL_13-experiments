package com.example.skill8.service;

import com.example.skill8.model.Product;
import com.example.skill8.repository.ProductRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {
    private final ProductRepository repo;

    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    public List<Product> getByCategory(String category) {
        return repo.findByCategory(category);
    }

    public List<Product> getByPriceRange(double min, double max) {
        return repo.findByPriceBetween(min, max);
    }

    public List<Product> getSortedByPrice() {
        return repo.findAllSortedByPrice();
    }

    public List<Product> getExpensive(double price) {
        return repo.findExpensiveProducts(price);
    }
}
