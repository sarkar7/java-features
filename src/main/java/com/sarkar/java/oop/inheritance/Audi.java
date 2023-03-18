package com.sarkar.java.oop.inheritance;

public class Audi extends Car {

    int numOfSeats = 6;
    String color = "Blue";
    String madeIn = "USA";

    public void engineStart() {
        System.out.println("Audi Engine Start");
    }

    @Override
    public String toString() {
        return "Audi{" +
                "numOfSeats=" + numOfSeats +
                ", color='" + color + '\'' +
                ", madeIn='" + madeIn + '\'' +
                '}';
    }
}
