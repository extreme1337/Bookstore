package com.marko.bookstore.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.marko.bookstore.domain.CartItem;
import com.marko.bookstore.domain.ShoppingCart;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface CartItemRepository extends CrudRepository<CartItem, Long>{
    List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);
}
