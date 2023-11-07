package org.example;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("select the number you want to perform the operation on: ");
        Scanner keyboard = new Scanner(System.in);
        Calculator calculator = new Calculator();
        CommandHistory commandHistory = new CommandHistory();

        while (true) {
            System.out.println("Select the operation (1: Add, 2: Subtract, 3: Multiply, 4: Divide, 5: Undo, 6: Redo, 0: Exit): ");
            int choice = keyboard.nextInt();

            if (choice == 0) {
                break;
            }

            if (choice == 5) {
                // Undo
                if (!commandHistory.undoLastCommand()) {
                    System.out.println("No commands to undo.");
                }
            } else if (choice == 6) {
                // Redo
                if (!commandHistory.redoLastUndoneCommand()) {
                    System.out.println("No commands to redo.");
                }
            } else {
                System.out.println("Enter the number: ");
                int myint = keyboard.nextInt();

                switch (choice) {
                    case 1:
                        AddCommand addCommand = new AddCommand(calculator, myint);
                        addCommand.execute();
                        commandHistory.addExecutedCommand(addCommand);
                        break;
                    case 2:
                        SubstractCommand subtractCommand = new SubstractCommand(calculator, myint);
                        subtractCommand.execute();
                        commandHistory.addExecutedCommand(subtractCommand);
                        break;
                    case 3:
                        MultiplyCommand multiplyCommand = new MultiplyCommand(calculator, myint);
                        multiplyCommand.execute();
                        commandHistory.addExecutedCommand(multiplyCommand);
                        break;
                    case 4:
                        DivideCommand divideCommand = new DivideCommand(calculator, myint);
                        divideCommand.execute();
                        commandHistory.addExecutedCommand(divideCommand);
                        break;
                    default:
                        System.out.println("Invalid input. Please select a valid operation.");
                }
            }
        }
    }
}
