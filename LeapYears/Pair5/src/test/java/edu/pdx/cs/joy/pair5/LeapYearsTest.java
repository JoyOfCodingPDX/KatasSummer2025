package edu.pdx.cs.joy.pair5;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class LeapYearsTest
{

  @Test
  void canInstantiateKataClass() {
    new LeapYears();
  }

  @Disabled
  void canGetYearAndReturn(){
    assertThat(LeapYears.isLeapYear(2000), equalTo("2000"));
  }

  @Test
  void assert2000IsALeapYear(){
    assertThat(LeapYears.isLeapYear(2000), equalTo("2000 is a Leap Year."));
  }

  @Test
  void assert1700isNotALeapYear(){
    assertThat(LeapYears.isLeapYear(1700), equalTo("1700 is not a Leap Year."));
  }

  @Test
  void assert2008isALeapYear(){
    assertThat(LeapYears.isLeapYear(2008), equalTo("2008 is a Leap Year."));
  }
}


