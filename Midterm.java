/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg18b.midterm;

import java.util.*;
        
/**
 *
 * @author Drew
 */
public class Midterm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GameManager gameManager = GameManager.getInstance();
        ConcreteSubject games = new ConcreteSubject();
        GameBoard game = new GameBoard();
        boolean exit = false;
        int holder;
        games.addObserver(gameManager);
        
        System.out.println("Take turns selecting numbers on the keypad to choose where the X's and O's go.\n The first player will be X's and the other will be O's.");
        game.printBoard();
        while(!exit){
            System.out.println("Enter 0 to undo a move or 10 to exit:");
            holder = input.nextInt();
            if (holder != 10){
                games.setNum(holder);
            }
            else {
                exit = true;
            }
        }
    }
    
}
