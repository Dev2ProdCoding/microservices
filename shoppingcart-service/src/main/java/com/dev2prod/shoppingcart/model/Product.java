package com.dev2prod.shoppingcart.model;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {
    private Long productId;
    private String productName;
    private Integer quantity;
    private Double amount;
}
