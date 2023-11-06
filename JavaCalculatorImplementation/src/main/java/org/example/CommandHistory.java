package org.example;

import java.util.Stack;

public class CommandHistory {
    private Stack<Command> executedCommands;
    private Stack<Command> undoneCommands;

    public CommandHistory() {
        executedCommands = new Stack<>();
        undoneCommands = new Stack<>();
    }

    public void addExecutedCommand(Command command) {
        executedCommands.push(command);
        undoneCommands.clear(); // Clear the undone commands stack
    }

    public boolean undoLastCommand() {
        if (!executedCommands.isEmpty()) {
            Command lastCommand = executedCommands.pop();
            lastCommand.undo();
            undoneCommands.push(lastCommand);
            return true;
        }
        return false;
    }

    public boolean redoLastUndoneCommand() {
        if (!undoneCommands.isEmpty()) {
            Command lastUndoneCommand = undoneCommands.pop();
            lastUndoneCommand.execute();
            executedCommands.push(lastUndoneCommand);
            return true;
        }
        return false;
    }
}