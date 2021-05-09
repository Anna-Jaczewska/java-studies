package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("canis familiaris");
        dog.name = "Szarik";
        //dog.weight = 12.0;
       // dog.species = "canis familiaris";

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

        int ii = 23;
        boolean bb = false;
        long ll = 31514654;
        short ss = 231;
        float ff = 243.3f;
        double dd = 243.2;
        char cc = '3';
        byte bbbb;

        Boolean b = true;
        Double d = 2.3;
        Integer i = -32;

    }
}
