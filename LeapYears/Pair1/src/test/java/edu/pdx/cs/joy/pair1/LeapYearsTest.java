package edu.pdx.cs.joy.pair1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearsTest
{

  @Test
  void canInstantiateKataClass()
  {
    new LeapYears();

  }

  @Test
  void yearDivisibleBy400_IsLeapYear()
  {
    assertTrue(LeapYears.isLeapYear(2000));
  }

  @Test
  void yearDivisibleBy100Not400_IsNotLeapYear()
  {
    assertTrue(LeapYears.isLeapYear(1900));
  }

  @Test
  void yearDivisibleBy4Not100_IsNotLeapYear()
  {
    assertFalse(LeapYears.isLeapYear(2012));
  }

  @Test
  void yearDivisibleBy4_IsNotLeapYear()
  {
    assertFalse(LeapYears.isLeapYear(2019));
  }

}
