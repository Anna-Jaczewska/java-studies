package com.company.devices;

abstract public class Devices {
    final public String producer;
    final public String model;
    final public Integer yearOfProduction;
    final public Double value;

    public Devices(String producer, String model, Integer yearOfProduction, Double value) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.value = value;
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
