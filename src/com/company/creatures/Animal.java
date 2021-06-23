package com.company.creatures;

import com.company.Saleable;

abstract public class Animal implements Saleable, Feedable {
    final public String species;
    private Double weight;
    public String name;

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }

    //konstruktor
    public Animal(String species) {
        this.species = species;
        if (this.species == "pies") {
            this.weight = 20.0;
        } else if (this.species == "myszojeleń") {
            this.weight = 5.0;

        }
        switch (this.species) {
            case "dog" -> this.weight = 10.2;
            case "cat" -> this.weight = 2.0;
            case "mouse" -> this.weight = 0.01;
            default -> this.weight = 1.0;
        }
    }

    public void feed() {
        if (this.weight > 0) {
            System.out.println("Mniam, dzięki! Moja waga to: " + (this.weight += 1));
        }
        if (this.weight <= 0) {
            System.out.println("Zabiłeś mnie, już nie potrzebuję żarcia");
        }
    }

    public void feed(Double foodWeight) {
        if (this.weight > 0) {
            System.out.println("Mniam, dzięki! Moja waga to: " + (this.weight += foodWeight));
        }
        if (this.weight <= 0) {
            System.out.println("Zabiłeś mnie, już nie potrzebuję żarcia");
        }
    }

    public void takeForAWalk() {
        if (this.weight > 0) {
            System.out.println("Ughh, zmęczyłeś mnie. Moja waga to: " + (this.weight -= 0.75));
        }
        if (this.weight <= 0) {
            System.out.println("Zabiłeś mnie, już nie potrzebuję spaceru :/");
        }
    }

        public void printName () {
            System.out.println("my name is: " + this.name);
        }

        public void printNameAndOwner (String owner){
            System.out.println(owner + " has " + this.name);
        }

        public String getNameAndOwner (String owner){
            return owner + " has " + this.name;
        }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (this instanceof Human){
            System.out.println("Nie można handlować ludźmi!");
        }
        else if (seller.pet != this) {
            System.out.println("Nie posiadasz takiego zwierzęcia");
        }
        else if (buyer.cash < price){
            System.out.println("Kupujący nie posiada wystarczająco środków by kupić zwierzaka");
        }
        else {
            buyer.pet = this;
            seller.pet = null;
            buyer.cash -= price;
            seller.cash += price;
            System.out.println("Transakcja wykonana");
        }
    }
}

