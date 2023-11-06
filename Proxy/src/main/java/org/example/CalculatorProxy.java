package org.example;

class CalculatorProxy implements Calculator {
    private RealCalculator realCalculator = new RealCalculator();

    @Override
    public int add(int a, int b) {
        System.out.println("Performing some additional operations before delegating to RealCalculator");
        return realCalculator.add(a, b);
    }
}