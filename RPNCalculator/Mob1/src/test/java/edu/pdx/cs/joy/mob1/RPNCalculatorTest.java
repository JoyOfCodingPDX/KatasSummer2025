package edu.pdx.cs.joy.mob1;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class RPNCalculatorTest
{

  @Test
  void canInstantiateKataClass() {
    new RPNCalculator();
  }

  @Test
  void additionTest() {
    RPNCalculator rpn = new RPNCalculator();
    int result = rpn.evaluate("20 5 +");
    assertThat(result, equalTo(25));
  }

}
