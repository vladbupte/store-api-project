package com.example.storeapi.service;

import com.example.storeapi.dto.ProductRequest;
import com.example.storeapi.entity.Product;
import com.example.storeapi.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repo;

    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    public List<Product> getAll() {
        return repo.findAll();
    }

    public Product getById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Product not found: " + id));
    }

    public Product create(ProductRequest req) {
        Product p = new Product(req.getName(), req.getCategory(), req.getPrice(), req.getQuantity());
        return repo.save(p);
    }

    public Product update(Long id, ProductRequest req) {
        Product p = getById(id);
        p.setName(req.getName());
        p.setCategory(req.getCategory());
        p.setPrice(req.getPrice());
        p.setQuantity(req.getQuantity());
        return repo.save(p);
    }

    public void delete(Long id) {
        if (!repo.existsById(id)) {
            throw new IllegalArgumentException("Product not found: " + id);
        }
        repo.deleteById(id);
    }
}
