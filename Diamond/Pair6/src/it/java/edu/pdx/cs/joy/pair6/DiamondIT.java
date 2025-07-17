package edu.pdx.cs.joy.pair6;

import edu.pdx.cs.joy.InvokeMainTestCase;
import org.junit.jupiter.api.Test;

import static java.util.function.Predicate.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

class DiamondIT extends InvokeMainTestCase {

  @Test
  void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Diamond.class);
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line arguments"));
  }
  
  @Test
  void mainWithBPrintsDiamond() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Diamond.class, "B");
    String expected =
            " A\n" +
                    "B B\n" +
                    " A\n";
    assertThat(result.getTextWrittenToStandardOut(), containsString(expected));
  }

  @Test
  void mainWithInvalidCharacterPrintsError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Diamond.class, "1");
    assertThat(result.getTextWrittenToStandardError(), containsString("Input must be a letter"));
  }






}
