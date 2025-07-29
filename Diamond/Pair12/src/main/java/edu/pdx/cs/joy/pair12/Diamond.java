package edu.pdx.cs.joy.pair12;

import com.google.common.annotations.VisibleForTesting;

import java.util.Arrays;


/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Diamond {


  @VisibleForTesting
  public static void main(String[] args) {



    if(args.length != 1) {
      System.err.println("Missing command line arguments");
      return;
    }
    char[] hold_end = args[0].toCharArray();

    if(hold_end[0] < 60 || hold_end[0] > 90) {
      hold_end[0] = (char)(hold_end[0] - 32);
    }

    System.out.println((int) hold_end[0]);

    if(hold_end[0] >= 60 && hold_end[0] <= 90){

      int hold_amount_sequence = (int) hold_end[0] - 65 + 1;

      int distance = hold_amount_sequence;
      int distance_left = hold_amount_sequence;
      int distance_right = hold_amount_sequence;

      int count = 0;

      for(int i = 65; i <= (int) hold_end[0]; ++i){

        char to_letter = (char) i;



        if(i != 65) {
          System.out.printf("%" + distance_left + "s", "");
          System.out.print(to_letter);
          System.out.printf("%" + (distance_right - distance + count) + "s", "");

          System.out.println(to_letter);
        }
        else if(i == 65) {
          System.out.printf("%" + hold_amount_sequence + "s", "");
          System.out.println(to_letter);
        }

        --distance_left;
        ++distance_right;
        if(i != 65) {
          ++count;
        }

      }

    }else{
      System.err.println("Invalid command line arguments");
      return;
    }


  }
}