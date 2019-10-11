package com.marko.bookstore.service;

import java.util.Set;

import com.marko.bookstore.domain.User;
import com.marko.bookstore.domain.security.PasswordResetToken;
import com.marko.bookstore.domain.security.UserRole;

public interface UserService {
    PasswordResetToken getPasswordResetToken(final String token);

    void createPasswordResetTokenForUser(final User user, final String token);

    User findByUsername(String username);

    User findByEmail (String email);

    User createUser(User user, Set<UserRole> userRoles) throws Exception;

    User save(User user);
}
