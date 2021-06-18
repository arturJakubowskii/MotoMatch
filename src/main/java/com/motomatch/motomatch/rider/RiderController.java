package com.motomatch.motomatch.rider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/mm/rider")
public class RiderController {


    private final RiderService riderService;

    @Autowired
    public RiderController(RiderService riderService) {
        this.riderService = riderService;
    }

    @PostMapping
    public void postRider(@RequestBody Rider rider){
         riderService.postRider(rider);
    }

    @GetMapping
    public Rider getRider(){
        return riderService.getRider();
    }

}
