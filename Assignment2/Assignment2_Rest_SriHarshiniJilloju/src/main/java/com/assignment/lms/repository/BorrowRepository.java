package com.assignment.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment.lms.entity.Borrow;

@Repository
public interface BorrowRepository extends JpaRepository<Borrow, Long>{

}
