package com.motomatch.motomatch.rider;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
public class Rider {

    @Id
    @SequenceGenerator(
            name = "rider_sequence",
            sequenceName = "rider_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "rider_sequence"
    )

    private Long id;
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


}
