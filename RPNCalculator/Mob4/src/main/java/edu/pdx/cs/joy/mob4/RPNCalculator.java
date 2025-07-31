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

        System.out.println("Addition " + firstNumber + " and " + secondNumber + " Total: " + (firstNumber + secondNumber));

        return firstNumber + secondNumber;
    }

    public Double subtraction(Double firstNumber, Double secondNumber) {

        System.out.println("Subtraction " + firstNumber + " and " + secondNumber + " Total: " + (firstNumber - secondNumber));

        return firstNumber - secondNumber;
    }

    public Double multiplication(Double firstNumber, Double secondNumber) {

        System.out.println("Multiplication " + firstNumber + " and " + secondNumber + "Total: " + (firstNumber * secondNumber));
        return firstNumber * secondNumber;
    }

    public Double division(Double firstNumber, Double secondNumber) {

        System.out.println("Division " + firstNumber + " and " + secondNumber + "Total: " + (firstNumber / secondNumber));

        return firstNumber / secondNumber;
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

                case "-":
                    calculator.numberStack.push(
                            calculator.subtraction(calculator.numberStack.pop(), calculator.numberStack.pop()));
                    break;

                case "*":
                    calculator.numberStack.push(
                            calculator.multiplication(calculator.numberStack.pop(), calculator.numberStack.pop()));
                    break;

                case "/":
                    calculator.numberStack.push(
                            calculator.division(calculator.numberStack.pop(), calculator.numberStack.pop()));

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
