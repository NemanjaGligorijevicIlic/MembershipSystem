package com.membershipsystem.membershipsystem.controller;

import com.membershipsystem.membershipsystem.model.Member;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class BaseFlowController {

    @GetMapping("goToFirstPage")
    public String goToFirstPage(){
        return "frontPage/frontPage";
    }

    @GetMapping("memberAdd")
    public String memberAdd(@ModelAttribute ("member")Member member){
        return "addMember/memberAdd";
    }

    @GetMapping("memberShow")
    public String memberShow(@ModelAttribute("member") Member member){
        return "memberShow";
    }

    @GetMapping("findMemberByIdPage")
    public String findMemberByIdPage(@ModelAttribute ("member")Member member){
        return "findMember";
    }
}
