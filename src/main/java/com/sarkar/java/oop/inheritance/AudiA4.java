package com.sarkar.java.oop.inheritance;

public class AudiA4 extends Audi {

    int numOfSeats = 4;
    String color = "White";
    String madeIn;

    public void engineStart() {
        System.out.println("Audi A4 Engine Start");
    }

    public void setColor(String color) {
        super.color = color;
    }

    public void setMadeIn(String country) {
        this.madeIn = country;
    }

    @Override
    public String toString() {
        return "AudiA4{" +
                "numOfSeats=" + numOfSeats +
                ", color='" + color + '\'' +
                ", madeIn='" + madeIn + '\'' +
                '}';
    }
}
