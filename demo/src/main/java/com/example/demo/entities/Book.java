package com.example.demo.entities;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.Services.ThemeServices;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "books")
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "book_id", nullable = false)
	private Integer id;
	
	@Column(name = "title", nullable = false)
	private String title;
	private Author author;
	
	@Column(name = "publisher", nullable = false)
	private String publisher;
	
	@Column(name = "publishedYear", nullable = false)
	private String publishedYear;
	
	@Column(name = "description", nullable = true)
	private String description;
	private ThemeServices themes;
	
//	@ManytoMany(mappedBy = "books")
//	@JsonIgnore
//	private Set<Theme> themes;
	
	public Book(int id, String title, Author author, String publisher, String publishedYear, String description) {
		//super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.publishedYear = publishedYear;
		this.description = description;
		
		this.themes = new ThemeServices();
	}
	public Integer getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getPublishedYear() {
		return publishedYear;
	}
	public void setPublishedYear(String publishedYear) {
		this.publishedYear = publishedYear;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public ThemeServices getThemes() {
		return themes;
	}
	public void setThemes(ThemeServices themes) {
		this.themes = themes;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", publisher=" + publisher + ", publishedYear="
				+ publishedYear + ", description=" + description + ", themes=" + themes + "]";
	}
	
}
