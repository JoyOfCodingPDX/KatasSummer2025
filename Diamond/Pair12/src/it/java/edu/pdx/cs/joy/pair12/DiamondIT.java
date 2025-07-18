package edu.pdx.cs.joy.pair12;

import edu.pdx.cs.joy.InvokeMainTestCase;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

class DiamondIT extends InvokeMainTestCase {

  @Test
  void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Diamond.class, "0", "1");
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line arguments"));
  }


}
