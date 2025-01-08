package com.example.demo.Services;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.entities.Author;
import com.example.demo.entities.Book;

public class BookServices {
	private List<Book> books = new ArrayList<Book>();
	
	public void addBook(Book aBook) {
		books.add(aBook);
	}
	
	public void removeBook(Book aBook) {
		books.remove(aBook);
	}
	
	public void updateBook(Book aBook, String newDescription) {
		int i = books.indexOf(aBook);
		aBook.setDescription(newDescription);
		books.set(i, aBook);
	}
}
