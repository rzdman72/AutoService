package com.example.AutoService.controllers;

import com.example.AutoService.entities.Car;
import com.example.AutoService.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CarController {
    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String carPage(Model model) {
        List<Car> carList = carService.getAllCars();
        model.addAttribute( "cars", carList);
        return "cars";
    }
}
