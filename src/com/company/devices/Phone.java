package com.company.devices;

import com.company.creatures.Human;
import com.company.Saleable;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Phone extends Devices implements Saleable {
    public Double screenSize;
    public String os;
    static final String server = "play.google.com/store";
    static final String protocol = "https://";
    static final String version = "1.0.0.1";

    public Phone(String producer, String model, Integer yearOfProduction) {

        super(producer, model, yearOfProduction);
    }

    @Override
    public void trunOn() {
        System.out.println("Wciśnij guzik");
    }

    @Override
    public String toString() {
        return "Phone{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", screenSize=" + screenSize +
                ", os='" + os + '\'' +
                '}';
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.phone != this) {
            System.out.println("Nie posiadasz takiego telefonu");
        } else if (buyer.cash < price) {
            System.out.println("Kupujący nie posiada wystarczająco środków by kupić telefon");
        } else {
            buyer.phone = this;
            seller.phone = null;
            buyer.cash -= price;
            seller.cash += price;
            System.out.println("Transakcja wykonana");
        }
    }

    public void installAnApp(String appName) throws MalformedURLException {
        installAnApp(appName,this.version, this.server);
        System.out.println("Zainstalowana");
    }

    public void installAnApp(String appName, String version) throws MalformedURLException {
        installAnApp(appName, version, this.server);
        System.out.println("Zainstalowana");
    }

    public void installAnApp(String appName, String version, String server) throws MalformedURLException {
        String link = this.protocol + server + "/" + appName + "/" + version;
        installAnApp(new URL(link));
        System.out.println(link);
        System.out.println("Zainstalowana");
    }

    public void installAnApp(String[] list) {
        System.out.println("Zainstalowana");
    }

    public void installAnApp(URL address) {
        System.out.println("Zainstalowana");
    }
}
