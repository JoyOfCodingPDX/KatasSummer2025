package edu.pdx.cs.joy.mob2;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class RPNCalculatorTest
{

  @Test
  void canInstantiateKataClass() {
    new RPNCalculator();
  }

  @Test
  void firstRPNSample() {
    //    20 5 /
    assertThat(RPNCalculator.calculate("20 5 /"), equalTo(4.0F));
  }

  @Test
  void multipleDigitDivision() {
    //    20 5 2 / /
    assertThat(RPNCalculator.calculate("20 5 2 / /"), equalTo(8.0F));
  }

  @Test
  void testIsDigitTrue() {
    assertThat(RPNCalculator.isDigit("20"), equalTo(true));
  }

  @Test
  void testIsDigitFalse() {
    assertThat(RPNCalculator.isDigit("HI"), equalTo(false));
  }



}
