package com.membershipsystem.membershipsystem.controller;

import com.membershipsystem.membershipsystem.model.Member;
import com.membershipsystem.membershipsystem.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MemberController {
    @Autowired
    MemberService memberService;

    @RequestMapping("memberShow")
    public ModelAndView memberShowTableInfo(@ModelAttribute ("member")Member member){
        ModelAndView mav = new ModelAndView("/showMemberTable");
        Member m = memberService.getMember(member.getMemberId());
        mav.addObject("member", m);
        return mav;
        //return "showMemberTable";
    }

    @RequestMapping("showAllMember")
    public ModelAndView allMembers() {
        ModelAndView mav = new ModelAndView("/allMembers");
        List<Member> members = memberService.getAllMembers();
        mav.addObject("members", members);
        return mav;
    }

    @RequestMapping("findMemberByIdPage")
    public ModelAndView findMemberById(@ModelAttribute ("member")Member member){
        Member m = null;
        ModelAndView mav;

        if(member.getMemberId() != null) {
            m = memberService.getMember(member.getMemberId());
        } else {
            mav = new ModelAndView("findMember");
            mav.addObject("errorMessage", "Member ID can not be empty. Your need to provide it!");
            return mav;
        }

        if (m == null) {
            mav = new ModelAndView("findMember");
            mav.addObject("errorMessage", "Member not found");
        } else {
            mav = new ModelAndView("updateMember");
            mav.addObject("member", m);
        }

        return mav;
    }

    @RequestMapping("saveUpdatedMember")
    public ModelAndView saveUpdatedMember(@ModelAttribute("member") Member member) {
        ModelAndView mav = new ModelAndView("updateReceipt");
        mav.addObject("member", member);
        memberService.updateMember(member);
        return mav;
    }
}
