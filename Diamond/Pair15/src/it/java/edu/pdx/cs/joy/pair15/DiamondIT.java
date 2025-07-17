package edu.pdx.cs.joy.pair15;

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
  void invokingMainWithTooManyArgumentsPrintsTooStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Diamond.class, "A", "B");
    assertThat(result.getTextWrittenToStandardError(), containsString("Too many command line arguments"));
  }
  @Test
  void commandLineArgumentsArePassedToMain() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Diamond.class, "A");
    assertThat(result.getTextWrittenToStandardOut(), containsString("A"));
  }

  @Test
  void printRangeofLetter() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Diamond.class, "C");
    assertThat(result.getTextWrittenToStandardOut(), containsString("A" + System.lineSeparator()));
    assertThat(result.getTextWrittenToStandardOut(), containsString("B" + System.lineSeparator()));
    assertThat(result.getTextWrittenToStandardOut(), containsString("C" + System.lineSeparator()));
  }

  @Test
  void printDouble() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Diamond.class, "C");
    assertThat(result.getTextWrittenToStandardOut(), containsString("A" + System.lineSeparator()));
    assertThat(result.getTextWrittenToStandardOut(), containsString("BB" + System.lineSeparator()));
    assertThat(result.getTextWrittenToStandardOut(), containsString("CC" + System.lineSeparator()));
  }

  @Test
  void printDoubleReverse() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Diamond.class, "C");
    assertThat(result.getTextWrittenToStandardOut(), containsString("A" + System.lineSeparator()));
    assertThat(result.getTextWrittenToStandardOut(), containsString("BB" + System.lineSeparator()));
    assertThat(result.getTextWrittenToStandardOut(), containsString("CC" + System.lineSeparator()));
    assertThat(result.getTextWrittenToStandardOut(), containsString("BB" + System.lineSeparator()));
    assertThat(result.getTextWrittenToStandardOut(), containsString("A" + System.lineSeparator()));


  }



}
