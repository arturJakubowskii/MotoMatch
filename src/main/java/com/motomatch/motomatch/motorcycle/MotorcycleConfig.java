package com.motomatch.motomatch.motorcycle;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class MotorcycleConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            MotorcycleRepository motorcycleRepository){
        return args -> {
            Motorcycle harley = new Motorcycle(
                    "Harley Davidson",
                       100,
                       1800,
                       80,
                       250,
                       2,
                       20000,
                       15000,
                       "Cruiser",
                       "A"
            );
            Motorcycle triumph = new Motorcycle(
                    "Triumph",
                    80,
                    900,
                    65,
                    200,
                    1,
                    15000,
                    9000,
                    "Old School",
                    "A2"
            );
            motorcycleRepository.saveAll(List.of(harley, triumph));
        };
    }

}
