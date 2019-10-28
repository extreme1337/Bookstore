package com.marko.bookstore.service;

import com.marko.bookstore.domain.ShippingAddress;
import com.marko.bookstore.domain.UserShipping;

public interface ShippingAddressService {
    ShippingAddress setByUserShipping(UserShipping userShipping, ShippingAddress shippingAddress);
}
