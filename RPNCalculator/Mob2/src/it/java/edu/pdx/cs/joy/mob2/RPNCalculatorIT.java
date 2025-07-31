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


}
