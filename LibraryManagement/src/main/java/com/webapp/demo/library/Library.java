package com.webapp.demo.library;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Library {
	
	@Id
	private String bookId;
	private String NoOfBook;
	private String bookName;
	private String genre;
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getQuantity() {
		return NoOfBook;
	}
	public void setQuantity(String NoOfBook) {
		this.NoOfBook = NoOfBook;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
}