package com.example.storeapi.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "name is required")
    @Size(max = 120, message = "name max length is 120")
    @Column(nullable = false, length = 120)
    private String name;

    @Size(max = 60, message = "category max length is 60")
    @Column(length = 60)
    private String category;

    @NotNull(message = "price is required")
    @PositiveOrZero(message = "price must be >= 0")
    @Column(nullable = false)
    private Double price;

    @NotNull(message = "quantity is required")
    @PositiveOrZero(message = "quantity must be >= 0")
    @Column(nullable = false)
    private Integer quantity;

    public Product() {}

    public Product(String name, String category, Double price, Integer quantity) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
