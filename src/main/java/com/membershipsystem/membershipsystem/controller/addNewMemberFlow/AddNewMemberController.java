package com.membershipsystem.membershipsystem.controller.addNewMemberFlow;

import com.membershipsystem.membershipsystem.model.Member;
import com.membershipsystem.membershipsystem.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddNewMemberController {
    @Autowired
    MemberService memberService;

    @RequestMapping("sendToCheck")
    public ModelAndView checkForNewMember(@ModelAttribute("member") Member member){
        ModelAndView mav;

        if(AddNewMemberHelper.fieldsPopulated(member)) {
            mav = new ModelAndView("addMember/confirmNewMember");
            mav.addObject("member", member);
            return mav;
        } else {
            mav = new ModelAndView("addMember/memberAdd");
            mav.addObject("member", member);
            mav.addObject("errorMessage", "Both Firstname and Lastname are required.");
            return mav;
        }
    }

    @RequestMapping("goBackNewMember")
    public ModelAndView goBackToInputOfNewMember(@ModelAttribute("member") Member member){
        ModelAndView mav = new ModelAndView("addMember/memberAdd");
        mav.addObject("member", member);
        return mav;
    }

    @PostMapping("submitMember")
    public ModelAndView addNewMember(@ModelAttribute("member") Member member){
        ModelAndView mav = new ModelAndView("addMember/confirmation");
        member.setMemberId(AddNewMemberHelper.generateMemberId(memberService));
        memberService.addMember(member);
        mav.addObject(memberService.getMember(member.getMemberId()));
        return mav;
    }

    @RequestMapping("aa")
    public ModelAndView aaa(@ModelAttribute("member") Member member){
        ModelAndView mav = new ModelAndView("addMember/aa");
        mav.addObject("member", member);
        return mav;
    }


}
