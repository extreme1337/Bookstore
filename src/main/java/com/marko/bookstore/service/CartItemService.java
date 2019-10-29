package com.marko.bookstore.service;

import java.util.List;

import com.marko.bookstore.domain.Book;
import com.marko.bookstore.domain.CartItem;
import com.marko.bookstore.domain.ShoppingCart;
import com.marko.bookstore.domain.User;

public interface CartItemService {
    List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);

    CartItem updateCartItem(CartItem cartItem);

    CartItem addBookToCartItem(Book book, User user, int parseInt);

    CartItem findById(Long cartItemId);

    void removeCartItem(CartItem byId);

    CartItem save(CartItem cartItem);
}
