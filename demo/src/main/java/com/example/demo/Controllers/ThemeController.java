package com.example.demo.Controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Services.ThemeServices;
import com.example.demo.entities.Theme;

@RestController
@RequestMapping("themes")
public class ThemeController {
	
	@Autowired
	ThemeServices themeServices;
	
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello from the controller";
	}

	@GetMapping("/allThemes")
	public List<Theme> getAllThemes() {
		return themeServices.getAllThemes();
	}
	
	@PostMapping("/addTheme")
	public boolean addTheme(@RequestBody Theme theme) {
		return themeServices.addTheme(theme);
	}
	
	@DeleteMapping("/removeTheme")
	public List<Theme> removeTheme(@RequestParam Integer id){
		return themeServices.removeTheme(id);
	}
	
	@PutMapping("/updateTheme")
	public List<Theme> updateTheme(@RequestParam Integer id,String name, String description){
		return themeServices.updateTheme(id, name, description);
	}
}

