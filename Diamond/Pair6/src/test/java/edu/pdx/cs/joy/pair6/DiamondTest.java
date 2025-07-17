package edu.pdx.cs.joy.pair6;

import org.junit.jupiter.api.Test;

public class DiamondTest
{

  @Test
  void canInstantiateKataClass() {
    new Diamond();
  }

}


@Test
void returnsSingleAWhenInputIsA() {
  assertEquals("A\n", Diamond.print('A'));
}