package com.sarkar.java.oop.inheritance;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.engineStart();

        Audi audi = new Audi();
        audi.engineStart();

        Car car = new Audi();
        car.engineStart();

        /*
        // Invalid Implementations

        Audi car2 = (Audi) new Car();
        car2.engineStart();

        AudiA4 car3 = (AudiA4) new Audi();
        car3.engineStart();
        */

        Car car4 = new AudiA4();
        car4.engineStart();

        System.out.println();

        Audi car5 = new AudiA4();
        car5.engineStart();
        System.out.println("car5 - " + car5);

        System.out.println();

        AudiA4 car6 = new AudiA4();
        System.out.println("car6 - " + car6);
        car6.numOfSeats = 5;
        car6.setColor("Yellow");
        car6.setMadeIn("India");
        System.out.println("car6 - " + car6);
        car6.color = "Yellow";
        System.out.println("car6 - " + car6);

        System.out.println();

        Audi car7 = new AudiA4();
        System.out.println("car7 - " + car7);
        ((AudiA4) car7).setColor("Red");
        System.out.println("car7 - " + car7);



    }

}
