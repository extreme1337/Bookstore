package com.marko.bookstore.service;

import com.marko.bookstore.domain.BillingAddress;
import com.marko.bookstore.domain.UserBilling;

public interface BillingAddressService {
    BillingAddress setByUserBilling(UserBilling userBilling, BillingAddress billingAddress);
}
