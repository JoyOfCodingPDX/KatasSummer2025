package edu.pdx.cs.joy.everyone;

import edu.pdx.cs.joy.InvokeMainTestCase;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

class FizzBuzzIT extends InvokeMainTestCase {

  @Test
  void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(FizzBuzz.class);
    String expectedOut = "1\r\n2\r\nFizz\r\n4\r\nBuzz";
    assertThat(result.getTextWrittenToStandardOut(), containsString(expectedOut));
  }


}
