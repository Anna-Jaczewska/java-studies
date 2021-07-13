package com.company.devices;

import com.company.creatures.Human;
import com.company.Saleable;

abstract public class Car extends Devices implements Saleable {
    public final Integer id;
    public String color;
   // public Double price;

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
                ", value=" + value +
                '}';
    }

    public Car(Integer id, String model, String producer, Integer yearOfProduction, Double value) {

        super (producer, model, yearOfProduction, value);
        this.id = id;

//
//        switch (this.model) {
//            case "bravo" -> this.price = 25000.00;
//            case "fiesta" -> this.price = 3000.00;
//            default -> this.price = 0.00;
//        }
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
                value.equals(z.value);
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (!seller.haveCar(this)){
            throw new Exception("Nie masz takiego samochodu");
        }
        if (!buyer.haveCar(null)){
            throw new Exception("Nie masz miejsca na nowy samochód");
        }
        else if (buyer.cash < price){
            System.out.println("Kupujący nie posiada wystarczająco środków by kupić samochód");
        }
        else {
            seller.transferCarTo(buyer, this);
            buyer.cash -= price;
            seller.cash += price;
            System.out.println("Transakcja wykonana");
        }
    }

    abstract public void refuel();
}
