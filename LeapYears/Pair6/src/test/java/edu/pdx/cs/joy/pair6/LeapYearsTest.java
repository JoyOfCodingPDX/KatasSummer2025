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

  @Test
  void yearDivisibleBy4isLeapYear() {
    LeapYears leapyears3 = new LeapYears();
    assertThat(leapyears3.isLeapYear(2016), equalTo(true));
  }

  @Test
  void yearDivisibleBy100isLeapYear() {
    LeapYears leapyears4 = new LeapYears();
    assertThat(leapyears4.isLeapYear(2000), equalTo(true));
  }

  @Test
  void yearDivisibleBy400isLeapYear() {
    LeapYears leapyears5 = new LeapYears();
    assertThat(leapyears5.isLeapYear(2400), equalTo(true));
  }
}
