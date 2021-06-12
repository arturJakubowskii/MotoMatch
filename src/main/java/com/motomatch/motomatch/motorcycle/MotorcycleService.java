package com.motomatch.motomatch.motorcycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MotorcycleService {

    MotorcycleRepository motorcycleRepository;

    @Autowired
    public MotorcycleService(MotorcycleRepository motorcycleRepository) {
        this.motorcycleRepository = motorcycleRepository;
    }

    public List<Motorcycle> getAll() {
        return motorcycleRepository.findAll();
    }
}
