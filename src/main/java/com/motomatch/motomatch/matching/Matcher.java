package com.motomatch.motomatch.matching;

import com.motomatch.motomatch.motorcycle.Motorcycle;
import com.motomatch.motomatch.motorcycle.MotorcycleController;
import com.motomatch.motomatch.rider.Rider;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Matcher {

    Rider rider;
    MotorcycleController motorcycleController;

    private List<Motorcycle> motorcyclesForMatch;

    public Matcher(Rider rider, MotorcycleController motorcycleController) {
        this.rider = rider;
        this.motorcycleController = motorcycleController;
    }


    private void addToMatchingList(List<Motorcycle> motorcycles){
        motorcyclesForMatch.addAll(motorcycles);
    }

    private void motorcyclesByDrivingLicenseType(){

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


}
