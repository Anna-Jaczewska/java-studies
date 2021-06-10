package com.company;

public class Animal {
    final public String species;
    private Double weight;
    String name;

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

    void feed() {
        if (this.weight > 0) {
            System.out.println("Mniam, dzięki! Moja waga to: " + (this.weight += 1));
        }
        if (this.weight <= 0) {
            System.out.println("Zabiłeś mnie, już nie potrzebuję żarcia");
        }
    }

    void takeForAWalk() {
        if (this.weight > 0) {
            System.out.println("Ughh, zmęczyłeś mnie. Moja waga to: " + (this.weight -= 0.75));
        }
        if (this.weight <= 0) {
            System.out.println("Zabiłeś mnie, już nie potrzebuję spaceru :/");
        }
    }

        void printName () {
            System.out.println("my name is: " + this.name);
        }

        void printNameAndOwner (String owner){
            System.out.println(owner + " has " + this.name);
        }

        String getNameAndOwner (String owner){
            return owner + " has " + this.name;
        }
    }

