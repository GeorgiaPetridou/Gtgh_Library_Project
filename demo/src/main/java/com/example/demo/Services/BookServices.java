package com.example.demo.Services;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Author;
import com.example.demo.entities.Book;
import com.example.demo.entities.Theme;

@Service 
public class BookServices {
	private List<Book> books = new ArrayList<Book>();
	
	@Autowired
	ThemeServices themeServices;
	
	public List<Book> getAllBooks(){
		return books;
	}
	
	public boolean addBook(Book aBook) {
		if (!books.contains(aBook)) {
			books.add(aBook);
			return true;
		}else {
			return false;
		}
	}
	
	public List<Book> removeBook(Integer id) {
		books.removeIf(book -> book.getId() == id);
		return books;
	}
	
	public List<Book> updateBook(int id, String newTitle, String newDescription) {
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
	
	public void addTheme(Integer id, Integer themeId) {
		for ( Book book : books) {
			if(book.getId() == id) {
				for (Theme theme : book.getThemes().getAllThemes()) {
					if (theme.getId() == themeId) {
						if (book.getThemes().addTheme(theme)) {
							System.out.println("the theme was added successfully");
						}else {
							System.out.println("the theme already existed");
							
						}
					}
				}
			}
		}
	}
	
}