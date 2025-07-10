package edu.pdx.cs.joy.pair9;

import org.junit.jupiter.api.Test;

public class LeapYearsTest
{

  @Test
  void canInstantiateKataClass() {
    new LeapYears();
  }

  @Test
  void print2000leapYearValue() {
    assertThat(LeapYears.getLeapYearValue(2000), equalTo(true));
  }

  @Test
  void print2001leapYearValue() {
    assertThat(LeapYears.getLeapYearValue(2001), equalTo(false));
  }

  @Test
  void print2000leapYearValue() {
    assertThat(LeapYears.getLeapYearValue(2000), equalTo(true));
}

