package com.company.devices;

abstract public class Devices {
    final public String producer;
    final public String model;
    final public Integer yearOfProduction;

    public Devices(String producer, String model, Integer yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }



    abstract public void trunOn();
    @Override
    public String toString() {
        return "Devices{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
