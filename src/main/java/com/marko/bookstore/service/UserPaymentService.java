package com.marko.bookstore.service;

import com.marko.bookstore.domain.UserPayment;

public interface UserPaymentService {
    UserPayment findById(Long id);

    void removeById(Long creditCardId);
}
