package com.membershipsystem.membershipsystem.controller.addNewCarFlow;

import com.membershipsystem.membershipsystem.model.Member;
import com.membershipsystem.membershipsystem.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddNewCarController {
    @Autowired
    MemberService memberService;

    @RequestMapping("addNewCar")
    public String addNewCar(){
        return "addNewCar/createOrFindMember";
    }

    @RequestMapping("findMemberById")
    public ModelAndView findMemberById(@ModelAttribute("member") Member member){
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
}
