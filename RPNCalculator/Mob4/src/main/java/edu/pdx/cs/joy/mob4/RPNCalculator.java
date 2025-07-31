package edu.pdx.cs.joy.mob4;

import com.google.common.annotations.VisibleForTesting;

import java.util.Stack;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class RPNCalculator {
  public Stack<Double> numberStack = new Stack<>();

  public Double addition(String args[]){
    // Adds values to stack
    numberStack.push(Double.parseDouble(args[0]));
    numberStack.push(Double.parseDouble(args[1]));

    //Extracts values
    Integer firstNumber = Integer.parseInt(args[0]);
    Integer secondNumber = Integer.parseInt(args[1]);

    return numberStack.pop();
  }

}