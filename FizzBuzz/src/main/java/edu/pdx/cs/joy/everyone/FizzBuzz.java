package edu.pdx.cs.joy.everyone;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class FizzBuzz {

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  public static String getFizzBuzzValue(int number) {
    if (number < 0) {
      throw new IllegalArgumentException("Number must be greater than 0");
    }

    if (number % 3 == 0 && number % 5 == 0) {
      return "FizzBuzz";

    } else if (number % 3 == 0) {
      return "Fizz";

    } else if (number % 5 == 0) {
      return "Buzz";

    } else {
      return String.valueOf(number);
    }
  }
}