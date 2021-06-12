package com.motomatch.motomatch.rider;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Rider {


    private Integer riderHeight; // in cm
    private Integer ridingExperience; // 1 - 3
    private Integer price;
    private String motorcycleType;

    public Rider() {
    }

    public Rider(Integer riderHeight,
                 Integer ridingExperience,
                 Integer price,
                 String motorcycleType) {

        this.riderHeight = riderHeight;
        this.ridingExperience = ridingExperience;
        this.price = price;
        this.motorcycleType = motorcycleType;
    }

    @Override
    public String toString() {
        return "Rider{" +
                "riderHeight=" + riderHeight +
                ", ridingExperience=" + ridingExperience +
                ", price=" + price +
                ", motorcycleType='" + motorcycleType + '\'' +
                '}';
    }
}
