package com.example.demo.Services;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Author;
import com.example.demo.entities.Book;
import com.example.demo.entities.Theme;

@Service 
public class AuthorServices {
	private List<Author> authors = new ArrayList<Author>();
	
	public List<Author> getAllAuthors(){
		return authors;
	}
	
	public boolean addAuthor(Author anAuthor) {
		if (!authors.contains(anAuthor)) {
			authors.add(anAuthor);
			return true;
		}else {
			return false;
		}
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
