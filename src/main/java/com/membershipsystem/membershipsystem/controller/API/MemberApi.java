package com.membershipsystem.membershipsystem.controller.API;

import com.membershipsystem.membershipsystem.AWSLambda.LambdaInvoker;
import com.membershipsystem.membershipsystem.model.Member;
import com.membershipsystem.membershipsystem.repository.MemberRepository;
import com.membershipsystem.membershipsystem.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/members")
public class MemberApi {
    @Autowired
    MemberRepository memberRepository;

    @GetMapping
    @RequestMapping("{id}")
    public Member get(@PathVariable Long id){
        LambdaInvoker.invokeLambdaFunction(id);
        return memberRepository.findById(id).get();
    }
}
