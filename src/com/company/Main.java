package com.company;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Hello world");

	    Human human1 = new Human("Jan", "Nowak", "Java Developer", 1200);
	    Human human2 = new Human("Janusz", "Kowalski", "PHP Developer", 5000);

	    System.out.println(human1.firstName);
    }
}
