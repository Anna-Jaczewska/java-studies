package com.company.devices;

import com.company.creatures.Human;
import com.company.Saleable;

abstract public class Car extends Devices implements Saleable {
    public final Integer id;
    public String color;
    public Double price;

    @Override
    public void trunOn() {
        System.out.println("Obkręć kluczyk");
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public Car(Integer id, String model, String producer, Integer yearOfProduction) {

        super (producer, model, yearOfProduction);
        this.id = id;


        switch (this.model) {
            case "bravo" -> this.price = 25000.00;
            case "fiesta" -> this.price = 3000.00;
            default -> this.price = 0.00;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car z = (Car) o;
        return id.equals(z.id) &&
                model.equals(z.model) &&
                producer.equals(z.producer) &&
                yearOfProduction.equals(z.yearOfProduction) &&
                color.equals(z.color) &&
                price.equals(z.price);
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.getCar() != this) {
            System.out.println("Nie masz takiego samochodu");
        }
        else if (buyer.cash < price){
            System.out.println("Kupujący nie posiada wystarczająco środków by kupić samochód");
        }
        else {
            seller.transferCarTo(buyer);
            buyer.cash -= price;
            seller.cash += price;
            System.out.println("Transakcja wykonana");
        }
    }

    abstract public void refuel();
}
