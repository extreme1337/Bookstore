package com.marko.bookstore.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.marko.bookstore.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marko.bookstore.repository.BookRepository;
import com.marko.bookstore.service.BookService;

@Service
public class BookServiceImpl implements BookService{
	@Autowired
	private BookRepository bookRepository;
	
	public List<Book> findAll() {
		List<Book> bookList = (List<Book>) bookRepository.findAll();
		List<Book> activeBookList = new ArrayList<>();

		for(Book book : bookList){
			if(book.isActive()){
				activeBookList.add(book);
			}
		}
		return activeBookList;
	}
	
	public Book findOne(Long id) {
		return bookRepository.findById(id).orElse(null);
	}

	@Override
	public List<Book> findByCategory(String category) {
		List<Book> bookList = bookRepository.findByCategory(category);

		List<Book> activeBookList = new ArrayList<>();
		for(Book book : bookList){
			if(book.isActive()){
				activeBookList.add(book);
			}
		}
		return activeBookList;
	}

	@Override
	public List<Book> blurrySearch(String keyword) {
		List<Book> bookList = bookRepository.findByTitleIsContaining(keyword);
		List<Book> activeBookList = new ArrayList<>();

		for(Book book :bookList){
			if(book.isActive()){
				activeBookList.add(book);
			}
		}
		return activeBookList;
	}

}
