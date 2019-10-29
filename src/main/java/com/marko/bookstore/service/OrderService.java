package com.marko.bookstore.service;

import com.marko.bookstore.domain.*;

public interface OrderService {
    Order createOrder(ShoppingCart shoppingCart, ShippingAddress shippingAddress, BillingAddress billingAddress, Payment payment, User user,String shippingMethod);
    Order findById(Long id);
}
