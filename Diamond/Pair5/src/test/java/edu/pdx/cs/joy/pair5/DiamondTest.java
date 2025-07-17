package edu.pdx.cs.joy.pair5;

import org.junit.jupiter.api.Test;

public class DiamondTest
{

  @Test
  void canInstantiateKataClass() {
    new Diamond();
  }
    new Diamond('A');
}

  @Test
  void diamondWithA() {
    Diamond diamond = new Diamond('A');
    String expected = "A\n";
    String actual = diamond.print();
    assertEquals(expected, actual);
  }

  @Test
  void diamondWithB() {
    Diamond diamond = new Diamond('B');
    String expected = " A\n" + "B B\n" + " A\n";
    String actual = diamond.print();
    assertEquals(expected, actual);
  }