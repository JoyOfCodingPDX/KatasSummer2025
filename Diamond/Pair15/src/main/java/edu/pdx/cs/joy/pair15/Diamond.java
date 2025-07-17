package edu.pdx.cs.joy.pair15;

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
    if (args.length == 0) {
      System.err.println("Missing command line arguments");
      return;
    }

    if (args.length > 1) {
      System.err.println("Too many command line arguments");
      return;
    }

    Character input = args[0].charAt(0);

    System.out.println(input);

    // for loop to print out values from A to given letter
    for (char ch = 'A'; ch <= input; ch++) {
      if(ch == 'A') {
        System.out.print(ch);
      } else {
        System.out.print(ch);
        System.out.print(ch);
      }
      System.out.println(); // New line for separation
    }

    for (char ch = input; ch >= input; ch--) {
      if(ch == 'A') {
        System.out.print(ch);
      } else {
        System.out.print(ch);
        System.out.print(ch);
      }
      System.out.println(); // New line for separation
    }
  }
}