package com.membershipsystem.membershipsystem.service;

import com.membershipsystem.membershipsystem.model.Car;
import com.membershipsystem.membershipsystem.model.Member;
import com.membershipsystem.membershipsystem.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    @Autowired
    CarRepository carRepository;

    @GetMapping
    public Car getCar(Long carId){
        return carRepository.findById(carId).orElse(null);
    }
    @GetMapping
    public Car getCar(String registrationNumber){
        List<Car> allCars;
        allCars = carRepository.findAll();
        for(Car car : allCars){
           if(carFound(registrationNumber, car)){
               return car;
           }
        }
        return null;
    }

    @PostMapping
    public void addCar(@ModelAttribute("car") Car car){
        carRepository.saveAndFlush(car);
    }

    private boolean carFound(String registrationNumber, Car car) {
        return car.getRegistration().equals(registrationNumber);
    }
}
