package com.marko.bookstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.marko.bookstore.domain.security.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
    Role findByname(String name);
}
