package edu.pdx.cs.joy.mob3;

import com.google.common.annotations.VisibleForTesting;

import java.util.ArrayList;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Minesweeper {


  public char[][] board;

  @VisibleForTesting
  public static void main(String[] args) {
    //System.err.println("Missing command line arguments");

    String m = args[0];
    String n = args[1];

  }

  public void showBoard() {
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        System.out.print(board[i][j]);
      }
      System.out.println();
    }
  }

  public void createBoard(int m, int n) {
    board = new char[m][n];

    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        board[i][j] = '.';
      }
    }

  }

  public void placeMine(int y, int x) {
    if (isValidIndex(y, x)) {
      board[y][x] = '*';
    };
    
    
  }
  
  public void getClues(int y, int x) {
    if (isValidIndex(y, x)) {

    }

  }

  private boolean isValidIndex(int y, int x) {
    return y <= board.length && x <= board[0].length && x >= 0 && y >= 0;
  }


}