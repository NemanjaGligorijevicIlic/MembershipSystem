package com.membershipsystem.membershipsystem.controller.addNewMemberFlow;

import com.membershipsystem.membershipsystem.model.Member;
import com.membershipsystem.membershipsystem.service.MemberService;

import java.util.concurrent.ThreadLocalRandom;

public class AddNewMemberHelper {
    public static boolean fieldsPopulated(Member member) {
        return !member.getFirstName().isEmpty() && !member.getLastName().isEmpty();
    }

    public static Long generateMemberId(MemberService memberService) {
        Long id;
        while(true){
            id = generateCustomId();
            if(!existsMemberWithThatId(memberService, id)) {
                break;
            }
        }
        return id;
    }

    private static boolean existsMemberWithThatId(MemberService memberService, Long id) {
        return memberService.getMember(id) != null;
    }

    private static Long generateCustomId() {
        Long memberId;
        long maxIdValue = 9999999L; // Maximum value of a 7-digit ID
        long minIdValue = 1000000L; // Minimum value of a 7-digit ID
        return memberId = ThreadLocalRandom.current().nextLong(minIdValue, maxIdValue + 1);
    }
}
