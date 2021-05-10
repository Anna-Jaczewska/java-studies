package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;


public class Human {
    String firstName;
    String lastName;
    Phone phone;
    Animal pet;
    Car car;
    private Double salary;
    Date salaryDate = null;
    List<String> list = new ArrayList();

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
}
