package com.marko.bookstore.service;

import com.marko.bookstore.domain.Book;

import java.util.List;

public interface BookService {
	List<Book> findAll();
	
	Book findOne(Long id);

    List<Book> findByCategory(String category);
}
