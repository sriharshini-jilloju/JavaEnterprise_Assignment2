package com.assignment.lms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.lms.entity.Member;
import com.assignment.lms.service.MemberService;

@RestController
public class MemberController {

	@Autowired
	MemberService memberService;

	@GetMapping("/get-members")
	public List<Member> getMembers() {
		return memberService.getMembers();
	}

	@PostMapping("/save-member")
	public String saveMember(@RequestBody Member member) {
		return memberService.saveMember(member);
	}

	@GetMapping("/get-member")
	public Member getMember(@RequestParam("id") Long id) {
		return memberService.getMember(id);
	}

}
