package edu.pdx.cs.joy.pair10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiamondTest
{

  // @Test
  // void canInstantiateKataClass() {
  //   new Diamond();
  // }

  @Test
  void constructorWithALetter() {
    Diamond test = new Diamond('A');
  }

  @Test
  void printFirstRowOfSmallGrid() {
    Diamond test = new Diamond('B');
    assertEquals(test.outputDiamond(), " A ");
  }

}
