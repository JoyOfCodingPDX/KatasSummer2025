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

    for(int i = 0; i < args.length; i++){
      try{
        int hold_year =  Integer.parseInt(args[i]);
        System.out.println(hold_year);
      }
      catch(NumberFormatException e){
        System.out.println("ERROR: Incorrect arguments type");
      }
    }



  }
}