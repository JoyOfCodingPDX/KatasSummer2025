package edu.pdx.cs.joy.pair12;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class LeapYears {

  @VisibleForTesting
  public static void main(String[] args) {
    if (args.length == 0) {
      System.err.println("Missing command line argument");
      return;
    }
    for (String i : args) {
      int value = Integer.parseInt(i);
      if (!check(value)) {
        System.out.println(i + " is not a leap year");
      } else {
        System.out.println(i + " is a leap year");
      }
    }

  }

  public static boolean check(Integer num) {
    if (num % 400 == 0) {
      return true;
    }
    if (num % 100 == 0) {
      return false;
    }
    if (num % 4 == 0) {
      return true;
    }
    return false;
  }
}