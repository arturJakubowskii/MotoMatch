package com.motomatch.motomatch.matching;

import com.motomatch.motomatch.motorcycle.Motorcycle;
import com.motomatch.motomatch.motorcycle.MotorcycleController;
import com.motomatch.motomatch.rider.RiderController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchService {

    Matcher matcher;
    RiderController riderController;
    MotorcycleController motorcycleController;

    @Autowired
    public MatchService(Matcher matcher,
                        RiderController riderController,
                        MotorcycleController motorcycleController) {
        this.matcher = matcher;
        this.riderController = riderController;
        this.motorcycleController = motorcycleController;
    }


        public List<Motorcycle> getMatchedMotorcycles() {
        Matcher matcher = new Matcher(riderController.getRider(), motorcycleController);
        return matcher.getMotorcyclesForMatch();
    }




}
