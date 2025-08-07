package edu.pdx.cs.joy.mob4;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Minesweeper {

  private String input;
  private int rowCount;
  private int colCount;

  public Minesweeper(String newInput) {
    input = newInput;
    rowCount = 0;
    colCount = 0;
  }

  public String getInput() {
    return input;
  }

  public int getRowCount() {
    return rowCount;
  }

  public int getColCount() {
    return colCount;
  }

  // private parseInput



  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }
}