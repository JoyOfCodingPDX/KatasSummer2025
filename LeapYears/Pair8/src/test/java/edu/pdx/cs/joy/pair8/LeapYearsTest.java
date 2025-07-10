package edu.pdx.cs.joy.pair8;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class LeapYearsTest
{

  @Test
  void canInstantiateKataClass() {
    new LeapYears();
  }

  @Test
  void divisibleByFourIsLeapYear() {
    LeapYears leapYears = new LeapYears();
    boolean isLeapYear = leapYears.isLeapYear(2020);
    assertThat(leapyears.isLeapYear(2020), equalTo(true));
  }
}


