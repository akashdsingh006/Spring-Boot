package com.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Book;
import com.springboot.service.BookService;

@RestController
public class MainController {
	
	@Autowired
	BookService bookService;
	
	//@RequestMapping(path =  "/home" ,method = RequestMethod.GET)
	//@ResponseBody
	
	@GetMapping("/all")
	public ResponseEntity<List<Book>> getHome()
	{
		List<Book> bookList=bookService.findAllBooks();
		if(bookList.size()<=0)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(bookList));
	}
	
	@PostMapping("/addbook")
	public ResponseEntity<Book> addBook(@RequestBody Book book)
	{
		Book addBook =null;
		
		try {
		addBook = bookService.addBook(book);
		return ResponseEntity.of(Optional.of(addBook));
		}
		catch(Exception e)
		{
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		//return addBook;
	}
	
	@GetMapping("/find/{bookname}")
	public ResponseEntity<Book> findByBookName(@PathVariable("bookname") String name)
	{
		Book book=bookService.findByName(name);
		if(book==null)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(book));
	}
}
