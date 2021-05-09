package com.company;

public class Animal {
    final public String species;
    private Double weight;
    String name;

    //konstruktor
    public Animal(String species) {
        this.species = species;
        if (this.species == "pies") {
            this.weight = 20.0;
        } else if (this.species == "myszojeleń") {
            this.weight = 5.0;

        }
        switch (this.species) {
            case "dog":
                this.weight = 10.2;
                break;
            case "cat":
                this.weight = 2.0;
                break;
            case "mouse":
                this.weight = 0.01;
                break;
            default:
                this.weight = 1.0;
        }
    }

    void printName() {
        System.out.println("my name is: " + this.name);
    }

    void printNameAndOwner(String owner) {
        System.out.println(owner + " has " + this.name);
    }

    String getNameAndOwner(String owner) {
        return owner + " has " + this.name;
    }
}
