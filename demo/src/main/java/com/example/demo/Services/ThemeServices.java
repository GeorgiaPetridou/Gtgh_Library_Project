package com.example.demo.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Book;
import com.example.demo.entities.Theme;

@Service 
public class ThemeServices {
	private List<Theme> themes = new ArrayList<Theme>();

	
	public List<Theme> getAllThemes(){
		return themes;
	}
	
	public boolean addTheme(Theme aTheme) {
		if (!themes.contains(aTheme)) {
			themes.add(aTheme);
			return true;
		}else {
			return false;
		}
		
	}

	public List<Theme> removeTheme(Integer id) {
		themes.removeIf(theme -> theme.getId() == id);
		return themes;
	}

	public List<Theme> updateTheme(int id, String newName, String newDescription) {
		for (Theme theme : themes) {
			if (theme.getId() == id) {
				if (newName != null)
					theme.setName(newName);
				if (newDescription != null)
					theme.setDescription(newDescription);
			}
		}
		return themes;
	}
}
