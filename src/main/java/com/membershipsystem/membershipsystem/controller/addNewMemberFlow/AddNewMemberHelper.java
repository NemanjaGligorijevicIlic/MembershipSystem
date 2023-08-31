package com.membershipsystem.membershipsystem.controller.addNewMemberFlow;

import com.membershipsystem.membershipsystem.model.Member;

public class AddNewMemberHelper {
    public static boolean fieldsPopulated(Member member) {
        return !member.getFirstName().isEmpty() && !member.getLastName().isEmpty();
    }
}
