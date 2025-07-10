package edu.pdx.cs.joy.pair7;

import edu.pdx.cs.joy.InvokeMainTestCase;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

class LeapYearsIT extends InvokeMainTestCase {

    @Test
    void invokingMainWithValidYearPrintsLeapYearResult() {
        InvokeMainTestCase.MainMethodResult result = invokeMain(LeapYears.class, "2016");
        String expectedOut = "Year 2016 is a leap year";
        assertThat(result.getTextWrittenToStandardOut(), containsString(expectedOut));
    }

}
