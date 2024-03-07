package com.membershipsystem.membershipsystem.controller.addNewCarFlow;

import com.membershipsystem.membershipsystem.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.ThreadLocalRandom;

public class AddNewCarHelper {
    public boolean carExists(String registrationNumber, CarService carService){
        return carService.getCar(registrationNumber) != null;
    }

    public Long generateCarId(CarService carService) {
        Long carId = generateCustomId();
        while(idExists(carId, carService)){
            carId = generateCustomId();
        }
        return carId;
    }

    private boolean idExists(Long carId, CarService carService) {
        return carService.getCar(carId) != null;
    }

    private static Long generateCustomId() {
        Long memberId;
        long maxIdValue = 9999999L; // Maximum value of a 7-digit ID
        long minIdValue = 1000000L; // Minimum value of a 7-digit ID
        memberId = ThreadLocalRandom.current().nextLong(minIdValue, maxIdValue + 1);
        return memberId;
    }
}
