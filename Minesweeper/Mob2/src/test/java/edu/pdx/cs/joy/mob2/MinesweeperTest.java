package edu.pdx.cs.joy.mob2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MinesweeperTest
{

  @Test
  void canInstantiateKataClass() {
    Minesweeper game = new Minesweeper(0,0);
  }

  @Test
  void addtestlinestorescharactercorrectl(){
    Minesweeper game = new Minesweeper(2,4);

    game.addLine("*..*");

    assertEquals('*',game.minefield[0][0]);
    assertEquals('.', game.minefield[0][1]);
    assertEquals('.', game.minefield[0][2]);
    assertEquals('*', game.minefield[0][3]);
  }

  @Test
  void addtestlinestorescharactercorrect(){
    Minesweeper game = new Minesweeper(2,2);

    game.addLine(".*");
    game.addLine("*.");

    assertEquals('.', game.minefield[0][0]);
    assertEquals('*', game.minefield[0][1]);
    assertEquals('*', game.minefield[1][0]);
    assertEquals('.', game.minefield[1][1]);

  }

  @Test

  void testwithnoreturnzeros(){
    Minesweeper game = new Minesweeper(1,4);
    game.addLine("....");
    game.computeclue();
    assertEquals('0000',game.getclue(0));
  }



}