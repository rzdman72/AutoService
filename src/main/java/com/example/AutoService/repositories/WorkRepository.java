package com.example.AutoService.repositories;

import com.example.AutoService.entities.Work_car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkRepository extends JpaRepository<Work_car, Long> {
}
