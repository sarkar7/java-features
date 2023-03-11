package com.sarkar.lambda;

interface Calculator {
    void switchOn();
}

public class CalculatorImpl {

    public static void main(String[] args) {

        // Lambda Expression
        Calculator calculator =  () -> {
            System.out.println("Switch On");
        };

        Calculator calculator1 = () -> System.out.println("Switch On");

        calculator.switchOn();
        calculator1.switchOn();

    }

}
