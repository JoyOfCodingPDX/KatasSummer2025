package edu.pdx.cs.joy.pair8;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.stringContainsInOrder;

public class LeapYearsTest
{

  @Test
  void canInstantiateKataClass() {
    new LeapYears();
  }

  @Test
  void divisibleByFourIsLeapYear() {
    LeapYears leapYears = new LeapYears();
    String isLeapYear = leapYears.isLeapYear(2020);
    assertThat(leapYears.isLeapYear(2020), equalTo("2020 is a leap year"));
  }

}


