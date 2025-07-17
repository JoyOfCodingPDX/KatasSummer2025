package edu.pdx.cs.joy.pair13;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class DiamondTest
{

  @Test
  void canInstantiateKataClass() {
    Diamond displayDiamond = new Diamond('C');

    assertThat(displayDiamond.character, equalTo('C'));
  }

}
