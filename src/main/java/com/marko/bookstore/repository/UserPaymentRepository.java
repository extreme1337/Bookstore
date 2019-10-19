package com.marko.bookstore.repository;

import com.marko.bookstore.domain.UserPayment;
import org.springframework.data.repository.CrudRepository;

public interface UserPaymentRepository extends CrudRepository<UserPayment,Long> {
}
