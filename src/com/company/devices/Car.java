package com.company.devices;

public class Car extends Devices {
    public final Integer id;
    public String color;
    public Double price;

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public Car(Integer id, String model, String producer, Integer yearOfProduction) {
        this.id = id;
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;

        switch (this.model) {
            case "bravo" -> this.price = 25000.00;
            case "fiesta" -> this.price = 3000.00;
            default -> this.price = 0.00;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car z = (Car) o;
        return id.equals(z.id) &&
                model.equals(z.model) &&
                producer.equals(z.producer) &&
                yearOfProduction.equals(z.yearOfProduction) &&
                color.equals(z.color) &&
                price.equals(z.price);
    }

    @Override
    public int hashCode() {
        return id;
    }
}
