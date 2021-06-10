package com.company;

public class Car {
    final String model;
    final String producer;
    final Integer yearOfProduction;
    String color;
    Double price;

    public Car(String model, String producer, Integer yearOfProduction){
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;

        switch (this.model){
            case "bravo":
                this.price = 25000.00;
                break;
            case "fiesta":
                this.price = 3000.00;
                break;
            default:
                this.price = 0.00;
        }
    }

}
