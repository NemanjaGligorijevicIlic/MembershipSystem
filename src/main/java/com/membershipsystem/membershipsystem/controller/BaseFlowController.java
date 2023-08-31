package com.membershipsystem.membershipsystem.controller;

import com.membershipsystem.membershipsystem.model.Member;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BaseFlowController {

    @RequestMapping("goToFirstPage")
    public String goToFirstPage(){
        return "frontPage/frontPage";
    }
    @RequestMapping("memberAdd")
    public ModelAndView memberAdd(@ModelAttribute ("member")Member member){
        ModelAndView mav = new ModelAndView("addMember/memberAdd");
        mav.addObject("errorMessage", null);
        return mav;
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
