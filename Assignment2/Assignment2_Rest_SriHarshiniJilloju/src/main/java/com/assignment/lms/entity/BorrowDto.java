package com.assignment.lms.entity;

import java.util.Date;

public class BorrowDto {
	
	private Date dueDate;
	private Date returnDate;
	private Date issueDate;
	private Long member_id;
	private Long book_id;
	
	public BorrowDto() {
		super();
	}

	public BorrowDto(Date dueDate, Date returnDate, Date issueDate, Long member_id, Long book_id) {
		super();
		this.dueDate = dueDate;
		this.returnDate = returnDate;
		this.issueDate = issueDate;
		this.member_id = member_id;
		this.book_id = book_id;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public Long getMember_id() {
		return member_id;
	}

	public void setMember_id(Long member_id) {
		this.member_id = member_id;
	}

	public Long getBook_id() {
		return book_id;
	}

	public void setBook_id(Long book_id) {
		this.book_id = book_id;
	}
	
	
	
}
