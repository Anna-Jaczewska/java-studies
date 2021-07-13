package com.company.devices;

public class Disel extends Car{
    public Disel(Integer id, String model, String producer, Integer yearOfProduction, Double value) {
        super(id, model, producer, yearOfProduction, value);
    }

    @Override
    public void refuel() {
        System.out.println("Zatankowane paliwem ON");
    }
}
