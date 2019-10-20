package com.marko.bookstore.service.impl;

import com.marko.bookstore.domain.UserShipping;
import com.marko.bookstore.repository.UserShippingRepository;
import com.marko.bookstore.service.UserShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserShippingServiceImpl implements UserShippingService {
    @Autowired
    private UserShippingRepository userShippingRepository;

    @Override
    public UserShipping findById(Long shippingAddressId) {
        return userShippingRepository.findById(shippingAddressId).orElse(null);
    }

    @Override
    public void removeById(Long userShippingId) {
        userShippingRepository.deleteById(userShippingId);
    }
}
