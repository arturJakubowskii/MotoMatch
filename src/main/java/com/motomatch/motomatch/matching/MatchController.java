package com.motomatch.motomatch.matching;

import com.motomatch.motomatch.motorcycle.Motorcycle;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/mm/match")
public class MatchController {

    MatchService matchService;

    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }

    @GetMapping
    public List<Motorcycle> getMatchedMotorcycles(){
        return matchService.getMatchedMotorcycles();
    }
}
