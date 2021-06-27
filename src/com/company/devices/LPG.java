package com.company.devices;

public class LPG extends Car{
    public LPG(Integer id, String model, String producer, Integer yearOfProduction) {
        super(id, model, producer, yearOfProduction);
    }

    @Override
    public void refuel() {
        System.out.println("Zatankowano LPG");
    }
}
