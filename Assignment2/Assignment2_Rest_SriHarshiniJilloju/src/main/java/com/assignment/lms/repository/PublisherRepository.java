package com.assignment.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment.lms.entity.Publisher;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Long> {

}
