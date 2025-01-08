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
	
	public void removeTheme(Theme aTheme) {
		themes.remove(aTheme);
	}
	
	public void updateTheme(Theme aTheme, String newDescription) {
		int i = themes.indexOf(aTheme);
		aTheme.setDescription(newDescription);
		themes.set(i, aTheme);
	}
}


