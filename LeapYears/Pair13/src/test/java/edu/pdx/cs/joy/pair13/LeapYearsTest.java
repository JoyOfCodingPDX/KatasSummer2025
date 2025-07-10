package edu.pdx.cs.joy.pair13;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class LeapYearsTest
{

  @Test
  void canInstantiateKataClass() {
    new LeapYears();
  }

  @Test
  void areLeap() {
    assertTrue(LeapYears.isLeapYear(2000));
    assertTrue(LeapYears.isLeapYear(1600));
  }

  @Test
  void divisible100Not400Not() {
    assertFalse(LeapYears.isLeapYear(1900));
    assertFalse(LeapYears.isLeapYear(2100));
  }

  @Test
  void divisible4Not100Are() {
    assertTrue(LeapYears.isLeapYear(1996));
    assertTrue(LeapYears.isLeapYear(2024));
  }

  @Test
  void notDivisibleBy4Are() {
    assertFalse(LeapYears.isLeapYear(2019));
    assertFalse(LeapYears.isLeapYear(2025));
  }


}

