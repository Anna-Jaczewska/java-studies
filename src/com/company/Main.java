package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("canis familiaris");
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

        Human anna = new Human();
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

        Animal mouse = new Animal("mouse");
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

        Phone phoneAnny = new Phone();
        phoneAnny.model = "Mi 9 Lite";
        phoneAnny.producer = "Xiaomi";
        phoneAnny.screenSize = 6.39;
        phoneAnny.os = "Android";

        System.out.println(phoneAnny);
        System.out.println(mouse);
        System.out.println(anna);
    }
}
