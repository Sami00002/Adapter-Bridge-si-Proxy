package org.example;

public class Main {
    public static void main(String[] args) {
        OldCoffeeMachine oldMachine = new OldCoffeeMachine();
        CoffeeMachine newMachine = new CoffeeMachineAdapter(oldMachine);

        newMachine.chooseFirstSelection();  // Acesta va selecta A
        newMachine.chooseSecondSelection(); // Acesta va selecta B
    }
}