package com.assignment.lms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.lms.entity.Book;
import com.assignment.lms.entity.Borrow;
import com.assignment.lms.entity.BorrowDto;
import com.assignment.lms.entity.Member;
import com.assignment.lms.repository.BookRepository;
import com.assignment.lms.repository.BorrowRepository;
import com.assignment.lms.repository.MemberRepository;

@Service
public class BorrowService {

	@Autowired
	BorrowRepository borrowRepo;

	@Autowired
	BookRepository bookRepo;

	@Autowired
	MemberRepository memberRepo;

	public List<Borrow> getBorrows() {
		return borrowRepo.findAll();
	}

	public String saveBorrow(BorrowDto borrowDto) {
		Borrow borrow = getBorrowFromDto(borrowDto);
		borrowRepo.save(borrow);
		return "Borrow saved successfully";
	}

	private Borrow getBorrowFromDto(BorrowDto borrowDto) {
		Optional<Book> book = bookRepo.findById(borrowDto.getBook_id());
		Optional<Member> member = memberRepo.findById(borrowDto.getMember_id());
		return new Borrow(borrowDto.getDueDate(), borrowDto.getReturnDate(), borrowDto.getIssueDate(),
				book.isPresent() ? book.get() : null, member.isPresent() ? member.get() : null);
	}

	public Borrow getBorrow(Long id) {
		Optional<Borrow> borrow = borrowRepo.findById(id);
		return borrow.isPresent() ? borrow.get() : null;
	}

}
