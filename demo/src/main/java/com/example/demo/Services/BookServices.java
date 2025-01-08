package com.example.demo.Services;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.entities.Author;
import com.example.demo.entities.Book;
import com.example.demo.entities.Theme;

public class BookServices {
	private List<Book> books = new ArrayList<Book>();
	
	public void addBook(Book aBook) {
		books.add(aBook);
	}
	
	public List<Book> removeBook(Integer id) {
		books.removeIf(book -> book.getId() == id);
		return books;
	}
	
	public List<Book> updateTheme(int id, String newTitle, String newDescription) {
		for ( Book book : books) {
			if(book.getId() == id) {
				if (newTitle != null)
					book.setTitle(newTitle);
				if (newDescription != null)
					book.setDescription(newDescription);
			}
		}
		return books;
	}
	
	public void addAuthor(Integer id) {
		
	}
}
