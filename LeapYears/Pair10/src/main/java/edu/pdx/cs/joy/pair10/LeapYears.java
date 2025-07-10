package edu.pdx.cs.joy.pair10;

import com.google.common.annotations.VisibleForTesting;


/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class LeapYears {

  @VisibleForTesting
  public int LeapYearsCLI(String [] args){
    return args.length;
  }

  @VisibleForTesting
  public static void main(String[] args) {

    LeapYears app = new LeapYears();

    if (app.LeapYearsCLI(args) != 1) {
      System.out.println("ERROR: Incorrect number of arguments");
      return;
    }
    try{
      int hold_year =  Integer.parseInt(args[0]);

      if (hold_year % 4 == 0 && hold_year % 100 != 0 || hold_year % 400 == 0) {
        System.out.println("Leap year is valid " + hold_year);
      }
      else {
        System.out.println("Leap year is not valid " + hold_year);
      }

      System.out.println(hold_year);
    }
    catch(NumberFormatException e){
      System.out.println("ERROR: Incorrect arguments type");
    }
    return;
  }
}