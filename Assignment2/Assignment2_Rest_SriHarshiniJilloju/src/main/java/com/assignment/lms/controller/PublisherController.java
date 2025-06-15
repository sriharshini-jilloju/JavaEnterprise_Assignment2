package com.assignment.lms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.lms.entity.Publisher;
import com.assignment.lms.service.PublisherService;

@RestController
public class PublisherController {

	@Autowired
	PublisherService publisherService;

	@GetMapping("/get-publishers")
	public List<Publisher> getPublishers() {
		return publisherService.getPublishers();
	}

	@PostMapping("/save-publisher")
	public String savePublisher(@RequestBody Publisher publisher) {
		return publisherService.savePublisher(publisher);
	}
	
	@GetMapping("/get-publisher")
	public Publisher getPublisher(@RequestParam("id") Long id) {
		return publisherService.getPublisher(id);
	}
	
}
