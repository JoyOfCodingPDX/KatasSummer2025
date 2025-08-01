package edu.pdx.cs.joy.mob1;

import edu.pdx.cs.joy.InvokeMainTestCase;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

class RPNCalculatorIT extends InvokeMainTestCase {

  @Test
  void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(RPNCalculator.class);
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line arguments"));
  }


  @Test
  void TooFewArguments() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(RPNCalculator.class, "6");
    assertThat(result.getTextWrittenToStandardError(), containsString("Not enough operands/operators for RPNCalculator"));
  }

  @Disabled
    @Test
    void BadData() {
        InvokeMainTestCase.MainMethodResult result = invokeMain(RPNCalculator.class, "f 7 +");
        assertThat(result.getTextWrittenToStandardError(), containsString("first operand is not a number"));
    }
}

