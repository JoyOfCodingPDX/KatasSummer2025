package edu.pdx.cs.joy.pair11;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LeapYearsTest
{

  @Test
  void canInstantiateKataClass() {
    new LeapYears();
  }

  // Is it divisible by 400 is a leap year
  @Test
  void isItDivisibleBy400() {
    assertThat(LeapYears.isItLeap(2000), equalTo(true));
    assertThat(LeapYears.isItLeap(400), equalTo(true));
    assertThat(LeapYears.isItLeap(0), equalTo(true));
    assertThat(LeapYears.isItLeap(40000), equalTo(true));
    assertThat(LeapYears.isItLeap(-2000), equalTo(false));
    assertThat(LeapYears.isItLeap(1000), equalTo(false));
    assertThat(LeapYears.isItLeap(1337), equalTo(false));

  }
  // All that is divisible by 100, but by 400 is NOT LEAP year
  @Test
  void isItDivisibleBy100ButNot400() {
    assertThat(LeapYears.isItLeap(1700), equalTo(false));
    assertThat(LeapYears.isItLeap(1800), equalTo(false));
    assertThat(LeapYears.isItLeap(1900), equalTo(false));
    assertThat(LeapYears.isItLeap(2100), equalTo(false));

    assertThat(LeapYears.isItLeap(2000), equalTo(true));
    assertThat(LeapYears.isItLeap(-1700), equalTo(false));
  }

  @Test
  void isItDivisibleBy4ButNot100() {

    assertThat(LeapYears.isItLeap(16), equalTo(true));
    assertThat(LeapYears.isItLeap(196), equalTo(true));
    assertThat(LeapYears.isItLeap(225), equalTo(true));
    assertThat(LeapYears.isItLeap(256), equalTo(true));
    assertThat(LeapYears.isItLeap(100), equalTo(true));
    assertThat(LeapYears.isItLeap(20), equalTo(true));
    assertThat(LeapYears.isItLeap(-20), equalTo(true));
    assertThat(LeapYears.isItLeap(0), equalTo(true));

  }

}
