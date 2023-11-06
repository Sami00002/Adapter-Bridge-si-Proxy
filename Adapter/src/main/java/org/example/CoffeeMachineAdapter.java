package org.example;

interface CoffeeMachine {
    void chooseFirstSelection();
    void chooseSecondSelection();
}

class CoffeeMachineAdapter implements CoffeeMachine {
    OldCoffeeMachine oldMachine;

    public CoffeeMachineAdapter(OldCoffeeMachine oldMachine) {
        this.oldMachine = oldMachine;
    }

    @Override
    public void chooseFirstSelection() {
        oldMachine.selectA();
    }

    @Override
    public void chooseSecondSelection() {
        oldMachine.selectB();
    }
}