package com.springboot.service;

import java.util.List;

import com.springboot.entity.Book;

public interface BookService {
	
	public List<Book> findAllBooks();
	
	public Book addBook(Book book);
	
	public Book findByName(String name);
}
