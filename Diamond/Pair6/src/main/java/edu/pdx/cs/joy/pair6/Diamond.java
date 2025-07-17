package edu.pdx.cs.joy.pair6;

import com.google.common.annotations.VisibleForTesting;




/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Diamond {

  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
  }

  public static String print(char target) {
    int size = target - 'A';
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i <= size; i++) {
      sb.append(buildLine(i, size)).append("\n");
    }

    for (int i = size - 1; i >= 0; i--) {
      sb.append(buildLine(i, size)).append("\n");
    }

    return sb.toString();
  }


}