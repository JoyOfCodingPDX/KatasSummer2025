package edu.pdx.cs.joy.pair13;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DiamondTest
{

  @Test
  void canInstantiateKataClass() {
    Diamond displayDiamond = new Diamond('C');
    assertThat(displayDiamond.character, equalTo('C'));
  }
  @Test
  void thatDiamondReturnsNumericalValueOfCharacter() {
    Diamond displayDiamond = new Diamond('C');
    assertThat(displayDiamond.getNumber(), equalTo(3));
  }
  @Test
    void thatDiamondReturnsNumericalValueOfLowerCaseCharacter() {
        Diamond displayDiamond = new Diamond('c');
        assertThat(displayDiamond.getNumber(), equalTo(3));
    }
  @Test
  void cannotUseInvalidCharacter() {
    Diamond displayDiamond = new Diamond('1');
    assertThrows(IllegalArgumentException.class, displayDiamond::getNumber);
  }



}
