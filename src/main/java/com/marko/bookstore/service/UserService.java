package com.marko.bookstore.service;

import java.util.Set;

import com.marko.bookstore.domain.User;
import com.marko.bookstore.domain.UserBilling;
import com.marko.bookstore.domain.UserPayment;
import com.marko.bookstore.domain.UserShipping;
import com.marko.bookstore.domain.security.PasswordResetToken;
import com.marko.bookstore.domain.security.UserRole;

public interface UserService {
	PasswordResetToken getPasswordResetToken(final String token);

	void createPasswordResetTokenForUser(final User user, final String token);

	User findByUsername(String username);

	User findByEmail (String email);

	User createUser(User user, Set<UserRole> userRoles) throws Exception;

	User save(User user);

	void updateUserBilling(UserBilling userBilling, UserPayment userPayment, User user);

	void updateUserShipping(UserShipping userShipping, User user);

	void setUserDefaultPayment(Long userPaymentId, User user);

	void setUserDefaultShipping(Long userShippingId, User user);

    User findById(Long id);
}
