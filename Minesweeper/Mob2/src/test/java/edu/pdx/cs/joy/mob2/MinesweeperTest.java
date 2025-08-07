package edu.pdx.cs.joy.mob2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MinesweeperTest
{

  @Test
  void canInstantiateKataClass() {
    new Minesweeper();
  }

  @Test
  void addtestlinestorescharactercorrectly(){
    Minesweeper game = new Minesweeper(2,4);
    game.addLine("*..*");

    assertEquals('*',game.minefield[0][0]);
  }



  }

}
