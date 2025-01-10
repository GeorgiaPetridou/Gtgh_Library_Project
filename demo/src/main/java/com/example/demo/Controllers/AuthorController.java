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

import com.example.demo.Services.AuthorServices;
import com.example.demo.entities.Author;


@RestController
@RequestMapping("authors")
public class AuthorController {
	@Autowired
	AuthorServices authorServices;

	@GetMapping("/AllAuthors")
	public List<Author> getAllAuthors(){
		return authorServices.getAllAuthors();
	}
	
	@PostMapping("/addAuthor")
	public boolean addAuthor(@RequestBody Author anAuthor) {
		return authorServices.addAuthor(anAuthor);
	}
	
	@DeleteMapping("/removeAuthor")
	public List<Author> removeAuthor(@RequestParam Integer id ){
		return authorServices.removeAuthor(id);
	}
	
	@PutMapping("/updateAuthor")
	public List<Author> updateAuthor(@RequestParam Integer id, String newFirstName){
		return authorServices.updateAuthor(id, newFirstName);
	}
	
}
