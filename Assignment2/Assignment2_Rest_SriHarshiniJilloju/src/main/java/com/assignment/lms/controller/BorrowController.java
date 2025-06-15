package com.assignment.lms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.lms.entity.Borrow;
import com.assignment.lms.entity.BorrowDto;
import com.assignment.lms.service.BorrowService;

@RestController
public class BorrowController {

	@Autowired
	BorrowService borrowService;
	
	@GetMapping("/get-borrows")
	public List<Borrow> getBorrows(){
		return borrowService.getBorrows();
	}
	
	@PostMapping("/save-borrow")
	public String saveBorrow(@RequestBody BorrowDto borrowDto) {
		return borrowService.saveBorrow(borrowDto);
	}
	
	@GetMapping("/get-borrow")
	public Borrow getBorrow(@RequestParam("id") Long id){
		return borrowService.getBorrow(id);
	}
}
