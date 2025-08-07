package edu.pdx.cs.joy.mob3;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


public class MinesweeperTest
{

  @Test
  void canInstantiateKataClass() {
    new Minesweeper();
  }

  @Test
  void printBlankBoard() {
    Minesweeper game = new Minesweeper();

    int m = 4;
    int n = 4;
    game.createBoard(m, n);

    game.showBoard();  // can we print the 'dot' given the board dimensions

    assertThat(game.board[3][3], equalTo('.'));
  }

  @Test
  void testMinePlacement() {
    Minesweeper game = new Minesweeper();

    int m = 4;
    int n = 4;
    game.createBoard(m, n);
    game.placeMine(2, 3);
    assertThat(game.board[2][3], equalTo('*'));


  }



}
