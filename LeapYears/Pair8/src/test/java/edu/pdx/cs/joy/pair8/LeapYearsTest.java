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
    assertThat(LeapYears.isLeapYear(2020), equalTo("2020 is a leap year"));
  }

  @Test
  void divisibleByFourHundredIsLeapYear() {
    assertThat(LeapYears.isLeapYear(2000), equalTo("2000 is a leap year"));
  }

  @Test
  void divisibleByOneHundredIsNotLeapYear() {
      assertThat(LeapYears.isLeapYear(1900), equalTo("1900 is not a leap year"));
  }
}


