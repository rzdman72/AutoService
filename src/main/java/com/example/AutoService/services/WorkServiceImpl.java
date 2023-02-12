package com.example.AutoService.services;

import com.example.AutoService.entities.Work_car;
import com.example.AutoService.repositories.WorkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkServiceImpl implements WorkService{
    private final WorkRepository workRepository;
    @Autowired
    public WorkServiceImpl(WorkRepository workRepository) { this.workRepository = workRepository; }

    @Override
    public List<Work_car> getAllWorks() { return workRepository.findAll(); }
}
