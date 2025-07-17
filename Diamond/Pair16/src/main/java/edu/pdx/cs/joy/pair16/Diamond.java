package edu.pdx.cs.joy.pair16;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Diamond {

  public static int getValue(char c) {
    return ((int) c) - 65;
  }

  public static char getChar(int value) {
    return (char) (value + 65);
  }

  @VisibleForTesting
  public static void main(String[] args) {

    if( args.length < 1) {
      System.err.println("Missing command line arguments");
      return;
    }

    char diamond = (char) args[0].charAt(0);
    int spaceValue = getValue(diamond) + 1;
    String spaces = String.format( "%"+ spaceValue + "s", "");

//    System.out.println("Number of spaces: " + spaces);

    System.out.println(diamond);



  }

}