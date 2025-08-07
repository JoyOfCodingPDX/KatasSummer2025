package edu.pdx.cs.joy.mob2;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Minesweeper {

  public char[][] minefield;
  public int row;
  public int col;

  public Minesweeper(int row, int col) {
    this.row = row;
    this.col = col;
  }


  @VisibleForTesting
  public static void main(String[] args) {

    System.err.println("Missing command line arguments");
  }

  public void addLine(String s) {
    if (minefield == null) {
      minefield = new char[row][col];
    }
    if (s.length() != col) {
      throw new IllegalArgumentException("Line length does not match column size");
    }
    for (int i = 0; i < col; i++) {
      minefield[0][i] = s.charAt(i);
    }
  }
}