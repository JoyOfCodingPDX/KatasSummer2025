package edu.pdx.cs.joy.mob2;

import com.google.common.annotations.VisibleForTesting;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class RPNCalculator {

  @VisibleForTesting
  public static void main(String[] args) {

  }


  public static float calculate(String s) {
    String[] parts = s.split(" ");

    Stack<Float> numbers = new Stack<>();

    for (String part : parts) {
      if (isDigit(part)) {
        numbers.push(Float.parseFloat(part));
      } else {
        switch (part) {
          case  "/":
            float num1 = numbers.pop();
            float num2 = numbers.pop();
            if(num1 == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }
            numbers.push(num2/num1);
            break;
          case  "+":
            num1 = numbers.pop();
            num2 = numbers.pop();
            numbers.push(num2 + num1);
            break;
          case  "-":
            num1 = numbers.pop();
            num2 = numbers.pop();
            numbers.push(num2 - num1);
            break;
          case  "*":
            num1 = numbers.pop();
            num2 = numbers.pop();
            numbers.push(num2 * num1);
            break;
          case  "SQRT":
            num1 = numbers.pop();
            numbers.push((float) Math.sqrt(num1));
            break;
          case  "MAX":
            ArrayList<Float> list = new ArrayList<>();
            while(!numbers.isEmpty()) {
                list.add(numbers.pop());
            }
            numbers.push(Collections.max(list));
            break;
        }
      }
    }

    return numbers.pop();
  }

  public static boolean isDigit(String s) {
    try {
      int n = Integer.parseInt(s);
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }
}