package edu.pdx.cs.joy.pair11;

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

  public static boolean isItLeap(long year) {
    if(year <= 0) {
      return false;
    }
    // Divisible by 400; yes, leap year
    if(year % 400 == 0) {
      return true;
    }
    // Divisble by 100, but not 400; no, not leap year
    else if (year % 100 == 0 && year % 400 != 0) {
      return false;
    }
    // Divisible by 4, but not by 100; yes, leap year
    else if (year % 4 == 0 && year % 100 != 0) {
      return true;
    }
    // Any year that is not divisible by 4; no, not a leap year
    else if (year % 4 != 0) {
      return false;
    }
    return false;
  }

  public static String prettyMsg(long yearGiven) {
    String message = "";

    if (yearGiven > 0 && yearGiven < 1582) {
      message += "";
    }
    if (isItLeap(yearGiven)) {
      return yearGiven + " is a leap year";
    }
    else {
      return yearGiven + " is not a leap year";
    }
  }

}