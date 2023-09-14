package com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entity.Book;
import com.springboot.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	BookRepository bookRepository;
	
	@Override
	public List<Book> findAllBooks() {
		List<Book> bookList= (List<Book>) bookRepository.findAll();
		return bookList;
	}

	@Override
	public Book addBook(Book book) {
		bookRepository.save(book);
		return book;
	}

	@Override
	public Book findByName(String name) {
		return bookRepository.findByBookName(name);
	}

}
