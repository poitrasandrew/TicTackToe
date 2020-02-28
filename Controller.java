/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg18b.midterm;

/**
 *
 * @author Drew
 */
public class Controller {
    Command[] commands;
    Command undoCommand;
    
    public Controller() {
        commands = new Command[2];
        
        Command noCommand = new NoCommand();
        for (int i = 0; i < 2; i++) {
            commands[i] = noCommand;
        }
        undoCommand = noCommand;
    }
    
    public void setCommand(int slot, Command command) {
        commands[slot] = command;
    }
    
    public void commandExecuted(int slot) {
        commands[slot].execute();
        undoCommand = commands[slot];
    }
    
    public void commandUndo() {
        undoCommand.undo();
    }
}

