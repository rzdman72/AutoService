package com.example.AutoService.services;

import com.example.AutoService.entities.Car;

import java.util.List;
import java.util.Optional;

public interface CarService {
    List<Car> getAllCars();

    Optional<Car> getCarById(long id);
}
