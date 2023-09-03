package com.membershipsystem.membershipsystem.service;

import com.membershipsystem.membershipsystem.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {
    @Autowired
    CarRepository carRepository;


}
