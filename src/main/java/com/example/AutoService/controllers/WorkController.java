package com.example.AutoService.controllers;

import com.example.AutoService.entities.Car;
import com.example.AutoService.entities.WorkCar;
import com.example.AutoService.services.WorkService;
import org.hibernate.jdbc.Work;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class WorkController {
    public final WorkService workService;
    @Autowired
    public WorkController(WorkService workService) {
        this.workService = workService;
    }

    @GetMapping("/works")
    public String workPage(Model model) {
        List<WorkCar> workList = workService.getAllWorks();
        model.addAttribute("works", workList);
        return "works";
    }
}