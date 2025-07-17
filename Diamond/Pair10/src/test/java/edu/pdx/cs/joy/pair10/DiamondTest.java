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

  @Test
  void printThreeRowOfSmallGrid() {
    Diamond test = new Diamond('B');
    String[] arr = {" A ", "B B", " A "};
    String[] output = test.outputDiamond();
    boolean x = true;
    for (int i=0; i < output.length; i++){
      x = x && output[i].equals(arr[i]);
      System.out.println(output[i]);
    }
    assertTrue(x);
  }

  @Test
  void printFiveRowOfSmallGrid() {
    Diamond test = new Diamond('Z');
    String[] arr = {"  A  ", " B B ","C   C", " B B ", "  A  "};
    String[] output = test.outputDiamond();
    boolean x = true;
    for (int i=0; i < output.length; i++){
      x = x && output[i].equals(arr[i]);
      System.out.println(output[i]);
    }
    assertTrue(x);
  }

}
