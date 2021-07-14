package com.biskot.app.rest;

import com.biskot.domain.model.Cart;
import com.biskot.domain.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/carts")
public class CartController {
    @Autowired
    private CartService cartService;

    @GetMapping(path = "/{cartId}", produces = "application/json")
    @ResponseBody
    public Cart getCart(@PathVariable Long cartId) {
        return cartService.getCart(cartId);
    }
}
