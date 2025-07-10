package edu.pdx.cs.joy.pair8;

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

  public String isLeapYear(int i) {
    if (i % 4 == 0) {
      return i + " is a leap year for sure";
    }
    return i + " is not a leap year";
  }
}