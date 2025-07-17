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

  public String[] outputDiamond() {
    int length = (letterValue * 2) - 1;
    String[] result = new String[length];
    for(int i = 0; i <= length / 2; i++) {
      result[i] = "";
        for (int j = 0; j < length; j++) {
          if ((j == length / 2 - i) || (j == length / 2 + i)) {
            result[i] = result[i] + (char) (i + 65);
          } else {
            result[i] = result[i] + " ";
          }
        }
    }
    for(int i = length - 1, j = 0; i > 0; i--, j++) {
      result[i] = result[j];
    }
    return result;
  }

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }
}