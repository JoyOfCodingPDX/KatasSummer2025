package edu.pdx.cs.joy.pair6;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class LeapYears {

  @VisibleForTesting
  public static boolean main(String[] args) {
    return false;
    //System.err.println("Missing command line arguments");
  }


  public static boolean isLeapYear(int year) {
    int leapyeartest = year % 4;

    int leapyeartest1 = year % 100;

    int leapyeartest400 = year % 400;

    if (leapyeartest1 % 100 == 0 && leapyeartest400 % 400 != 0) {
      return false;
    }


    if (leapyeartest400 == 0) {
      return true;
    }
    if (leapyeartest == 0) {
      return true;
    }

    if (leapyeartest1 == 100) {

      return false;
    } else {
      return false;
    }


  }
}