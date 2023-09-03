package com.membershipsystem.membershipsystem.repository;

import com.membershipsystem.membershipsystem.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
