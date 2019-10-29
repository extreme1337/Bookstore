package com.marko.bookstore.service;

import java.util.List;

import com.marko.bookstore.domain.*;

public interface CartItemService {
    List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);

    CartItem updateCartItem(CartItem cartItem);

    CartItem addBookToCartItem(Book book, User user, int parseInt);

    CartItem findById(Long cartItemId);

    void removeCartItem(CartItem byId);

    CartItem save(CartItem cartItem);

    List<CartItem> findByOrder(Order order);
}
