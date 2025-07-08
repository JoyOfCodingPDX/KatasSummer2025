package edu.pdx.cs.joy.everyone;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FizzBuzzTest
{

  @Test
  void printFirstFizzBuzzValue() {
    assertThat(getFizzBuzzValue(1), equalTo("1"));
  }

  private static String getFizzBuzzValue(int number) {
    FizzBuzz fb = new FizzBuzz();
    return fb.getFizzBuzzValue(number);
  }

  @Test
  void printSecondFizzBuzzValue() {
    assertThat(getFizzBuzzValue(2), equalTo("2"));
  }

}
