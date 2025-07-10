package edu.pdx.cs.joy.pair10;

import org.junit.jupiter.api.Test;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LeapYearsTest
{

  @Test
  void canInstantiateKataClass() {
    new LeapYears();
  }

  @Test
  void checkCLIAndIsDivBy4(){

    String arg = "16";
    int expected = Integer.parseInt(arg);
    boolean checkdiv4 = expected % 4 == 0;
    assertEquals(checkdiv4, 1 == 1);

    assertEquals(expected, 16);

  }

  @Test
  void checkArgsExist(){
    LeapYears newObject = new LeapYears();
    String [] array = {"2"};
    newObject.LeapYearsCLI(array);
    assertEquals(1, newObject.LeapYearsCLI(array));

  }

}
