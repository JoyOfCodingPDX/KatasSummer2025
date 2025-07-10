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

public boolean string getLeapYearValue(int year) {
    if (year < 0) {
        throw new IllegalArgumentException("Year must be greater than 0");
    }
    boolean isLeapYear = false;
    if (year < 0) {
      throw new IllegalArgumentException("Year must be greater than 0");
    }

    if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0) ) {
        isLeapYear = true;
        //return "isLeapYear";
    } else if((year % 100 == 0 && year % 400 != 0)) || (year % 4 != 0)) {
        isLeapYear = false;
        //return false;
    }
    }
      return isLeapYear;
    }
  }
}