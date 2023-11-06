package org.example;

public class AddCommand implements  Command{

    private Calculator _calculator;
    private int _operand;

    public AddCommand(Calculator calculator, int operand)
    {
        _calculator = calculator;
        _operand = operand;
    }

    @Override
    public void execute() {
        _calculator.Calculate(Operations.Add, _operand);
    }

    @Override
    public void undo() {
        _calculator.Calculate(Operations.Substract, _operand);
    }

    @Override
    public void redo() {
        execute();
    }
}