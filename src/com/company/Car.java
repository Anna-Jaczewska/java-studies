package com.company;

public class Car {
    String model;
    String producer;
    Integer yearOfProduction;
    String color;
    Double price;

    public Car(String model){
        this.model = model;

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
