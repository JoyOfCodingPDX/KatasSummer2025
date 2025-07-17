package edu.pdx.cs.joy.pair16;

import edu.pdx.cs.joy.InvokeMainTestCase;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

class DiamondIT extends InvokeMainTestCase {

  @Test
  void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Diamond.class);
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line arguments"));
  }

  @Test
  void invokingMainWithAProducesADiamond() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Diamond.class, "A");
    assertThat(result.getTextWrittenToStandardOut(), containsString("A"));
  }

  @Test
  void invokingMainWithBProducesADiamond() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Diamond.class, "B");
    assertThat(result.getTextWrittenToStandardOut(), containsString("A"));
  }


}
