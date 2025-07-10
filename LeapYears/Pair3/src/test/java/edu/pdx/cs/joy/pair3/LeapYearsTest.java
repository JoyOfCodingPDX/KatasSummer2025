package edu.pdx.cs.joy.pair3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearsTest
{

  @Test
  void canInstantiateKataClass() {
    new LeapYears();
  }

  @Test
  void anyYearIsNotLeapYear() {
    boolean ly = LeapYears.isLeapYear(2025);
    assertTrue(!ly);
  }

  @Test
  void anyYearDivBy4IsLeapYear() {
    boolean ly = LeapYears.isLeapYear(2016);
    assertTrue(ly);
  }

}
