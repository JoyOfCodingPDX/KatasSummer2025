package edu.pdx.cs.joy.mob2;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
  void firstRPNSampleDiv0() {
    //    20 5 /
    assertThrows(ArithmeticException.class, () -> RPNCalculator.calculate("20 0 /"));
  }

  @Test
  void multipleDigitDivision() {
    //    20 5 2 / /
    assertThat(RPNCalculator.calculate("20 5 2 / /"), equalTo(8.0F));
  }

  @Test
  void simpleAdditionTest() {
    //    4 2 +
    assertThat(RPNCalculator.calculate("4 2 +"), equalTo(6.0F));
  }

  @Test
  void simpleAdditionMinusTest() {
    //    4 2 + 3 -
    assertThat(RPNCalculator.calculate("4 2 + 3 -"), equalTo(3.0F));
  }

  @Test
  void complexArithmeticTest() {
    //    4 2 + 3 -
    assertThat(RPNCalculator.calculate("3 5 8 * 7 + *"), equalTo(141.0F));
  }

  @Test
  void testSQRT() {
    //    4 2 + 3 -
    assertThat(RPNCalculator.calculate("4 SQRT"), equalTo(2.0F));
  }

  @Test
  void testMAXsimple() {
    //    4 2 + 3 -
    assertThat(RPNCalculator.calculate("4 MAX"), equalTo(4.0F));
  }

  @Test
  void testMAXcomplex() {
    //    4 2 + 3 -
    assertThat(RPNCalculator.calculate("5 3 4 2 9 1 MAX 1 +"), equalTo(10.0F));
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
