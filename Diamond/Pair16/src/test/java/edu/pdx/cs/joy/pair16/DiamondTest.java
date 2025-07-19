package edu.pdx.cs.joy.pair16;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class DiamondTest
{

  @Test
  void canInstantiateKataClass() {
    new Diamond();
  }

  @Test
  void canGetAsciiValue() {
      int asciiValue = Diamond.getValue('A');
      assertThat(asciiValue, is(0));
  }

  @Test
  void canGetChar() {
      char asciiValue = Diamond.getChar(0);
      assertThat(asciiValue, is('A'));
  }

  @Test
    void testCharStaysTheSame(){
      char b = 'B';
      int asciiValue = Diamond.getValue(b);
      char charValue = Diamond.getChar(asciiValue);
      assertThat(charValue, is('B'));
  }



}
