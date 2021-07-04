package com.motomatch.motomatch.matching;

import com.motomatch.motomatch.motorcycle.Motorcycle;
import com.motomatch.motomatch.motorcycle.MotorcycleController;
import com.motomatch.motomatch.rider.RiderController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchService {

    Match match;
    RiderController riderController;
    MotorcycleController motorcycleController;

    @Autowired
    public MatchService(Match match,
                        RiderController riderController,
                        MotorcycleController motorcycleController) {
        this.match = match;
        this.riderController = riderController;
        this.motorcycleController = motorcycleController;
    }


        public List<Motorcycle> getMatchedMotorcycles() {
        Match match = new Match(riderController.getRider(), motorcycleController);
        return match.getMotorcyclesForMatch();
    }




}
