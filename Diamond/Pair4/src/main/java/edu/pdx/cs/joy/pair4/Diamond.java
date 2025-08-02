package edu.pdx.cs.joy.pair4;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Diamond {

  @VisibleForTesting
  public static void main(String[] args) {
    if (args.length != 1) {
      System.err.println("Missing command line arguments");
    }
  char end = args[0].toUpperCase().charAt(0);
    if( end < 'A' || end > 'Z') {
      System.err.println("Invalid end character. Enter A through Z");
      return;
    }

//    System.out.println(generateDiamond(end)); // Create and Implement Generate Diamond
//
//    public static
  }

}
