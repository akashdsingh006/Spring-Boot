package com.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.entity.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer>{
	
	public Book findByBookName(String name);
}
