package com.assignment.lms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.lms.entity.Book;
import com.assignment.lms.entity.Publisher;
import com.assignment.lms.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	BookRepository bookRepo;

	public List<Book> getAllBooks() {
		return bookRepo.findAll();
	}

	public String saveBook(Book book) {
		bookRepo.save(book);
		return "Book saved successfully";
	}

	public Book getBook(Long id) {
		Optional<Book> book = bookRepo.findById(id);
		return book.isPresent() ? book.get() : null;
	}

}
