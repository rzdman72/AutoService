package com.example.AutoService.services;

import com.example.AutoService.entities.WorkCar;
import com.example.AutoService.repositories.WorkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class WorkServiceImpl implements WorkService{
    private final WorkRepository workRepository;

    @Autowired
    public WorkServiceImpl(WorkRepository workRepository) { this.workRepository = workRepository; }

    @Override
    public List<WorkCar> getAllWorks() { return workRepository.findAll(); }

    @Override
    @Transactional(readOnly = true)
    public Optional<WorkCar> getWorkById(long id) {
        return workRepository.findById(id);
    }

    @Override
    @Transactional
    public WorkCar createWorkCar(WorkCar workCar) {
        return workRepository.save(workCar);
    }

    @Override
    @Transactional
    public void updateWorkCar(WorkCar workCar) { workRepository.save(workCar); }

    @Override
    @Transactional
    public void deleteWorkCar(WorkCar workCar) { workRepository.delete(workCar); }
}
