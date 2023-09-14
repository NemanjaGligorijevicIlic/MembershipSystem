package com.membershipsystem.membershipsystem.controller.addNewCarFlow;

import com.membershipsystem.membershipsystem.model.Car;
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

    @RequestMapping("findMemberByIdInput")
    public ModelAndView inputMemberId(@ModelAttribute("member") Member member){
        ModelAndView mav = new ModelAndView("addNewCar/findMember");
        mav.addObject("member", member);
        return mav;
    }

    @RequestMapping("findMemberById")
    public ModelAndView findMemberById(@ModelAttribute("member") Member member, Car car){
        Member m = null;
        ModelAndView mav;

        if(member.getMemberId() != null) {
            m = memberService.getMember(member.getMemberId());
        } else {
            mav = new ModelAndView("addNewCar/findMember");
            mav.addObject("errorMessage", "Member ID can not be empty. Your need to provide it!");
            return mav;
        }

        if (m == null) {
            mav = new ModelAndView("addNewCar/findMember");
            mav.addObject("errorMessage", "Member not found");
        } else {
            mav = new ModelAndView("addNewCar/addCarInput");
            mav.addObject("member", m);
            mav.addObject("car", car);
        }

        return mav;
    }

    @RequestMapping("checkForCar")
    public ModelAndView checkForCar(@ModelAttribute("car")Member member, Car car){
        ModelAndView mav = null;

        return mav;
    }
}
