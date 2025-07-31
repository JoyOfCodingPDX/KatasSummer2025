package edu.pdx.cs.joy.mob1;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class RPNCalculatorTest {

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

  @Test
  void subtractionTest() {
    RPNCalculator rpn = new RPNCalculator();
    int result = rpn.evaluate("35 30 -");
    assertThat(result, equalTo(5));
  }

  @Test
  void multiplicationTest() {
    RPNCalculator rpn = new RPNCalculator();
    int result = rpn.evaluate("6 7 *");
    assertThat(result, equalTo(42));
  }

  @Test
  void divisionTest() {
    RPNCalculator rpn = new RPNCalculator();
    int result = rpn.evaluate("20 5 /");
    assertThat(result, equalTo(4));
  }
}
