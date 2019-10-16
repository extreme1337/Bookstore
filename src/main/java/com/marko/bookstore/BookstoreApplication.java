package com.marko.bookstore;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.marko.bookstore.domain.User;
import com.marko.bookstore.domain.security.Role;
import com.marko.bookstore.domain.security.UserRole;
import com.marko.bookstore.service.UserService;
import com.marko.bookstore.utility.SecurityUtility;

@SpringBootApplication
public class BookstoreApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class,args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user1 = new User();
		user1.setFirstName("Marko");
		user1.setLastName("Markovic");
		user1.setUsername("m");
		user1.setPassword(SecurityUtility.passwordEncoder().encode("m"));
		user1.setEmail("marko.miseljic.14@gmail.com");
		Set<UserRole> userRoles = new HashSet<>();
		Role role1= new Role();
		role1.setRoleId(1);
		role1.setName("ROLE_USER");
		userRoles.add(new UserRole(user1, role1));

		userService.createUser(user1, userRoles);
	}
}
