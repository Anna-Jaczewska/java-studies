package com.company.devices;

public class Electric extends Car {
    public Electric(Integer id, String model, String producer, Integer yearOfProduction, Double value) {
        super(id, model, producer, yearOfProduction, value);
    }

    @Override
    public void refuel() {
        System.out.println("Naładowane");
    }
}
