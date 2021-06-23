package com.company.devices;

import com.company.creatures.Human;
import com.company.Saleable;

public class Phone extends Devices implements Saleable {
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

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.phone != this) {
            System.out.println("Nie posiadasz takiego telefonu");
        }
        else if (buyer.cash < price){
            System.out.println("Kupujący nie posiada wystarczająco środków by kupić telefon");
        }
        else {
            buyer.phone = this;
            seller.phone = null;
            buyer.cash -= price;
            seller.cash += price;
            System.out.println("Transakcja wykonana");
        }
    }
}
