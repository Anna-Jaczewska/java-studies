package com.company.devices;

public class Phone extends Devices {
    public Double screenSize;
    public String os;

    public Phone(String producer, String model, Integer yearOfProduction) {

        super(producer, model, yearOfProduction);
    }

    @Override
    public void trunOn() {
        System.out.println("Wciśnij guzik");
    }

    @Override
    public String toString() {
        return "Phone{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", screenSize=" + screenSize +
                ", os='" + os + '\'' +
                '}';
    }
}
