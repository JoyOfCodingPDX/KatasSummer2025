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

    RPNCalculator calculator = new RPNCalculator();

    //double check one string on command line
    if (args.length < 1) {
      System.err.println("Missing command line arguments");
      return;
    }
    else if (args.length > 1 ) {
      System.err.println("Too many command line arguments");
      return;
    }
    //if one string passes check, parse here:
    String[] operators = args[0].split(" ");
    if (operators.length != 3) {
      System.err.println("Not enough operands/operators for RPNCalculator");
      return;
    }

    // now, EVALUATE !!!
    System.out.println(calculator.evaluate(operators));

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