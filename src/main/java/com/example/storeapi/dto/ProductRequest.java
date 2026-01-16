package com.example.storeapi.dto;

import jakarta.validation.constraints.*;

public class ProductRequest {

    @NotBlank(message = "name is required")
    @Size(max = 120, message = "name max length is 120")
    private String name;

    @Size(max = 60, message = "category max length is 60")
    private String category;

    @NotNull(message = "price is required")
    @PositiveOrZero(message = "price must be >= 0")
    private Double price;

    @NotNull(message = "quantity is required")
    @PositiveOrZero(message = "quantity must be >= 0")
    private Integer quantity;

    public ProductRequest() {}

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
