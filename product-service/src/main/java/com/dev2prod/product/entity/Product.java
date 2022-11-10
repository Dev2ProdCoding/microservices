package com.dev2prod.product.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "PRODUCT")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    private String productName;
    private Integer quantity;
    private Double amount;
}
