package com.marko.bookstore.service;

import com.marko.bookstore.domain.Payment;
import com.marko.bookstore.domain.UserPayment;

public interface PaymentService {
    Payment setByUserPayment(UserPayment userPayment, Payment payment);
}
