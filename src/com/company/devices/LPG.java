package com.company.devices;

public class LPG extends Car{
    public LPG(Integer id, String model, String producer, Integer yearOfProduction, Double value) {
        super(id, model, producer, yearOfProduction, value);
    }

    @Override
    public void refuel() {
        System.out.println("Zatankowano LPG");
    }
}
