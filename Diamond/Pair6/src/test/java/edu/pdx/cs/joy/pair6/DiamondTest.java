package edu.pdx.cs.joy.pair6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiamondTest {

  @Test
  void canInstantiateKataClass() {
    new Diamond();
  }

  @Test
  void returnsSingleAWhenInputIsA() {
    assertEquals("A\n", Diamond.print('A'));
  }

  @Test
  void returnsDiamondForB() {
    String expected =
            " A\n" +
                    "B B\n" +
                    " A\n";
    assertEquals(expected, Diamond.print('B'));
  }

  @Test
  void returnsDiamondForC() {
    String expected =
            "  A\n" +
                    " B B\n" +
                    "C   C\n" +
                    " B B\n" +
                    "  A\n";
    assertEquals(expected, Diamond.print('C'));
  }

}
