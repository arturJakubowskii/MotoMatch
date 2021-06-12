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
    private String driverLicenseType;

    public Rider() {
    }

    public Rider(Integer riderHeight,
                 Integer ridingExperience,
                 Integer price,
                 String motorcycleType,
                 String driverLicenseType) {
        this.riderHeight = riderHeight;
        this.ridingExperience = ridingExperience;
        this.price = price;
        this.motorcycleType = motorcycleType;
        this.driverLicenseType = driverLicenseType;
    }

    @Override
    public String toString() {
        return "Rider{" +
                "riderHeight=" + riderHeight +
                ", ridingExperience=" + ridingExperience +
                ", price=" + price +
                ", motorcycleType='" + motorcycleType + '\'' +
                ", driverLicenseType='" + driverLicenseType + '\'' +
                '}';
    }
}
