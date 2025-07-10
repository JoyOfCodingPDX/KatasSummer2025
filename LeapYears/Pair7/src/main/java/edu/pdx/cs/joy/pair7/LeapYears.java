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
    System.err.println("Missing command line arguments");
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
    public static void Display(String[] args){
                System.out.println(isLeapYear(100));

    }

    }



