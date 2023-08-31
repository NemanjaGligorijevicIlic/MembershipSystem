package com.membershipsystem.membershipsystem.model;

import jakarta.persistence.*;

import java.util.concurrent.ThreadLocalRandom;

@Entity(name="Member")
public class Member {
    @Id
    private Long memberId;
    private String firstName;
    private String lastName;
    private String description;

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
