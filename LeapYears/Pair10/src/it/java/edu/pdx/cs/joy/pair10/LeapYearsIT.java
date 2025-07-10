package edu.pdx.cs.joy.pair10;

import edu.pdx.cs.joy.InvokeMainTestCase;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

class LeapYearsIT extends InvokeMainTestCase {

  @Test
  void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(LeapYears.class, "2016", "");
    assertThat(result.getTextWrittenToStandardOut(), containsString("ERROR: Incorrect number of arguments"));
  }

  @Test
  void InvokingMainLeapNotValid(){
    InvokeMainTestCase.MainMethodResult result = invokeMain(LeapYears.class, "2017");
    assertThat(result.getTextWrittenToStandardOut(), containsString("Leap year is not valid 2017"));

  }

  @Test
  void InvokingMainLeapisValid(){
    InvokeMainTestCase.MainMethodResult result = invokeMain(LeapYears.class, "2016");
    assertThat(result.getTextWrittenToStandardOut(), containsString("Leap year is valid 2016"));

  }


}
