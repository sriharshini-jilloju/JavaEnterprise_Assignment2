package com.assignment.lms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.lms.entity.Publisher;
import com.assignment.lms.repository.PublisherRepository;

@Service
public class PublisherService {

	@Autowired
	PublisherRepository publisherRepo;

	public List<Publisher> getPublishers() {
		return publisherRepo.findAll();
	}

	public String savePublisher(Publisher publisher) {
		publisherRepo.save(publisher);
		return "Publisher saved successfully";
	}

	public Publisher getPublisher(Long id) {
		Optional<Publisher> publisher = publisherRepo.findById(id);
		return publisher.isPresent() ? publisher.get() : null;
	}

}
