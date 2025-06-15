package com.assignment.lms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.lms.entity.Book;
import com.assignment.lms.service.BookService;

@RestController
public class BookController {

	@Autowired
	BookService bookService;

	@GetMapping("/get-books")
	public List<Book> getBooks() {
		return bookService.getAllBooks();
	}

	@PostMapping("/save-book")
	public String saveBook(@RequestBody Book book) {
		return bookService.saveBook(book);
	}

	@GetMapping("/get-book")
	public Book getBook(@RequestParam("id") Long id) {
		return bookService.getBook(id);
	}

}