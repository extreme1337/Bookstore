package com.marko.bookstore.repository;

import com.marko.bookstore.domain.ShoppingCart;
import org.springframework.data.repository.CrudRepository;

public interface ShoppingCartRepository extends CrudRepository<ShoppingCart,Long> {
}
