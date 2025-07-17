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
    return "A\n";
  }
  private static String buildLine(int i, int size) {
    char letter = (char) ('A' + i);
    StringBuilder line = new StringBuilder();

    line.append(" ".repeat(size - i));


    line.append(letter);

    if (i > 0) {
      line.append(" ".repeat(i * 2 - 1));
      line.append(letter);
    }

    return line.toString();
  }
}