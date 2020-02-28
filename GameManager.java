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
public class GameManager implements Game {
    private static GameManager instance;
    private static GameFactory factory;
    private Controller controller = new Controller();
    
    private GameManager(GameFactory factory) {
        this.factory = factory;
    }
    
    private boolean player1Turn = true;
    private GameBoard gameBoard = new GameBoard();
    
    public static GameManager getInstance() {
        if (instance == null) {
            instance = new GameManager(factory);
        }
        return instance;
    }
    
    public boolean isItPlayer1Turn() {
        return player1Turn;
    }
    
    public boolean player1WinCheck() {
        if (gameBoard.position[0].equals("X") && gameBoard.position[1].equals("X") && gameBoard.position[2].equals("X")) return true;
        else if (gameBoard.position[3].equals("X") && gameBoard.position[4].equals("X") && gameBoard.position[5].equals("X")) return true;
        else if (gameBoard.position[6].equals("X") && gameBoard.position[7].equals("X") && gameBoard.position[8].equals("X")) return true;
        else if (gameBoard.position[0].equals("X") && gameBoard.position[3].equals("X") && gameBoard.position[6].equals("X")) return true;
        else if (gameBoard.position[1].equals("X") && gameBoard.position[4].equals("X") && gameBoard.position[7].equals("X")) return true;
        else if (gameBoard.position[2].equals("X") && gameBoard.position[5].equals("X") && gameBoard.position[8].equals("X")) return true;
        else if (gameBoard.position[0].equals("X") && gameBoard.position[4].equals("X") && gameBoard.position[8].equals("X")) return true;
        else if (gameBoard.position[2].equals("X") && gameBoard.position[4].equals("X") && gameBoard.position[6].equals("X")) return true;
        else return false;
    }
    
    public boolean player2WinCheck() {
        if (gameBoard.position[0].equals("O") && gameBoard.position[1].equals("O") && gameBoard.position[2].equals("O")) return true;
        else if (gameBoard.position[3].equals("O") && gameBoard.position[4].equals("O") && gameBoard.position[5].equals("O")) return true;
        else if (gameBoard.position[6].equals("O") && gameBoard.position[7].equals("O") && gameBoard.position[8].equals("O")) return true;
        else if (gameBoard.position[0].equals("O") && gameBoard.position[3].equals("O") && gameBoard.position[6].equals("O")) return true;
        else if (gameBoard.position[1].equals("O") && gameBoard.position[4].equals("O") && gameBoard.position[7].equals("O")) return true;
        else if (gameBoard.position[2].equals("O") && gameBoard.position[5].equals("O") && gameBoard.position[8].equals("O")) return true;
        else if (gameBoard.position[0].equals("O") && gameBoard.position[4].equals("O") && gameBoard.position[8].equals("O")) return true;
        else if (gameBoard.position[2].equals("O") && gameBoard.position[4].equals("O") && gameBoard.position[6].equals("O")) return true;
        else return false;
    }
    
    public void updateGame(int num) {
        XCommand newX = new XCommand(num, gameBoard);
        OCommand newO = new OCommand(num, gameBoard);
        controller.setCommand(0, newX);
        controller.setCommand(1, newO);
        if (num <=10 && num > 0){
            if (!gameBoard.position[num - 1].equals("X") && !gameBoard.position[num - 1].equals("O") && num != 0){
                if (player1Turn) {
                    controller.commandExecuted(0);
                    gameBoard.printBoard();
                    player1Turn = false;
                    System.out.println("It is now Player 2's turn.");
                }
                else if (!player1Turn) {
                    controller.commandExecuted(1);
                    gameBoard.printBoard();
                    player1Turn = true;
                    System.out.println("It is now Player 1's turn.");
                }
            }
        }
        else if (num == 0){
            controller.commandUndo();
            gameBoard.printBoard();
            if (player1Turn) {
                player1Turn = false;
                System.out.println("It is now Player 2's turn.");
            }
            else if (!player1Turn) {
                player1Turn = true;
                System.out.println("It is now Player 1's turn.");
            }
        }
        else {
            System.out.println("Not a Valid Move.");
        }
        if (player1WinCheck()) {
            System.out.println("Player 1 wins!");
        }
        else if (player2WinCheck()){
            System.out.println("Player 2 Wins!");
        }
    }
}
