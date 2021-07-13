package com.company.creatures;

import com.company.devices.Car;
import com.company.devices.Phone;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Human extends Animal {
    public String firstName;
    public String lastName;
    public Phone phone;
    public Animal pet;
    private Double salary;
    Date salaryDate = null;
    List<String> list = new ArrayList();
    private String pesel1;
    public String pesel2;
    public Double cash;
    int garageSize;
    Car garage[];

    public Human (Double cash, int garageSize) {
        super("homo sapiens");
        this.cash = cash;
        garage = new Car[garageSize];
        this.garageSize = garageSize;
    }


    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone=" + phone +
                ", pet=" + pet +
                ", salary=" + salary +
                ", salaryDate=" + salaryDate +
                ", list=" + list +
                ", pesel1='" + pesel1 + '\'' +
                ", pesel2='" + pesel2 + '\'' +
                '}';
    }

    public String getPesel1() {
        return pesel1;
    }
    public void setPesel1(String pesel){
        this.pesel1 = pesel;
    }

    public Double getSalary(){

        list.add("Data pobrania informacji o wypłacie: " + (salaryDate = new Date()));
        list.add("Ówczesna wartość wypłaty: " + this.salary);
        for (int i = 0; i < (list.size() - 2); i++){
            System.out.println(list.get(i));
        }

        System.out.println("Aktualna wypłata: " + this.salary);
        return this.salary;
    }
    public void setSalary(Double salary){
        if (salary < 0){
            System.out.println("Wypłata nie może być minusowa");
        }
        else {

            System.out.println("Nowe dane zostały wysłane do systemu księgowego.");
            System.out.println("Odbierz aneks od Pani Hani z działu kadr");
            System.out.println("ZUS i US już wiedzooo, już się nie ukryjesz");
            this.salary = salary;
    }}

    public Car getCar(Integer carPosition){
        return garage[carPosition];
    }
    public void setCar(Car car) {
        if (!haveCar(null)){
            System.out.println("Nie masz miejsca na nowy samochód");
        }
        for (int i=0; i < garageSize; i++){
            if (garage[i] == null)
            {
                if (this.salary == null){
                    System.out.println("Brak pieniędzy, samochód nie został kupiony");
                    break;
                }
                if (this.salary > car.value) {
                    garage[i] = car;
                    System.out.println("Udało się kupić samochód za gotówkę");
                    break;
                }

                if (this.salary > (car.value/12) ){
                    garage[i] = car;
                    System.out.println("Udało się kupić samochód na kredyt");
                    break;
                }
                else {
                    System.out.println("Za dużo byś chciał, zarób trochę");

                }

            }
        }


    }
    public void transferCarTo(Human buyer, Car car){
        for (int i=0; i < garageSize; i++){
            if (garage[i] == car)
            {
                garage[i] = null;
                break;
            }
        }
        for (int i=0; i < buyer.garageSize; i++){
            if (buyer.garage[i] == null)
            {
                buyer.garage[i] = car;
                break;
            }
        }

    }

    public boolean haveCar(Car car){
        for (int i=0; i < garageSize; i++){
            if (garage[i] == car)
            {
                return true;
            }
        }
        return false;
    }

    public void valueOfGarageCars () {
        Double all = 0.0;
        for (int i = 0; i < garageSize; i++) {
            if (garage[i] == null){
                continue;
            }
            all += garage[i].value;
        }
        System.out.println("Wartość wszystkich samochodów: " + all);
    }


}
