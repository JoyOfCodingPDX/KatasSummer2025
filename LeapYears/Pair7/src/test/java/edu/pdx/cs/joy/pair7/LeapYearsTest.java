package edu.pdx.cs.joy.pair7;

import org.junit.jupiter.api.Test;

//import static java.util.function.Predicate.isEqual;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class LeapYearsTest
{

  @Test
  void checkifdividsibleBy4()
  {
    LeapYears leapYears = new LeapYears();
    assertThat(leapYears.isLeapYear(1700), equalTo("is not a leap year"));
  }

}

