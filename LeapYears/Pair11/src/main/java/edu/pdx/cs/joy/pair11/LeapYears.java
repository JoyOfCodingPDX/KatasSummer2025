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

  public static boolean isItLeap(double year) {
    if(year < 0) {
      return false;
    }
    // Divisible by 400; yes, leap year
    if(year % 400 == 0) {
      return true;
    }
    else if (year % 100 == 0 && year % 400 != 0) {
      return false;
    }


    return false;
  }
}