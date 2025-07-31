package edu.pdx.cs.joy.mob2;

import com.google.common.annotations.VisibleForTesting;

import java.lang.reflect.Array;
import java.util.ArrayList;
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
            numbers.push(num2/num1);
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