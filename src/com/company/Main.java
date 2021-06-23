package com.company;

import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {
        Pet dog = new Pet("canis familiaris");
        dog.name = "Szarik";
        //dog.weight = 12.0;
        // dog.species = "canis familiaris";
        int index = 53524;
        System.out.println("Projekt z grupy: " + index % 3);

        System.out.println(dog.name);
        System.out.println(dog.species);

        dog.printName();
        dog.printNameAndOwner("Anna");

        String text = dog.getNameAndOwner("Anna");
        System.out.println(text);

        Human anna = new Human(25000.00);
        anna.pet = dog;
        anna.firstName = "Anna";
        anna.lastName = "Jaczewska";

        //System.out.println(anna.pet.species);

//        int ii = 23;
//        boolean bb = false;
//        long ll = 31514654;
//        short ss = 231;
//        float ff = 243.3f;
//        double dd = 243.2;
//        char cc = '3';
//        byte bbbb;
//
//        Boolean b = true;
//        Double d = 2.3;
//        Integer i = -32;

        Pet mouse = new Pet("mouse");
        mouse.feed();
        mouse.feed();
        mouse.feed();
        mouse.takeForAWalk();
        mouse.takeForAWalk();
        mouse.takeForAWalk();
        mouse.takeForAWalk();
        mouse.takeForAWalk();
        mouse.takeForAWalk();
        mouse.feed();


        anna.setSalary(2000.00);
        anna.getSalary();
        anna.getSalary();
        anna.setSalary(4000.00);
        anna.getSalary();
        anna.getSalary();

        Car carAnny = new Car(1, "bravo", "fiat", 2007);
        carAnny.color = "bordowy";
        anna.setCar(carAnny);
        Car carAnny2 = new Car(1, "bravo", "fiat", 2007);
        carAnny2.color = "bordowy";
        boolean isHashcodeEquals = carAnny.hashCode() == carAnny2.hashCode();
        if (isHashcodeEquals) {
        System.out.println(carAnny.equals(carAnny2));
        } else {
            System.out.println("Obiekty nie są sobie równe");
        }
        System.out.println(carAnny);
        System.out.println(carAnny2);

        Phone phoneAnny = new Phone("Xiaomi", "Mi 9 Lite", 2019);
        phoneAnny.screenSize = 6.39;
        phoneAnny.os = "Android";

        System.out.println(phoneAnny);
        System.out.println(mouse);
        System.out.println(anna);

        Pet kropka = new Pet("cat");
        Human john = new Human(15000.0);
        john.pet = kropka;

        System.out.println(john instanceof Human);
        System.out.println(john instanceof Animal);

        System.out.println(carAnny);
        phoneAnny.trunOn();

        carAnny.sell(anna, john, 10000.0);
        System.out.println("Samochód Ani: " + anna.getCar());
        System.out.println("Samochód Johna: " + john.getCar());

        kropka.feed();
        kropka.feed(0.5);
        FarmAnimal krowa = new FarmAnimal("krowa");
        krowa.beEaten();

    }
}
