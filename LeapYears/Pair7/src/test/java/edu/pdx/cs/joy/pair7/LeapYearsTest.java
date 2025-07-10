package edu.pdx.cs.joy.pair7;

import org.junit.jupiter.api.Test;

//import static java.util.function.Predicate.isEqual;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class LeapYearsTest
{

  @Test
  void Check1700Year()
  {
    LeapYears leapYears = new LeapYears();
    assertThat(leapYears.isLeapYear(1700), equalTo("is not a leap year"));
  }

  @Test
  void Check1900Year()
  {
    LeapYears leapYears = new LeapYears();
    assertThat(leapYears.isLeapYear(1900), equalTo("is not a leap year"));
  }

  @Test
  void Check2016Year()
  {
    LeapYears leapYears = new LeapYears();
    assertThat(leapYears.isLeapYear(2016), equalTo("is a leap year"));
  }

  @Test
  void Check1600Year()
  {
    LeapYears leapYears = new LeapYears();
    assertThat(leapYears.isLeapYear(1600), equalTo("is a leap year"));
  }

  @Test
  void CheckNegativeYear()
  {
    LeapYears leapYears = new LeapYears();
    assertThat(leapYears.isLeapYear(-1), equalTo("Year cannot be negative"));
  }
}

