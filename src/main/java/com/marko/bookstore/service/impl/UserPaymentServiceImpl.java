package com.marko.bookstore.service.impl;

import com.marko.bookstore.domain.UserPayment;
import com.marko.bookstore.repository.UserPaymentRepository;
import com.marko.bookstore.service.UserPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserPaymentServiceImpl implements UserPaymentService {

    @Autowired
    private UserPaymentRepository userPaymentRepository;

    @Override
    public UserPayment findById(Long id) {
        return userPaymentRepository.findById(id).orElse(null);
    }

    @Override
    public void removeById(Long creditCardId) {
        userPaymentRepository.deleteById(creditCardId);
    }
}
