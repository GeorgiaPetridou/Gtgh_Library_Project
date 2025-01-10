package com.example.demo.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.example.demo.Repositories.ThemeRepository;
import com.example.demo.entities.Book;
import com.example.demo.entities.Theme;

@Service 
public class ThemeServices {
	//private List<Theme> themes = new ArrayList<Theme>();
	
	@Autowired ThemeRepository repository;
	
	public List<Theme> getAllThemes(){
		return repository.findAll();
	}
	
	public boolean addTheme(Theme aTheme) {
		if (!repository.existsById(aTheme.getId())) {
			repository.save(aTheme);
			return true;
		}else {
			return false;
		}
		
	}

	public List<Theme> removeTheme(Integer id) {
		//themes.removeIf(theme -> theme.getId() == id);
		repository.deleteById(id);
		return repository.findAll();
	}

	public List<Theme> updateTheme(int id, String newName, String newDescription) {
		for (Theme theme : repository.findAll()) {
			if (theme.getId() == id) {
				if (newName != null)
					theme.setName(newName);
				if (newDescription != null)
					theme.setDescription(newDescription);
			}
		}
		return repository.findAll();
	}
}
