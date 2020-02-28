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
public class GameBoard implements Board {
    public String[] position = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
    
    public void changeBoard(int num, String piece) {
        num--;
        position[num] = piece;
    }
    
    public void printBoard(){
        System.out.println("       |       |       ");
        System.out.println("   " + position[6] + "   |   " + position[7] + "   |   " + position[8] + "   ");
        System.out.println("_______|_______|_______");
        System.out.println("       |       |       ");
        System.out.println("   " + position[3] + "   |   " + position[4] + "   |   " + position[5] + "   ");
        System.out.println("_______|_______|_______");
        System.out.println("       |       |       ");
        System.out.println("   " + position[0] + "   |   " + position[1] + "   |   " + position[2] + "   ");
        System.out.println("       |       |       ");
    }
}
//       |       |       
//   7   |   8   |   9   
//_______|_______|_______
//       |       |       
//   4   |   5   |   6   
//_______|_______|_______
//       |       |       
//   1   |   2   |   3   
//       |       |       