package edu.pdx.cs.joy.pair10;

import org.junit.jupiter.api.Test;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LeapYearsTest
{

  @Test
  void canInstantiateKataClass() {
    new LeapYears();
  }

  @Test
  void checkCLIAndIsDivBy4(){

    String arg = "5";
    int expected = Integer.parseInt(arg);
    assertEquals(expected, Integer.class);

  }

}
