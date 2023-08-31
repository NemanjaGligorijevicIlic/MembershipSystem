package com.membershipsystem.membershipsystem.service;

import com.membershipsystem.membershipsystem.model.Member;
import com.membershipsystem.membershipsystem.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class MemberService {
    @Autowired
    MemberRepository memberRepository;

    @GetMapping
    public Member getMember(Long memberId){
        return memberRepository.findById(memberId).orElse(null);
    }

    @PostMapping
    public void addMember(@ModelAttribute("member") Member member){
        memberRepository.saveAndFlush(member);
    }

    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }

    @PostMapping
    public String updateMember(@ModelAttribute("member") Member member){
        memberRepository.save(member);
        return "frontPage/frontPage";
    }
}
