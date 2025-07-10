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
    String year = null;
    if (args.length > 0) {
      year = args[0];
    }
    if (year != null) {
      try {
        int yearInt = Integer.parseInt(year);
        System.out.println(isLeapYear(yearInt));
      } catch (NumberFormatException e) {
        System.err.println("Invalid year format: " + year + "Enter a positive integer year");
      }
      return;
    }
    if (args.length == 0) {
      System.err.println("Missing command line arguments");
      return;
    }
    return;
  }

  public static String isLeapYear(int year) {
    if (year % 400 == 0) {
      return year + " is a leap year";

    } else if (year % 4 == 0) {
        if (year % 100 == 0) {
            return year + " is not a leap year";
        }
      return year + " is a leap year";

    }

    return year + " is not a leap year";
  }
}