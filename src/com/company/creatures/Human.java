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
    private Car car;
    private Double salary;
    Date salaryDate = null;
    List<String> list = new ArrayList();
    private String pesel1;
    public String pesel2;
    public Double cash;

    public Human (Double cash) {
        super("homo sapiens");
        this.cash = cash;
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone=" + phone +
                ", pet=" + pet +
                ", car=" + car +
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

    public Car getCar(){
        return this.car;
    }
    public void setCar(Car car){

        if (this.salary > car.price) {
        this.car = car;
            System.out.println("Udało się kupić samochód za gotówkę");
        }
        if (this.salary > (car.price/12) ){
            this.car = car;
            System.out.println("Udało się kupić samochód na kredyt");
        }
        else {
            System.out.println("Za dużo byś chciał, zarób trochę");
        }

    }
    public void transferCarTo(Human buyer){
        buyer.car = this.car;
        this.car = null;
    }
}
