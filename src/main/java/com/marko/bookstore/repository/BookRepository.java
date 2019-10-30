package com.marko.bookstore.repository;


import com.marko.bookstore.domain.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long>{

    List<Book> findByCategory(String category);
}
