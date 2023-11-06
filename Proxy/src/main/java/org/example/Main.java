package org.example;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new CalculatorProxy();

        int result = calculator.add(5, 3);
        System.out.println("Result: " + result);
    }
}