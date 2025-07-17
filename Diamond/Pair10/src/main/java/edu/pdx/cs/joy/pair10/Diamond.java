package edu.pdx.cs.joy.pair10;

import com.google.common.annotations.VisibleForTesting;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Diamond {

  private final int letterValue;

  public Diamond(char letter) {
    letterValue = (int) letter - 64;
  }

  public String outputDiamond() {
    int length = (letterValue * 2) - 1;
    String result = "";
    for(int i = 0; i < length; i++) {
      if(i == length/2) {
        result = result + "A";
      } else {
        result = result + " ";
      }
    }
    return result;
  }

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }
}