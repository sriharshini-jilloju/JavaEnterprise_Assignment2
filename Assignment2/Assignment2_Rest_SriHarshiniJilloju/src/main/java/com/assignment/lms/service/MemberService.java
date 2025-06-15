package com.assignment.lms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.lms.entity.Member;
import com.assignment.lms.repository.MemberRepository;

@Service
public class MemberService {

	@Autowired
	MemberRepository memberRepo;

	public List<Member> getMembers() {
		return memberRepo.findAll();
	}

	public String saveMember(Member member) {
		memberRepo.save(member);
		return "Member saved sucessfully";
	}

	public Member getMember(Long id) {
		Optional<Member> member = memberRepo.findById(id);
		return member.isPresent() ? member.get() : null;
	}

}
