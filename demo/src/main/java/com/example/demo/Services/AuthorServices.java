package com.example.demo.Services;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.entities.Author;
import com.example.demo.entities.Book;

public class AuthorServices {
	private List<Author> authors = new ArrayList<Author>();
	
	public void addAuthor(Author anAuthor) {
		authors.add(anAuthor);
	}
	
	public List<Author> removeAuthor(Integer id) {
		authors.removeIf(author -> author.getId() == id);
		return authors;
	}
	
	public List<Author> updateAuthor(int id, String newFirstName) {
		for ( Author author : authors) {
			if(author.getId() == id) {
				if (newFirstName != null)
					author.setFirstName(newFirstName);
			}
		}
		return authors;
	}
}
