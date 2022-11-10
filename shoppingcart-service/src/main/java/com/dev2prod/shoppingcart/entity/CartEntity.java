package com.dev2prod.shoppingcart.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "SHOPPING_CART")
public class CartEntity {

    @Id
    private Long userId;
    private Long cartId;
    private Integer totalItems;
    private Double totalCost;
    private String products;
}
