package com.example.AutoService.services;

import com.example.AutoService.entities.Car;
import com.example.AutoService.repositories.CarRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CarServiceImpl implements CarService{
    private final CarRepository carRepository;

    public CarServiceImpl(CarRepository carRepository) { this.carRepository = carRepository; }

    @Override
    public List<Car> getAllCars() { return carRepository.findAll(); }

    @Override
    @Transactional(readOnly = true)
    public Optional<Car> getCarById(long id) {
        return carRepository.findById(id);
    }
}
