package com.motomatch.motomatch.motorcycle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/mm/motorcycle")
public class MotorcycleController {

    MotorcycleService motorcycleService;

    public MotorcycleController(MotorcycleService motorcycleService) {
        this.motorcycleService = motorcycleService;
    }

//    @GetMapping
//    public List<Motorcycle> getMotorcycles(){
//        return motorcycleService.getAll();
//    }

    @GetMapping
    public List<Motorcycle> getMotorcyclesByDrivingLicense(String license){
        return motorcycleService.getMotorcyclesByDrivingLicense(license);
    }


}
