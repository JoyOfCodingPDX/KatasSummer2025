package edu.pdx.cs.joy.pair7;

import org.junit.jupiter.api.Test;

import static java.util.function.Predicate.isEqual;
import static org.hamcrest.MatcherAssert.assertThat;

public class LeapYearsTest
{

  @Test
  void checkifdividsibleBy4()
  {
    LeapYears leapYears = new LeapYears();
    assertThat(leapYears.isLeapYear(2025), isEqual("is not a leap year"));
  }
}

