package com.company.devices;

public class Devices {
    public String producer;
    public String model;
    public Integer yearOfProduction;

    @Override
    public String toString() {
        return "Devices{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
