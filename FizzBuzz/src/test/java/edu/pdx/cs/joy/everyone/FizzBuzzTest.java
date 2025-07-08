package edu.pdx.cs.joy.everyone;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FizzBuzzTest
{

  @Test
  void printFirstFizzBuzzValue() {
    assertThat(FizzBuzz.getFizzBuzzValue(1), equalTo("1"));
  }

  @Test
  void printSecondFizzBuzzValue() {
    assertThat(FizzBuzz.getFizzBuzzValue(2), equalTo("2"));
  }

  @Test
  void printThirdFizzBuzzValue() {
    assertThat(FizzBuzz.getFizzBuzzValue(3), equalTo("Fizz"));
  }

  @Test
  void printFiveFizzBuzzValue() {
    assertThat(FizzBuzz.getFizzBuzzValue(5), equalTo("Buzz"));
  }

  @Test
  void printFifteenFizzBuzzValue() {
    assertThat(FizzBuzz.getFizzBuzzValue(15), equalTo("FizzBuzz"));
  }

  @Test
  void printZeroFizzBuzzValue() {
    assertThat(FizzBuzz.getFizzBuzzValue(0), equalTo("FizzBuzz"));
  }

  @Test
  void negativeFizzBuzzValue() {
    assertThrows(IllegalArgumentException.class, () -> FizzBuzz.getFizzBuzzValue(-1));
  }

}
