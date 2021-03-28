package com.company;

import java.util.Objects;

public class Human {
    String firstName;
    String lastName;
    String position;
    double salary;
    Animal pet;
    Car car;

    public Human(String firstName, String lastName, String position, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return position == human.position && Objects.equals(firstName, human.firstName) && Objects.equals(lastName, human.lastName) && Objects.equals(pet, human.pet) && Objects.equals(car, human.car);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, position, pet, car);
    }

    @Override
    public String toString() {
        return "Human{" +
                "imie='" + firstName + '\'' +
                ", nazwisko='" + lastName + '\'' +
                ", stanowisko=" + position +
                ", pet=" + pet +
                ", auto=" + car +
                '}';
    }
}
