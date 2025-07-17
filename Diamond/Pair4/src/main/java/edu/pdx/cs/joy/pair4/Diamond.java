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
    char[] alphabet = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    if (args.length != 1) {
      System.err.println("Missing command line arguments");
    }

    int character = args[0].charAt(0);
    int illegalCounter=0;
    for(char test: alphabet) {
      if (character == test){
        ++illegalCounter;
      }
    }
    if (illegalCounter < 27) {
      System.err.println("Illegal character");
    }

    if(args[0].equals("A")) {
      System.out.println("A");
    }
  }
}
