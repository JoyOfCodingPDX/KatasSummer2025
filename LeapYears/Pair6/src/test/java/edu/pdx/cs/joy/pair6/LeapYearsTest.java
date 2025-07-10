package edu.pdx.cs.joy.pair6;

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
  void canRunIsLeapYear(){
    LeapYears leapyear1 = new LeapYears();
    assertThat(leapyear1.isLeapYear(1582), equalTo(false));
  }



  @Test
  void yearNotDivisibleBy4IsNotLeapYear() {
    LeapYears LeapYears2 = new LeapYears();
    assertThat(LeapYears2.isLeapYear(2017), equalTo(false));
  }
}
