package com.marko.bookstore.service;

import com.marko.bookstore.domain.UserShipping;

public interface UserShippingService {
    UserShipping findById(Long shippingAddressId);

    void removeById(Long userShippingId);
}
