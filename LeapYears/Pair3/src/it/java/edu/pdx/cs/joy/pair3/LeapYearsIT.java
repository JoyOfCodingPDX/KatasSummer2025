package edu.pdx.cs.joy.pair3;

import edu.pdx.cs.joy.InvokeMainTestCase;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

class LeapYearsIT extends InvokeMainTestCase {

  @Test
  void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(LeapYears.class);
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line arguments"));
  }

  @Test
  void invokingMainWithOnlyOneArgument() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(LeapYears.class, "1998");
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing one command line argument"));
  }

  @Test
  void invokingMainWithStartAndEndYear() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(LeapYears.class, "1998", "2005");
    assertThat(result.getTextWrittenToStandardOut(), containsString("2000 Leap!"));
  }

}
