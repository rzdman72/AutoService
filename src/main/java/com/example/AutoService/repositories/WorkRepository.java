package com.example.AutoService.repositories;

import com.example.AutoService.entities.WorkCar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkRepository extends JpaRepository<WorkCar, Long> {
}
