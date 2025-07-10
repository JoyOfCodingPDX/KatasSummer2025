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

  @Test
  void invokeMainWith2ArgsPrintsValue() {
    String[] args = {"2", "4"};
    InvokeMainTestCase.MainMethodResult result = invokeMain(LeapYears.class, args);
    assertThat(result.getTextWrittenToStandardOut(), containsString("is not a leap year"));
    assertThat(result.getTextWrittenToStandardOut(), containsString("is a leap year"));
  }

  @Test
  void invokeMainWith2FalsePrintsValue() {
    String[] args = {"2", "3"};
    InvokeMainTestCase.MainMethodResult result = invokeMain(LeapYears.class, args);
    assertThat(result.getTextWrittenToStandardOut(), containsString("2 is not a leap year"));
    assertThat(result.getTextWrittenToStandardOut(), containsString("3 is not a leap year"));
  }

  @Test
  void invokeMainWithOneBillionPrintsValue() {
    String[] args = {"1000000000"};
    InvokeMainTestCase.MainMethodResult result = invokeMain(LeapYears.class, args);
    assertThat(result.getTextWrittenToStandardError(), containsString("Leap years should be less than 1000000000"));
  }

  @Test
  void invokeMainWithDecimalPrintsError() {
    String[] args = {"1099.2"};
    InvokeMainTestCase.MainMethodResult result = invokeMain(LeapYears.class, args);
    assertThat(result.getTextWrittenToStandardError(), containsString("Cannot parse a non-integer"));
  }

}
