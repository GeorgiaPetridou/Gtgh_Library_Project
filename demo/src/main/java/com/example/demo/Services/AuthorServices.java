package com.example.demo.Services;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repositories.AuthorRepository;
import com.example.demo.Repositories.ThemeRepository;
import com.example.demo.entities.Author;
import com.example.demo.entities.Book;
import com.example.demo.entities.Theme;

@Service 
public class AuthorServices {
	//private List<Author> authors = new ArrayList<Author>();
	
	@Autowired AuthorRepository repository;
	
	public List<Author> getAllAuthors(){
		return repository.findAll();
	}
	
	public boolean addAuthor(Author anAuthor) {
		if (!repository.existsById(anAuthor.getId())) {
			repository.save(anAuthor);
			return true;
		}else {
			return false;
		}
	}
	
	public List<Author> removeAuthor(Integer id) {
		//authors.removeIf(author -> author.getId() == id);
		repository.deleteById(id);
		return repository.findAll();
	}
	
	public List<Author> updateAuthor(int id, String newFirstName) {
		for ( Author author : repository.findAll()) {
			if(author.getId() == id) {
				if (newFirstName != null)
					author.setFirstName(newFirstName);
			}
		}
		return repository.findAll();
	}
}
