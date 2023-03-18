package com.sarkar.java.oop.polymorphism;

public class PolymorphismTest {

    public static void main() {
        System.out.println("From another main method");
    }

    public static void main(String[] args) {
        main();
        Object object = new Object();
    }

}
