package edu.pdx.cs.joy.pair4;

import edu.pdx.cs.joy.InvokeMainTestCase;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

class DiamondIT extends InvokeMainTestCase {

//  @Test
//  void testLetter(char letter){
//    System.out.println('a' + letter);
//  }//

  @Test
  void CanPrintLetterA() {

    InvokeMainTestCase.MainMethodResult result = invokeMain(Diamond.class, "A");
    assertThat(result.getTextWrittenToStandardOut(), containsString("A"));
  }

  @Test
  void invokingMainWithNonLetterCharacter() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Diamond.class, "-");
    assertThat(result.getTextWrittenToStandardError(), containsString("Illegal character"));
  }


  @Test
  void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Diamond.class);
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line arguments"));
  }


}
