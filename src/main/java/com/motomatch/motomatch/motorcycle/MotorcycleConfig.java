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
                    "Harley Davidson Road King",
                       668,
                       1753,
                       80,
                       360,
                       2,
                       24000,
                       20000,
                       "Cruiser",
                       "A"
            );

            Motorcycle indian = new Motorcycle(
                    "Indian Dark Horse",
                    650,
                    1890,
                    79,
                    373,
                    3,
                    27600,
                    21000,
                    "Cruiser",
                    "A"

            );

            Motorcycle triumph = new Motorcycle(
                    "Triumph Bonneville T100",
                    790,
                    900,
                    65,
                    228,
                    1,
                    12150,
                    9000,
                    "Old School",
                    "A2"
            );

            Motorcycle triumph1 = new Motorcycle(
                    "Triumph Bonneville T120",
                    790,
                    1200,
                    80,
                    236,
                    2,
                    12000,
                    9500,
                    "Old School",
                    "A"
            );

            Motorcycle bmw = new Motorcycle(
                    "BMW GS 850 Adventure",
                    875,
                    853,
                    95,
                    258,
                    2,
                    12000,
                    10000,
                    "Adventure",
                    "A"
            );

            Motorcycle honda = new Motorcycle(
                    "Honda CB500x",
                    830,
                    471,
                    47,
                    197,
                    1,
                    6630,
                    4000,
                    "Adventure",
                    "A2"
            );

            Motorcycle yamaha = new Motorcycle(
                    "Yamaha MT03",
                    780,
                    321,
                    42,
                    168,
                    1,
                    5530,
                    3000,
                    "Naked",
                    "A2"
            );

            Motorcycle triumph2 = new Motorcycle(
                    "Triumph Speed Triple RS",
                    830,
                    1160,
                    180,
                    198,
                    3,
                    16600,
                    14000,
                    "Naked",
                    "A"

            );

            Motorcycle bmwSport = new Motorcycle(
                    "BMW S1000RR",
                    800,
                    1000,
                    200,
                    199,
                    3,
                    20000,
                    18000,
                    "Sport",
                    "A"
            );

            Motorcycle yamahaSport = new Motorcycle(
                    "Yamaha R1",
                    780,
                    1000,
                    220,
                    230,
                    3,
                    18000,
                    15000,
                    "Sport",
                    "A"
            );

            Motorcycle junak = new Motorcycle(
                    "Junak M12 125 Vintage",
                    730,
                    125,
                    10,
                    150,
                    1,
                    3000,
                    2000,
                    "Small",
                    "A1"
            );

            Motorcycle smallBike = new Motorcycle(
                    "Small Bike 125",
                    500,
                    125,
                    11,
                    140,
                    1,
                    2000,
                    1500,
                    "Small",
                    "A1"
            );


            motorcycleRepository.saveAll(List.of(harley, triumph, triumph1, indian,
                                        bmw, honda, yamaha, triumph2, bmwSport, yamahaSport,
                                        junak, smallBike));
        };
    }

}
