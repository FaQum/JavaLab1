package com.company;

public class Animal {
    String name;
    final String spieces;
    String gender;
    private Double weight;

    public static final Double DEFAULT_TYGRYS_WEIGHT = 200.0;
    public static final Double DEFAULT_LAMA_WEIGHT = 70.0;

    public Animal(String name, String spieces, String gender) {
        this.name = name;
        this.spieces = spieces;
        this.gender = gender;
        if(spieces.equals("Tygrys bengalski")) {
            this.weight = DEFAULT_TYGRYS_WEIGHT;
        } else if(spieces.equals("Lama andyjska")) {
            this.weight = DEFAULT_LAMA_WEIGHT;
        }
    }

    public void feed() {
        if(weight > 0) {
            this.weight++;
            System.out.println("Zostałem nakarmiony, teraz ważę: "+ this.weight);
        } else {
            System.out.println("Przykro mi");
        }
    }

    public void takeForAWalk() {
        if(this.weight > 0){
            this.weight--;
            System.out.println("Spacerek dobra rzecz, teraz ważę: " + this.weight);
        } else {
            System.out.println("Przykro mi");
        }
    }
}
