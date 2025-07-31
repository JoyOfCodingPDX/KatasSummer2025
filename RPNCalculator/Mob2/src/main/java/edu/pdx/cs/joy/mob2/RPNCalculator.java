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
      //if ()
        //isDigit()
    }

    return 0;
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