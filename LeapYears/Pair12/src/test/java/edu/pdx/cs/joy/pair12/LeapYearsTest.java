package edu.pdx.cs.joy.pair12;

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

  @Test
  void nonLeapYearReturnsFalse() {
    assertThat(LeapYears.check(2019), equalTo(false));
  }

  @Test
  void LeapYear400() {
    assertThat(LeapYears.check(2000), equalTo(true));
  }

  @Test
  void LeapYear100() {
    assertThat(LeapYears.check(1700), equalTo(false));
  }

  @Test
  void LeapYear4() {
    assertThat(LeapYears.check(1804), equalTo(true));
  }

  @Test
  void LeapYearNegative1000000000000000() {
    assertThat(LeapYears.check(-1000000000), equalTo(true));
  }
  @Test
  void LeapYearNegative1000000000000001() {
    assertThat(LeapYears.check(-1000000001), equalTo(false));
  }

}
