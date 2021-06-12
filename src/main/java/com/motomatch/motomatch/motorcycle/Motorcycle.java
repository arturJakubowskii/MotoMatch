package com.motomatch.motomatch.motorcycle;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "motorcycle")
public class Motorcycle {
    @Id
    @SequenceGenerator(
            name = "motorcycle_sequence",
            sequenceName = "motorcycle_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "motorcycle_sequence"
    )

    /*
    Metric system only
     */

    private Long id;
    private String name;
    private Integer seatHeight; // in mm
    private Integer cc;
    private Integer horsePower;
    private Integer weight;
    private Integer ridingExperienceLevel; // 1 - 3, same as in Rider class
    private Integer priceForNew;
    private Integer priceForUsed; //typically 5 years
    private String motorcycleType; // Naked, Cruiser etc.
    private String drivingLicenseType;


    public Motorcycle(String name,
                      Integer seatHeight,
                      Integer cc,
                      Integer horsePower,
                      Integer weight,
                      Integer ridingExperienceLevel,
                      Integer priceForNew,
                      Integer priceForUsed,
                      String motorcycleType,
                      String drivingLicenseType) {

        this.name = name;
        this.seatHeight = seatHeight;
        this.cc = cc;
        this.horsePower = horsePower;
        this.weight = weight;
        this.ridingExperienceLevel = ridingExperienceLevel;
        this.priceForNew = priceForNew;
        this.priceForUsed = priceForUsed;
        this.motorcycleType = motorcycleType;
        this.drivingLicenseType = drivingLicenseType;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", seatHeight=" + seatHeight +
                ", cc=" + cc +
                ", horsePower=" + horsePower +
                ", weight=" + weight +
                ", ridingExperienceLevel=" + ridingExperienceLevel +
                ", priceForNew=" + priceForNew +
                ", priceForUsed=" + priceForUsed +
                ", motorcycleType='" + motorcycleType + '\'' +
                ", drivingLicenseType='" + drivingLicenseType + '\'' +
                '}';
    }
}
