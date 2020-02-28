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
public class GameFactory {

    /**
     *
     * @param player1Turn
     * @param num
     * @param gameBoard
     * @return
     */
    public static GameBoard createBoard(boolean player1Turn, int num,  GameBoard gameBoard) {
        if (player1Turn){
            gameBoard.changeBoard(num, "X");
        }   else if  (!player1Turn){
            gameBoard.changeBoard(num, "O");
        }
        return gameBoard;
    }
//           |       |       
//       7   |   8   |   9   
//    _______|_______|_______
//           |       |       
//       4   |   5   |   6   
//    _______|_______|_______
//           |       |       
//       1   |   2   |   3   
//           |       |       
}
