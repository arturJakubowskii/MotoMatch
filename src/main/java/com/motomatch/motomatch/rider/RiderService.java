package com.motomatch.motomatch.rider;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RiderService {

    private List<Rider> riderList = new ArrayList<>();


    public RiderService() {
    }

    public void postRider(Rider rider) {
        riderList.add(rider);
    }

    public Rider getRider() {
        return riderList.get(0);
    }
}
