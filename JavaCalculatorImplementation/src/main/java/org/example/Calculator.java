package org.example;
import java.util.Scanner;


public class Calculator {

    Scanner keyboard = new Scanner(System.in);
    int _total = keyboard.nextInt();

    public void Calculate(Operations operation, int operand)
    {
        switch (operation) {
            case Add -> {
                int newTotal = _total + operand;
                System.out.println(_total +" + "+operand + " = "+newTotal);
                _total = newTotal;
            }
            case Substract -> {
                int newTotal = _total - operand;
                System.out.println(_total +" - "+operand + " = "+newTotal);
                _total = newTotal;
            }
            case Multiply -> {
                int newTotal = _total * operand;
                System.out.println(_total +" * "+operand + " = "+newTotal);
                _total = newTotal;
            }
            case Divide -> {
                int newTotal = _total / operand;
                System.out.println(_total +" / "+operand + " = "+newTotal);
                _total = newTotal;
            }
        }
    }
}