package com.company;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Hello world");

	    Human human1 = new Human("Jan", "Nowak", "Java Developer", 1200);
	    Human human2 = new Human("Janusz", "Kowalski", "PHP Developer", 5000);

	    System.out.println(human1.firstName);

	    Animal tiger = new Animal("Maniek", "Tygrys bengalski", "Samiec");

	    System.out.println(tiger.spieces);

	    Phone phone1 = new Phone("Apple", "12 Pro Max", "5G");
	    Phone phone2 = new Phone("Samsung", "Galaxy S10", "4G LTE");

	    System.out.println(phone1.brand +" "+ phone1.model);
	    System.out.println(phone2.brand +" "+ phone2.model);

    }
}
