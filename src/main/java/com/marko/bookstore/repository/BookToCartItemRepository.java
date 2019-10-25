package com.marko.bookstore.repository;

import com.marko.bookstore.domain.BookToCartItem;
import com.marko.bookstore.domain.CartItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface BookToCartItemRepository extends CrudRepository<BookToCartItem,Long> {
    void deleteByCartItem(CartItem cartItem);
}
