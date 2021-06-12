package com.company.devices;

public class Phone extends Devices {
    public Double screenSize;
    public String os;

    @Override
    public String toString() {
        return "Phone{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", screenSize=" + screenSize +
                ", os='" + os + '\'' +
                '}';
    }
}
