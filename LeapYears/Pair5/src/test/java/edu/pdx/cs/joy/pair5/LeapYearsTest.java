package edu.pdx.cs.joy.pair5;

import org.junit.jupiter.api.Test;

import static com.google.common.base.Predicates.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class LeapYearsTest
{

  @Test
  void canInstantiateKataClass() {
    new LeapYears();
  }

  @Test
  void canGetYearAndReturn(){
    LeapYears leapYears = new LeapYears();
    String result = leapYears.isLeapYear(2000);
    assertThat(result, null);
  }
}


