package com.motomatch.motomatch.matching;

import com.motomatch.motomatch.motorcycle.Motorcycle;
import com.motomatch.motomatch.motorcycle.MotorcycleController;
import com.motomatch.motomatch.rider.Rider;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class Match {

    Rider rider;
    MotorcycleController motorcycleController;

    private List<Motorcycle> motorcyclesForMatch = new ArrayList<>(); // Main List that stores motorcycles for filtering
                                                    // according to Rider needs

    public Match(Rider rider, MotorcycleController motorcycleController) {
        this.rider = rider;
        this.motorcycleController = motorcycleController;
    }


    private void addToMatchingList(List<Motorcycle> motorcycles){
        motorcyclesForMatch.addAll(motorcycles);
        //test();
    }

    private void test() {
        for (Motorcycle motorcycle : motorcyclesForMatch){
            System.out.println(motorcycle);
        }
    }

    private void matchByDrivingLicense(){

        DrivingLicense drivingLicense = DrivingLicense
                .valueOf(rider.getDriverLicenseType());

        switch (drivingLicense){
            case A:
                addToMatchingList(motorcycleController
                        .getMotorcyclesByDrivingLicense("A"));
                break;

            case A1:
                addToMatchingList(motorcycleController
                        .getMotorcyclesByDrivingLicense("A1"));
                break;

            case A2:
                addToMatchingList(motorcycleController
                        .getMotorcyclesByDrivingLicense("A2"));
                break;
        }

    }

    private void  matchByRidingExperience(){
        Integer riderExperience = rider.getRidingExperience();
        matchByDrivingLicense();

        if (riderExperience == 1){
            getMotorcyclesByExperience(2);
        }
        else if (riderExperience == 2){
            getMotorcyclesByExperience(3);
        }
    }

    private void getMotorcyclesByExperience(Integer experience) {
        motorcyclesForMatch.removeIf(
                motorcycle -> motorcycle.getRidingExperienceLevel()
                        .equals(experience));
    }


    private void matchByType(){
        matchByRidingExperience();
        motorcyclesForMatch.removeIf(
                motorcycle -> !motorcycle.getMotorcycleType()
                        .equals(rider.getMotorcycleType()));
    }


    private void matchByPrice(){
        matchByType();
        Integer riderPrice = rider.getPrice();
        motorcyclesForMatch.removeIf(motorcycle -> motorcycle.getPriceForUsed() > riderPrice);
    }


    private void runMatching(){
        matchByPrice();
    }

    public List<Motorcycle> getMotorcyclesForMatch() {
        runMatching();
        return motorcyclesForMatch;
    }
}
