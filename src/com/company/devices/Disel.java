package com.company.devices;

public class Disel extends Car{
    public Disel(Integer id, String model, String producer, Integer yearOfProduction) {
        super(id, model, producer, yearOfProduction);
    }

    @Override
    public void refuel() {
        System.out.println("Zatankowane paliwem ON");
    }
}
