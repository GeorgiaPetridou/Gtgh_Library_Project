package com.example.demo.Services;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.entities.Author;

public class AuthorServices {
	private List<Author> authors = new ArrayList<Author>();
	
	public void addAuthor(Author anAuthor) {
		authors.add(anAuthor);
	}
	
	public void removeAuthor(Author anAuthor) {
		authors.remove(anAuthor);
	}
	
	
}

