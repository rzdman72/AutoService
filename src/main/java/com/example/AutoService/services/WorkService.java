package com.example.AutoService.services;

import com.example.AutoService.entities.WorkCar;

import java.util.List;
import java.util.Optional;

public interface WorkService {
    List<WorkCar> getAllWorks();

    Optional<WorkCar> getWorkById(long id);

    WorkCar createWorkCar(WorkCar workCar);

    void updateWorkCar(WorkCar workCar);

    void deleteWorkCar(WorkCar workCar);
}


