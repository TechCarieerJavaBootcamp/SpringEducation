package com.springEdu.techcareer.week4.Saturday.Odev;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Car {

    private String brand;
    private String model;
    private int age;
    private FuelType fuelType;

    public abstract double dailyRentPrice();

}
