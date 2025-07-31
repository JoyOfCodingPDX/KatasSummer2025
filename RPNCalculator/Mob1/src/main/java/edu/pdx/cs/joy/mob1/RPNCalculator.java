package edu.pdx.cs.joy.mob1;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class RPNCalculator {

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  public int evaluate(String arg) {
    String[] operators = arg.split(" ");
    if(operators[2].equals("+")) {
      return Integer.parseInt(operators[1]) + Integer.parseInt(operators[0]);
    } else {
      return 0;
    }
  }
}