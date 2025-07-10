package edu.pdx.cs.joy.pair9;

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
}

public static string getLeapYearValue(int year) {
    if (year < 0) {
      throw new IllegalArgumentException("Year must be greater than 0");
    }

    if (year % 4 == 0 && year % 100 != 0) {
      return "Leap Year";
    } else {
      return "Not a Leap Year";
    }
  }
}