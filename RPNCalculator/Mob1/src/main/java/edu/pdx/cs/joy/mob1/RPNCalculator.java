package edu.pdx.cs.joy.mob1;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 * <p>
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class RPNCalculator {

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
    String[] operators = argsplit(" ");

  }






  public int evaluate(String [] operators) {
    return switch (operators[2]) {
      case "+" -> Integer.parseInt(operators[0]) + Integer.parseInt(operators[1]);
      case "-" -> Integer.parseInt(operators[0]) - Integer.parseInt(operators[1]);
      case "*" -> Integer.parseInt(operators[0]) * Integer.parseInt(operators[1]);
      case "/" -> Integer.parseInt(operators[0]) / Integer.parseInt(operators[1]);
      default -> 0;
    };
  }
}