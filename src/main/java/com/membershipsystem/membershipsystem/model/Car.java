package com.membershipsystem.membershipsystem.model;

import jakarta.persistence.*;

@Entity(name="Car")
public class Car {
    @Id
    private Long carId;
    private String registration;
    private String model;
    private String year;
    private String description;

    @ManyToOne
    @JoinColumn(name="memberId")
    private Member member;

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public void setRegistration(String registration){
        this.registration = registration;
    }

    public String getRegistration(){
        return registration;
    }
}
