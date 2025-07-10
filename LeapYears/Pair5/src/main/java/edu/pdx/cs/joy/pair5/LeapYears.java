package edu.pdx.cs.joy.pair5;

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
    System.err.println("Missing command line arguments");
  }

  public static String isLeapYear(int i) {
    if (i < 0)
      throw new IllegalArgumentException("Years cannot be negative.");
    if (i % 400 == 0)
      return String.format("%d is a Leap Year.", i);
    else if (i % 4 == 0 && i % 100 != 0)
      return String.format("%d is a Leap Year.", i);
    else
      return String.format("%d is not a Leap Year.", i);
  }
}