package com.marko.bookstore.repository;

import com.marko.bookstore.domain.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order,Long> {
}
