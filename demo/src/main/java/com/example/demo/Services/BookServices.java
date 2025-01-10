package com.example.demo.Services;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repositories.BookRepository;
import com.example.demo.Repositories.ThemeRepository;
import com.example.demo.entities.Author;
import com.example.demo.entities.Book;
import com.example.demo.entities.Theme;

@Service 
public class BookServices {
	//private List<Book> books = new ArrayList<Book>();
	
	@Autowired BookRepository repository;
	
	@Autowired ThemeServices themeServices;
	
	public List<Book> getAllBooks(){
		return repository.findAll();
	}
	
	public boolean addBook(Book aBook) {
		if (!repository.existsById(aBook.getId())) {
			repository.save(aBook);
			return true;
		}else {
			return false;
		}
	}
	
	public List<Book> removeBook(Integer id) {
		//books.removeIf(book -> book.getId() == id);
		repository.deleteById(id);
		return repository.findAll();
	}
	
	public List<Book> updateBook(int id, String newTitle, String newDescription) {
		for ( Book book : repository.findAll()) {
			if(book.getId() == id) {
				if (newTitle != null)
					book.setTitle(newTitle);
				if (newDescription != null)
					book.setDescription(newDescription);
			}
		}
		return repository.findAll();
	}
	
	public void addTheme(Integer id, Integer themeId) {
		
		Optional<Book> book = repository.findById(id);
		if(book.isPresent()) {
			Book b = book.get();
			
		}
//		for ( Book book : repository.findAll()) {
//			if(book.getId() == id) {
//				for (Theme theme : book.getThemes().getAllThemes()) {
//					if (theme.getId() == themeId) {
//						if (book.getThemes().addTheme(theme)) {
//							System.out.println("the theme was added successfully");
//						}else {
//							System.out.println("the theme already existed");
//							
//						}
//					}
//				}
//			}
//		}
	}
	
}