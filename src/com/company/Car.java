package com.company;

public class Car {
    final String model;
    final Producer producer;
    String color;


    public Car(String model, Producer producer, String color) {
        this.model = model;
        this.producer = producer;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", producer=" + producer +
                '}';
    }
}