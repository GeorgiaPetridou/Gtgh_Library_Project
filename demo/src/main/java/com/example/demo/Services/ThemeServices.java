package com.example.demo.Services;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.entities.Book;
import com.example.demo.entities.Theme;

public class ThemeServices {
	private List<Theme> themes = new ArrayList<Theme>();
	
	public void addTheme(Theme aTheme) {
		themes.add(aTheme);
	}
	
	public List<Theme> removeTheme(Integer id) {
		themes.removeIf(theme -> theme.getId() == id);
		return themes;
	}
	
	public List<Theme> updateTheme(int id, String newName, String newDescription) {
		for ( Theme theme : themes) {
			if(theme.getId() == id) {
				if (newName != null)
					theme.setName(newName);
				if (newDescription != null)
					theme.setDescription(newDescription);
			}
		}
		return themes;
	}
	
}
