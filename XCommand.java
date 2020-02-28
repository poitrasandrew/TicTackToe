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
public class XCommand implements Command {
    GameFactory factory;
    GameBoard gameBoard;
    int choice;
    int prevChoice;
    String prevSpot;
    
    public XCommand(int choice, GameBoard gameBoard){
        this.choice = choice;
        this.gameBoard = gameBoard;
    }
    
    public void execute(){
        prevChoice = choice;
        prevSpot = gameBoard.position[prevChoice - 1];
        factory.createBoard(true, choice, gameBoard);
    }
    
    public void undo(){
        gameBoard.changeBoard(prevChoice, prevSpot);
        
    }
}
