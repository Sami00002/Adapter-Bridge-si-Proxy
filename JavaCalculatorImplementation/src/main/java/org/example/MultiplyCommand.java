package org.example;

public class MultiplyCommand implements  Command{

    private Calculator _calculator;
    private int _operand;

    public MultiplyCommand(Calculator calculator, int operand)
    {
        _calculator = calculator;
        _operand = operand;
    }

    @Override
    public void execute() {
        _calculator.Calculate(Operations.Multiply, _operand);
    }

    @Override
    public void undo() {
        _calculator.Calculate(Operations.Divide, _operand);
    }

    @Override
    public void redo() {
        execute();
    }
}