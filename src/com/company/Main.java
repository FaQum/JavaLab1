package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Hello world");

	    Human human1 = new Human("Jan", "Nowak", "Java Developer", 1200);
	    Human human2 = new Human("Janusz", "Kowalski", "PHP Developer", 5000);
	    Human human3 = new Human("Darek", "Petunia", "Senior HTML Developer", 500);

	    System.out.println(human1.firstName);

	    Animal tiger = new Animal("Maniek", "Tygrys bengalski", "Samiec", 200);
	    Animal llama = new Animal("Lamcia", "Lama andyjska", "Samica", 78);

	    System.out.println(tiger.spieces);

	    Phone phone1 = new Phone("Apple", "12 Pro Max", "5G");
	    Phone phone2 = new Phone("Samsung", "Galaxy S10", "4G LTE");

	    System.out.println(phone1.brand +" "+ phone1.model);
	    System.out.println(phone2.brand +" "+ phone2.model);

	    Animal animalWithMaxWeight = tiger.weight > llama.weight ? tiger : llama;
	    	System.out.println("Najcięższym zwierzęciem jest "+ animalWithMaxWeight.name + " i waży " + animalWithMaxWeight.weight + " kg");

		if(human1.salary > human2.salary)
			System.out.println(human1.firstName + " zarabia więcej od " + human2.firstName);
		else
			System.out.println(human1.firstName + " zarabia mniej niż " + human2.firstName);

		StringBuilder animaldesc = new StringBuilder("Najcięższym zwierzęciem jest ").
				append(animalWithMaxWeight.name).
				append(" i waży ").
				append(animalWithMaxWeight.weight);
		System.out.println(animaldesc);

		ArrayList<Human> humanlist = new ArrayList<>();
		humanlist.add(human1);
		humanlist.add(human2);
		humanlist.add(human3);

		for(Human human : humanlist) {
			System.out.println(human.firstName);
		}
	}
}
