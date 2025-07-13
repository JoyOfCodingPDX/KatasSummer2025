package edu.pdx.cs.joy.pair7;

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
      if (args.length > 0) {

          try{
              LeapYears leapyear = new LeapYears();
              int year = Integer.parseInt(args[0]);
              String result = leapyear.isLeapYear(year);
              leapyear.displayResult(year, result);
          }

          catch (NumberFormatException e){
                System.err.println("Invalid year format. Please enter a valid integer.");
                return;
          }

          }
      }


    public static String isLeapYear(int i) {
      String s = "";
        if (i < 0) {
            s = "Year cannot be negative";
            return s;
        }

        if (i % 4 == 0 && (i % 100 != 0 || i % 400 == 0)) {
            return "is a leap year";
        } else {
            return "is not a leap year";
        }
    }
    /*
    public String isNotLeapYear(int i){
      if (i <0){
                throw new IllegalArgumentException("Year has to be before BC");
            }
            if(i % 4 == 0) {
                return "is a leap year";
            }
            else if(i % 100 != 0 && i % 400 == 0) {
                return "is a leap year";
            }
            else{
                return "is not a leap year";
            }

      }*/
    public static String displayResult(int year, String result) {
        String finalResult = "Year " + year + " " + result;

        System.out.println(finalResult);
        return finalResult;
    }



}