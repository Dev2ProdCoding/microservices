package com.dev2prod.shoppingcart.controller;

import com.dev2prod.shoppingcart.model.ShoppingCartRequest;
import com.dev2prod.shoppingcart.model.ShoppingCartResponse;
import com.dev2prod.shoppingcart.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shoppingcart")
public class ShoppingCartController {

    @Autowired
    private ShoppingCartService shoppingCartService;

    @PostMapping("/{userId}/products")
    public ResponseEntity addProductsToCart(
            @PathVariable Long userId,
            @RequestBody List<ShoppingCartRequest> reqProductList
    ){
        ShoppingCartResponse response = shoppingCartService.processAddRequest(userId, reqProductList);
        return new ResponseEntity(response, HttpStatus.CREATED);
    }

    @GetMapping("/{userId}")
    public ResponseEntity getShoppingCart(@PathVariable Long userId){
        return ResponseEntity.ok(shoppingCartService.getShoppingCart(userId));
    }
}
