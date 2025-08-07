package edu.pdx.cs.joy.mob2;

import edu.pdx.cs.joy.InvokeMainTestCase;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

class RPNCalculatorIT extends InvokeMainTestCase {

  @Test
  void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(RPNCalculator.class);
    assertThat(result.getTextWrittenToStandardError(), containsString(""));
  }

  @Test
  void invokeMainWithArguments() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(RPNCalculator.class, "20 5 /");
    assertThat(result.getTextWrittenToStandardOut(), containsString("4.0"));
  }


  @Test
  void invokeMainWithZero() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(RPNCalculator.class, "20 0 /");
    assertThat(result.getTextWrittenToStandardError(), containsString("Division by zero is not allowed"));
  }
  @Test
  void printOnlyOperator(){
    InvokeMainTestCase.MainMethodResult result = invokeMain(RPNCalculator.class, "/");
    assertThat(result.getTextWrittenToStandardError(), containsString("Error: Insufficient operands for operation '/'"));
  }
   @Test
  void moreOperatorsThanOperands() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(RPNCalculator.class, "20 5 / +");
    assertThat(result.getTextWrittenToStandardError(), containsString("Error: Insufficient operands for operation '+'"));
  }

  @Test
  void noArgsPassedIn()
  {
    InvokeMainTestCase.MainMethodResult result = invokeMain(RPNCalculator.class, "");
    assertThat(result.getTextWrittenToStandardError(), containsString("Error"));

  }

  @Test
  void justDigitsPassedIn()
  {
    InvokeMainTestCase.MainMethodResult result = invokeMain(RPNCalculator.class, "3 4 5 6 7 8");
    assertThat(result.getTextWrittenToStandardError(), containsString("Error"));
  }
  @Test
  void somethingRandomInStream()
  {
    InvokeMainTestCase.MainMethodResult result = invokeMain(RPNCalculator.class, "Hi Everyone");
    assertThat(result.getTextWrittenToStandardError(), containsString("Error"));
  }

}
