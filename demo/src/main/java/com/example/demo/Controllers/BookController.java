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

import com.example.demo.Services.BookServices;
import com.example.demo.entities.Book;

@RestController
@RequestMapping("books")
public class BookController {
	@Autowired
	BookServices bookServices;

	@GetMapping("/AllBooks")
	public List<Book> getAllBooks(){
		return bookServices.getAllBooks();
	}
	
	@PostMapping("/addBook")
	public boolean addBook(@RequestBody Book aBook) {
		return bookServices.addBook(aBook);
	}
	
	@DeleteMapping("/removeBook")
	public List<Book> removeBook(@RequestParam Integer id ){
		return bookServices.removeBook(id);
	}
	
	@PutMapping("/updateBook")
	public List<Book> updateBook(@RequestParam Integer id, String newTitle, String newDescription){
		return bookServices.updateBook(id, newTitle, newDescription);
	}
	
	@PostMapping("/addTheme")
	public void addTheme(@RequestParam Integer id,@RequestParam Integer themeId) {
		bookServices.addTheme(id, themeId);
	}
}


