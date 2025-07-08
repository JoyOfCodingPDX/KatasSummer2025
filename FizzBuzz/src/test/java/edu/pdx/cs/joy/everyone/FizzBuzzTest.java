package edu.pdx.cs.joy.everyone;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FizzBuzzTest
{

  @Test
  void printFirstFizzBuzzValue() {
    FizzBuzz fb = new FizzBuzz();
    String test = fb.getFizzBuzzValue(1);
    assertThat(test, equalTo("1"));
  }

}
