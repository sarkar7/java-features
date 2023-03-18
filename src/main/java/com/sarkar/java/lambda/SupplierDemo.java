package com.sarkar.java.lambda;

import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {

        Supplier<String> supplier = () -> "Hello from Supplier!";
        System.out.println(supplier.get());

    }
}
