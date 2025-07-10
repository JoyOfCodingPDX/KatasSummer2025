package edu.pdx.cs.joy.pair1;

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
    //System.err.println("Missing command line arguments");

    int x = Integer.parseInt(args[0]);
    try {
      if ((x % 400) == 0) //all years divisible by 400 are leap years
      {
        throw new RuntimeException("This is a leap year!");
      }
    } catch (NumberFormatException e) {
      System.out.println("Please enter a valid year");
    }
    try {
      if ((x % 100) == 0 && (x % 400) != 0) // these are not leap years
      {
        throw new RuntimeException("This is NOT a leap year!");
      }

      if ((x % 4 == 0) && (x % 100 != 0)) //these ARE leap years
      {
        throw new RuntimeException("This is a leap year!");
      }


      if ((x % 4) != 0) {
        throw new RuntimeException("This is a leap year!");
      }
      // public static void is_leap(double leap)3

    } catch (Exception e) {
      System.out.println("Please enter a valid year");
    }
  }
}
