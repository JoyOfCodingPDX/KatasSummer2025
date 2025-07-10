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

    if (args.length != 0) {
      System.err.println("Missing command line arguments");
      return;
    }

    try {
      int year = Integer.parseInt(args[0]);
      if (isLeapYear(year)) //all years divisible by 400 are leap years
      {
        System.out.println("This is a leap year");
      } else {
        System.out.println("This is not a leap year");
      }

    } catch (Exception e) {
      System.out.println("Please enter a valid year");
    }

  }
  public static boolean isLeapYear(int year)
  {
    if(year % 400 == 0)
      {
      return true;
      }
    else if(year % 100 != 0)
      {
        return false;
      }
    else
    {
      return year % 4 == 0;
    }
  }
}


