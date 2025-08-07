package edu.pdx.cs.joy.mob4;

import edu.pdx.cs.joy.InvokeMainTestCase;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

class RPNCalculatorIT extends InvokeMainTestCase {

  @Disabled
  @Test
  void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(RPNCalculator.class);
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line arguments"));
  }
  @Test
  void test_addition() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(RPNCalculator.class, "2", "3", "+");
    assertThat(result.getTextWrittenToStandardOut(), containsString("Addition 3.0 and 2.0 Total: 5.0"));
  }
  @Test
  void test_subtraction() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(RPNCalculator.class, "2", "3", "-");
    assertThat(result.getTextWrittenToStandardOut(), containsString("Subtraction 3.0 and 2.0 Total: 1.0"));
  }


}
