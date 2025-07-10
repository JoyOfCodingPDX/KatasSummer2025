package edu.pdx.cs.joy.pair5;

import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class LeapYearsTest
{

  @Test
  void canInstantiateKataClass() {
    new LeapYears();
  }

  @Test
  void canGetYearAndReturn(){
    assertThat(LeapYears.isLeapYear(2000), equalTo("2000"));
  }
}


