package edu.pdx.cs.joy.pair3;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class LeapYears {

  public static boolean isLeapYear(int year) {
    if(year % 400 == 0){
      return true;
    } else if(year % 100 == 0){
      return false;
    } else if(year % 4 == 0) {
      return true;
    } else {
      return false;
    }
  }

  @VisibleForTesting
  public static void main(String[] args) {
    if(args.length == 0) {
      System.err.println("Missing command line arguments");
    } else if(args.length == 1) {
      System.err.println("Missing one command line argument");
    } else {

      int startYear;
      int endYear;

      try {
        startYear = Integer.parseInt(args[0]);
        endYear = Integer.parseInt(args[1]);
        for (int i = startYear; i <= endYear; i++) {
          if (isLeapYear(i)) {
            System.out.println(i + " Leap!");
          } else {
            System.out.println(i);
          }
        }
      } catch (NumberFormatException e) {
        System.err.println("Invalid format!");
      }

    }


  }
}