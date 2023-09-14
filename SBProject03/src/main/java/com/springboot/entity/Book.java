package com.springboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "book",schema = "public")
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer bookId;
	
	@Column(name = "name", nullable = false)
	private String bookName;
	
	@Column(name = "author", nullable = false)
	private String bookAuthor;
	
	@Column(name = "quantity", nullable = false)
	private Integer quantityOnHand;
	
	@Column(name = "price", nullable = false)
	private Double price;
	
	
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	
	public Integer getQuantityOnHand() {
		return quantityOnHand;
	}
	public void setQuantityOnHand(Integer quantityOnHand) {
		this.quantityOnHand = quantityOnHand;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(Integer bookId, String bookName, String bookAuthor, Integer quantityOnHand, Double price) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.quantityOnHand = quantityOnHand;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", quantityOnHand="
				+ quantityOnHand + ", price=" + price + "]";
	}
	public Book(String bookName, String bookAuthor, Integer quantityOnHand, Double price) {
		super();
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.quantityOnHand = quantityOnHand;
		this.price = price;
	}
	
	
	
	
}
