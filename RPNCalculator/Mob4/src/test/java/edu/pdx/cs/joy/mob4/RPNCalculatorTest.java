package edu.pdx.cs.joy.mob4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RPNCalculatorTest
{

  @Test
  void canInstantiateKataClass() {
    new RPNCalculator();
  }

  @Test
  void evaluatesaddition(){
    RPNCalculator calc=new RPNCalculator();
    assertEquals(7.0,calc.addition(4.0, 3.0));
  }

  @Test
  void stackExist(){
    RPNCalculator calc=new RPNCalculator();
    calc.numberStack.push(7.0);
    assertEquals(7.0,calc.numberStack.pop());
  }

}


