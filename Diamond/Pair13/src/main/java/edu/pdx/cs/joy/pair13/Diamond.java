package edu.pdx.cs.joy.pair13;

import com.google.common.annotations.VisibleForTesting;

import static java.lang.StringUTF16.toUpperCase;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Diamond {

  char character;

  Diamond(char character) { this.character = Character.toUpperCase(character); }



  @VisibleForTesting
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
    String ok = String.valueOf(3);
    System.out.println(ok.getClass().getName());

  }

  public int getNumber() {
    if (Character.isLetter(character)) {
      return Integer.parseInt(String.valueOf(character - 'A' + 1));
    } else {
      throw new IllegalArgumentException("Character must be a letter");
    }
  }

  public String printDiamond() {
    if(this.character == 'A') {
      return "A";
    }
    else
      return "FUCK";
  }
}