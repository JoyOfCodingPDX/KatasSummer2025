package edu.pdx.cs.joy.pair12;

import edu.pdx.cs.joy.InvokeMainTestCase;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

class LeapYearsIT extends InvokeMainTestCase {

  @Test
  void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(LeapYears.class);
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line argument"));
  }

  @Test
  void invokingMainWith400PrintsTrue() {
    String[] args = {"400"};
    InvokeMainTestCase.MainMethodResult result = invokeMain(LeapYears.class, args);
    assertThat(result.getTextWrittenToStandardOut(), containsString("is a leap year"));
  }

  @Test
  void invokingMainWith100PrintsFalse() {
    String[] args = {"100"};
    InvokeMainTestCase.MainMethodResult result = invokeMain(LeapYears.class, args);
    assertThat(result.getTextWrittenToStandardOut(), containsString("is not a leap year"));
  }

  @Test
  void invokeMainWith400PrintsValue() {
    String[] args = {"400"};
    InvokeMainTestCase.MainMethodResult result = invokeMain(LeapYears.class, args);
    assertThat(result.getTextWrittenToStandardOut(), containsString("400"));
  }

  @Test
  void invokeMainWith2PrintsValue() {
    String[] args = {"2"};
    InvokeMainTestCase.MainMethodResult result = invokeMain(LeapYears.class, args);
    assertThat(result.getTextWrittenToStandardOut(), containsString("is not a leap year"));
  }

}
