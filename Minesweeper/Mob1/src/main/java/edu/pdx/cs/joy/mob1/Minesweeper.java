package edu.pdx.cs.joy.mob1;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Minesweeper {

  @VisibleForTesting
  public static void main(String[] args) {
    if (args.length < 2) {
      System.err.println("Missing command line arguments");
      return;
    }

    int rows = Integer.parseInt(args[0]);
    int columns =  Integer.parseInt(args[1]);
    char [][] grid = new char[rows][columns];

    //making the grid 
    for (int i = 0; i < rows; i++) {
      grid[i] = args[2+i].toCharArray();
    }

    for (char[] row : grid) {
      System.out.println(new String(row));
    }
    }

}

