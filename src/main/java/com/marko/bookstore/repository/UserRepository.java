package com.marko.bookstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.marko.bookstore.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);

    User findByEmail(String email);
}
