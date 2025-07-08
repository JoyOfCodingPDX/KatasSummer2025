package edu.pdx.cs.joy.everyone;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

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

}
