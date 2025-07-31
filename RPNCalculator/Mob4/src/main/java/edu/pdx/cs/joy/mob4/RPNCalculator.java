package edu.pdx.cs.joy.mob4;

import com.google.common.annotations.VisibleForTesting;

import java.util.Stack;

/**
 * A class for getting started with a code kata
 * <p>
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class RPNCalculator {
    public Stack<Double> numberStack = new Stack<>();

    public Double addition(Double firstNumber, Double secondNumber) {

        return firstNumber + secondNumber;
    }

    public static void main(String[] args) {
        RPNCalculator calculator = new RPNCalculator();

        // Parse Command Line Arguments
        for (String arg : args) {
            switch (arg) {
                case "+":
                    calculator.numberStack.push(
                            calculator.addition(calculator.numberStack.pop(), calculator.numberStack.pop()));
                    break;
                default:
                    try {
                        // Try to parse the argument as a number
                        Double number = Double.parseDouble(arg);
                        calculator.numberStack.push(number);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input: " + arg);
                    }
            }
        }
    }

}

}