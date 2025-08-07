package edu.pdx.cs.joy.mob1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class MinesweeperTest
{

  @Test
  void canInstantiateKataClass() {
    new Minesweeper();
  }


  @Disabled
  @Test
  void missingArguments() {
    MainMethodResult result = invokeMain(Minesweeper.class);
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line arguments"));

  }

  @Test
  void missingArgs() {
    String[] args = {"4"};  // only 1 arg, should throw
    assertThrows(IllegalArgumentException.class, () -> {
      Minesweeper.buildGridFromArgs(args);
    });
  }
}