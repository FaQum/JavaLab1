package com.company;

public class Phone {
    String brand;
    String model;
    String communication;

    public Phone(String brand, String model, String communication) {
        this.brand = brand;
        this.model = model;
        this.communication = communication;
    }

    @Override
    public String toString() {
        return "Phone{" + '\'' +
                "brand=" + brand + '\'' +
                ", 'model=" + model + '\'' +
                ", 'communication=" + communication +
                '}';
    }
}
